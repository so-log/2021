const express = require('express');
const dotenv = require('dotenv');
const morgan = require('morgan');
const path = require('path');
const app = express();

dotenv.config(); // 설정된 환경 변수 > process.env 하위 속성으로 추가
app.set('PORT', process.env.PORT || 3000);

app.use(morgan('dev')); // 콘솔에 접속 관련 정보 로그

// 미들웨어
const memberInfo = require("./middleware/member_info"); // 미들웨어 방식1
//const validator = require("./middleware/validator"); // 미들웨어 방식2 - 여러개 등록
//console.log(validator);
const { joinValidator, updateValidator, loginValidator } = require("./middleware/validator");
const dataCheck = require('./middleware/data_check'); // 미들웨어 방식3 

// body-parser 등록
app.use(express.json());
app.use(express.urlencoded({ extended : false }));

// 라우터
const memberRouter = require("./routes/member"); //라우터 등록
const goodsRouter = require("./routes/goods"); //라우터 등록
const orderRouter = require("./routes/order"); //라우터 등록

// 정적 페이지 설정
// app.use("/images", express.static(path.join(__dirname, "images")));
// app.use("/images", express.static(path.join(__dirname, "images")));
app.use(express.static(path.join(__dirname, "public")));

// 라우터 등록
app.use("/member", memberRouter);
app.use("/goods", goodsRouter);
app.use("/order", orderRouter);

/** 미들웨어 방식1 등록 */
// app.use(memberInfo);

/** 미들웨어 방식2 등록 */
//app.use(validator.joinValidator);
//app.use(validator.updateValidator);
//app.use(validator.loginValidator);
// app.use(joinValidator);
// app.use(updateValidator);
// app.use(loginValidator);

/** 미들웨어 방식3 등록 */
app.use(dataCheck("데이터1"));

// 기본 페이지 라우터
/*
app.get("/", (req, res) => {
    // console.log("req.query", req.query);
    // return res.send("");
    return res.sendFile(path.join(__dirname, "index.html"));
});

app.post("/", (req, res) => {
    console.log("req.body", req.body);
    return res.send("");
});
*/
app.route("/")
    .get((req, res) => {
        return res.sendFile(path.join(__dirname, "index.html"));
    })
    .post((req, res) => {
        console.log("req.body", req.body);
        return res.send("");
    });

// 메인 페이지
/*
app.get("/", dataCheck("미들웨어1"), (req, res, next) => {
    // return res.send("<h1>기본 페이지</h1>");
    //return res.send(`<h1>${req.data1}</h1>`);
	//return res.send(`<h1>${res.data1}</h1>`);
	next();
}, dataCheck("미들웨어2"), dataCheck("미들웨어3"));
*/
/*
app.get("url", upload.single('image'), (req, res, next) => {
	
});
*/


// 없는 페이지 라우터
app.use((req, res, next) => {
    const err = new Error(`${req.url}은 없는 페이지 입니다`);
    err.status = 404;
    next(err); // === throw (err);
});

// 오류 처리 라우터
app.use((err, req, res, next) => {

    return res.status(err.status || 500).send(err.message);
});

app.listen(app.get('PORT'), () => {
    console.log(app.get('PORT'), "번 포트에서 서버 대기중...");
});