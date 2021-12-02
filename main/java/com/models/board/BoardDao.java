package com.models.board;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.core.*;
import com.models.board.*;
import com.models.file.*;
import com.models.member.*;

public class BoardDao {
	private static BoardDao instance = new BoardDao();

	private BoardDao() {
	}

	public static BoardDao getInstance() {
		if (instance == null) {
			instance = new BoardDao();
		}

		return instance;
	}

	public int add(HttpServletRequest request) throws Exception {

		/** 유효성 검사 **/
		checkData(request);
		
		Member member = (Member)request.getAttribute("member");
		
		int num = 0;
		String sql = "INSERT INTO board (gid, status, postTitle, content, memId, isNotice) VALUES(?,?,?,?,?,?)";
		try (Connection conn = DB.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			request.setCharacterEncoding("UTF-8");
			String gid = request.getParameter("gid");
			String status = request.getParameter("status");
			String postTitle = request.getParameter("postTitle");
			String content = request.getParameter("content");
			String memId = member.getMemId();
			int isNotice = 0;
			if (request.getParameter("isNotice") != null) {
				isNotice = Integer.valueOf(request.getParameter("isNotice"));
			}

			pstmt.setLong(1, Long.valueOf(gid));
			pstmt.setString(2, status);
			pstmt.setString(3, postTitle);
			pstmt.setString(4, content);
			pstmt.setString(5, memId);
			pstmt.setInt(6, isNotice);

			int result = pstmt.executeUpdate();
			if (result > 0) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if (rs.next()) {
					num = rs.getInt(1);
				}
				rs.close();
				
				FileDao.getInstance().updateFinish(gid);
			}
		} catch (IOException | SQLException | ClassNotFoundException e) {
			Logger.log(e);
		}

		return num;
	}

	public int getTotal() {
		int total = 0;

		String sql = "SELECT COUNT(*) cnt from board";
		try (Connection conn = DB.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				total = rs.getInt("cnt");
			}

			rs.close();

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return total;
	}

	public ArrayList<Board> getList(int page, int limit) {
		ArrayList<Board> list = new ArrayList<Board>();
		page = (page <= 0) ? 1 : page;
		limit = (limit <= 0) ? 15 : limit;

		int offset = (page - 1) * limit;
		// System.out.println(offset + " : " + limit);
		String sql = "SELECT * FROM board ORDER BY isNotice DESC, regDt DESC LIMIT ?,?";
		try (Connection conn = DB.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {

			pstmt.setInt(1, offset);
			pstmt.setInt(2, limit);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new Board(rs));
			}
			rs.close();

		} catch (SQLException | ClassNotFoundException e) {
			Logger.log(e);
		}
		return list;
	}

	public ArrayList<Board> getList(int page) {
		return getList(page, 15);
	}

	public ArrayList<Board> getList(HttpServletRequest request) {
		int page = 1;
		if (request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		return getList(page);
	}

	public Board get(int postNm) {

		Board board = null;
		String sql = "SELECT * FROM board WHERE postNm = ?";
		try (Connection conn = DB.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, postNm);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				board = new Board(rs);
			}
			rs.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return board;
	}

	public Board get(HttpServletRequest request) {
		int postNm = 0;
		if (request.getParameter("postNm") != null) {
			postNm = Integer.valueOf(request.getParameter("postNm"));
		}
		return get(postNm);
	}

	public boolean edit(HttpServletRequest request) throws Exception {

		/** 유효성 검사 **/
		checkData(request);

		String sql = "UPDATE board SET postTitle=?, status =?, content=?, isNotice = ? WHERE postNm=?";
		try (Connection conn = DB.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			request.setCharacterEncoding("UTF-8");
			int postNm = Integer.parseInt(request.getParameter("postNm").trim());
			int isNotice = 0;
			if (request.getParameter("isNotice") != null) {
				isNotice = Integer.valueOf(request.getParameter("isNotice"));
			}
			pstmt.setString(1, request.getParameter("postTitle"));
			pstmt.setString(2, request.getParameter("status"));
			pstmt.setString(3, request.getParameter("content"));
			pstmt.setInt(4, isNotice);
			pstmt.setInt(5, postNm);

			int rs = pstmt.executeUpdate();
			if (rs > 0) {
				FileDao.getInstance().updateFinish(request.getParameter("gid"));
				return true;
			}
		} catch (Exception e) {
			Logger.log(e);
		}

		return false;
	}

	public boolean delete(int postNm) throws Exception {
		
		/**
		 *  1. 로그인 여부
		 *  2. 게시글 조회 -> 게시글 존재 유부, 게시글에 등록된 아이디와 로그인한 아이들 비교
		 *  3. 일치하는 경우만 삭제(본인 게시글만 삭제 가능) 
		 */ 
		HttpServletRequest request = Req.get();
		if (!MemberDao.isLogin(request)) {
			throw new Exception("로그인 후 삭제가 가능합니다."); 
		}
		
		Board board = get(postNm);
		if (board == null) {
			throw new Exception("존재하지 않는 게시글 입니다.");
		}
		
		Member member = (Member)request.getAttribute("member");
		if (!member.getMemId().equals(board.getMemId())) {
			throw new Exception("본인이 작성한 게시글만 삭제할 수 있습니다.");
		}
		
		String sql = "DELETE FROM board WHERE postNm=?";
		ArrayList<DBField> bindings = new ArrayList<>();
		bindings.add(DB.setBinding("Integer", String.valueOf(postNm)));
		int rs = DB.executeUpdate(sql, bindings);
		
		/** 게시글 DB 삭제 후 업로드된 이미지 파일 삭제 */
		if (rs > 0) {
			FileDao.getInstance().deleteByGid(board.getGid());
		}
		
		return (rs > 0)?true:false;
	}
	
	public boolean delete(String postNm) throws Exception {
		return delete(Integer.valueOf(postNm));
	}
	
	
	public void checkData(HttpServletRequest req) throws Exception {
		if (!MemberDao.isLogin(req)) {
			throw new Exception("로그인이 필요한 서비스입니다.");
		}
		
		String[] required = {
				"gid//잘못된 접근입니다",
				"status//어떤게시글인지 정해주세요.", 
				"postTitle//글 제목을 입력해주세요.", 
				"content//내용을 입력해주세요." 
			};
		for (String s : required) {
			String[] re = s.split("//");
			if (req.getParameter(re[0]) == null || req.getParameter(re[0]).trim().equals("")) {
				throw new Exception(re[1]);
			}
		}
	}
	
	/**
	 * 게시글 조회수 업데이트
	 * 
	 * @param postNm
	 */
	public void updateViewCnt(int postNm) {
		String browserId = CommonLib.getBrowserId();
		try {
			String sql = "INSERT INTO boardview VALUES (?, ?)";
			ArrayList<DBField> bindings = new ArrayList<>();
			bindings.add(DB.setBinding("Integer", String.valueOf(postNm)));
			bindings.add(DB.setBinding("String", String.valueOf(browserId)));
			
			DB.executeUpdate(sql, bindings);
			
			sql = "UPDATE board a SET a.viewCnt = (SELECT COUNT(*) FROM boardview b WHERE a.postNm = b.postNm) WHERE a.postNm = ?";
			bindings = new ArrayList<DBField>();
			bindings.add(DB.setBinding("Integer", String.valueOf(postNm)));
			DB.executeUpdate(sql, bindings);
			
		} catch (Exception e) {}
	}
}
