const { alert } = require("../lib/common");
const logger = require("../lib/logger");
const fs = require('fs').promises;
const constants = require('fs').constants;
const path = require('path');



/** 회원가입 유효성 검사 */
module.exports.joinValidator = async (req, res, next) => {
	try {
		const required = {
			memId : "아이디를 입력하세요.",
			memPw : "비밀번호를 입력하세요.",
			memPwRe : "비밀번호를 확인해 주세요.",
			memNm : "회원명을 입력해 주세요.",
		};
		
		for (key in required) {
			if (!req.body[key]) {
				throw new Error(required[key]);
			}
		}
		
		if (req.body.memId.length < 8) {
			throw new Error('아이디는 8자리 이상 입력해 주세요.');
		}
		
		if (req.body.memPw.length < 8) {
			throw new Error('비밀번호는 8자리 이상 입력해 주세요.');
		}
		
		if (req.body.memPw != req.body.memPwRe) {
			throw new Error('비밀번호 확인이 일치하지 않습니다.');
		}
		
		/** 회원 중복 여부 체크 */
		try { 
			const filePath = path.join(__dirname, "../data/member/", req.body.memId + ".json");
			await fs.access(filePath, constants.F_OK);

			// 파일이 존재하면 -> 회원 중복 
			return alert("이미 가입된 회원입니다. - " + req.body.memId, res, true);
		} catch(e) { // 파일이 미 존재 -> 문제 없음
			console.log(e);
		}
		
	} catch (err) {
		logger(err.message, 'error');
		return alert(err.message, res, true);
	}
	next();
};

/** 로그인 유효성 검사 */
module.exports.loginValidator = (req, res, next) => {
	try {
		if (!req.body.memId) {
			throw new Error("아이디를 입력하세요.");
		}
		
		if (!req.body.memPw) {
			throw new Error("비밀번호를 입력하세요.");
		}
		
	} catch(err) {
		return alert(err.message, res, true);
	}
	next();
};