const express = require('express');
const router = express.Router();

router.get("/list", (req, res) => {
    return res.send("상품목록 페이지...");
});

router.get("/view", (req, res) => {
    return res.send("상품상세정보 페이지...");
});

module.exports = router;