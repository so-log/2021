const express = require('express');
const router = express.Router();

// 게시글 쓰기 /board 
// 게시글 수정 /board/:id(게시글번호) 
// 게시글 보기 /board/view/:id(게시글 번호)
// 게시글 목록 /board/list

router.route("/")
    .get((req, res) => {
        // 게시글 등록 양식(form)
        return res.render("board/form");
    })
    .post((req, res) => {
        // 게시글 등록 처리
    });

// board/list
router.get("/list", (req, res) => {
    return res.send("게시글 목록");
});

// board/:id
router.route("/:id")
    .get((req, res) => {
        // 게시글 수정 양식
        return res.send("게시글 수정" + req.params.id);
    })
    .post((req, res) => {
        // 게시글 수정

    });

// board/view/:id
router.route("/board/view/:id", (req, res) => {

});


module.exports = router;