const express = require('express');
const router = express.Router();

// 회원가입
router.route("/join")
    .get((req, res) => {
        // 회원가입 양식
    })
    .post((req, res) => {
        // 회원가입 처리
    });

// 로그인
router.route("/login")
    .get((req, res) => {
        // 로그인 양식
    })
    .post((req, res) => {
        // 로그인 처리
    });

module.exports = router;