const express = require('express');
const { joinValidator, loginValidator } = require('../middleware/validator');
const { alert } = require("../lib/common");
const member = require("../models/member");
const router = express.Router();

//회원가입
router.route("/join")
	.get((req, res) => {
		 // 회원 가입 양식 
		 
		 return res.render("member/join");
	})
	.post(joinValidator, async (req, res) => {
		const result = await member.join(req.body);
		if (result) { // 회원 가입 성공 
			return res.redirect("/member/login");
		}
		
		// 회원 가입 실패 
		return alert("회원가입에 실패하였습니다.", res, true);
		
	});

router.route("/login")
	.get((req, res) => {
		// 로그인 양식
		return res.render("member/login");
	})
	.post(loginValidator, async (req, res) => {
		// 로그인 처리 
		const result = await member.login(req.body.memId, req.body.memPw, req);
		if (result) { // 로그인 성공 -> 메인페이지
			return res.redirect("/");
		}
		
		return alert('로그인에 실패하였습니다.', res, true);
	});

router.get("/logout", (req, res) => {
	// 로그아웃 처리 
	req.session.destroy();
	
	return res.redirect("/");
});

module.exports = router;