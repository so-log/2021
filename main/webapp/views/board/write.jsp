<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.models.Dto" %>
<%
	String rootURL = (String)request.getAttribute("rootURL");
%>
<c:set var="rootURL" value="<%=rootURL%>" />
<script src="<%=rootURL%>/resources/js/form.js"></script>
<!-- 임시로css링크 넣어둠 -->
<link href='<%=rootURL%>/resources/css/write.css' rel='stylesheet' type='text/css' />

<div class="writebox">
<form class="write-form" name='writeFrm' method="post" action="write" target='ifrmHidden' autocomplete='off'>
		<input type='hidden' name='memId' value="${member.memId}"/>	
		<div class="category_box">
			<select name="status" class="select_btn">
				<option value="게시판1">전체</option>
				<option value="normal">일반</option>
				<option value="tip">팁과 정보</option>
			</select>
		</div>
		<div class="text_box">
			<input type="text" name="postTitle" placeholder="제목을 입력해주세요." value="<c:out value='${board.subject}' />">

		</div>
			<textarea id='content' name="content" width="700" height="500"><c:out value="${board.content}" /></textarea>
			<span class='addImage'>이미지 추가</span>
			<br>
	
	<c:choose>
		<c:when test='${board == null}'>
		<input type="submit" value="작성하기">
		</c:when>
		<c:otherwise>
		<input type="submit" value="수정하기">
		</c:otherwise>
	</c:choose>
	<input type="reset" value="취소하기">
</form>
</div>
