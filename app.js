const express = require('express');
const nunjucks = require('nunjucks');
const multer = require('multer');
const path = require('path');

const app = express();

app.set("view engine", "html");
nunjucks.configure(path.join(__dirname, 'views'), {
    express: app,
    watch: true,
});

const upload = multer({
    storage: multer.diskStorage({
        destination(req, file, done) {
            // 파일이 저장될 폴더명
            done(null, path.join(__dirname, "upload"));
        },
        filename(req, file, done) {
            // 파일이 저장되는 파일명 관련 설정
            const ext = path.extname(file.originalname);
            const filename = path.basename(file.originalname, ext);
            const newFileName = `${filename}_${Date.now()}${ext}`;
            done(null, newFileName);
        }
    }),// 저장 경로, 파일 관련 설정
    limits: {fileSize : 10*1024*1024}, // 10mb 최대 업로드 용량
});

// upload
// .single("name 명") - 단일 파일 업로드
// .array("name명") - 복수 파일 업로드 ( multiple 속성으로 여러개 업로드 하는 경우)
// .fields([{ name : "name명" }, { name : "name명" }]) - 복수 파일 업로드 (각각의 name별로 업로드 하는 경우)

app.get("/file1", (req, res) => {
    return res.render("file1");
});

app.post("/file1", upload.single("image"), (req, res) => {
    // 파일 정보 - 단일 파일 -req.file
    console.log(req.file);
    return res.send("");
});

app.get("/file2", (req, res) => {
    return res.render("file2");
});

app.post("/file2", upload.array("images"), (req, res) => {
    // 복수개 파일 업로드 - req.files
    console.log(req.files);
    return res.send("");
});

app.get("/file3", (req, res) => {
    return res.render("file3");
});

app.post("/file3", upload.fields([{ name: "image1" }, { name : "image2" }]), (req, res) => {
    // 복수개 파일 > req.files
    console.log(req.files);
    return res.send("");

});

app.listen(3000, () => {
    console.log("서버 대기중...");
});