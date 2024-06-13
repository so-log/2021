const express = require('express');
const middle1 = require('./middleware/middle1');
// const middle2 = require('./middleware/middle2');
// const { joinValidator, loginValidator } = require('./middleware/middle2');
// const app = express();
const middle3 = require('./middleware/middle3');

const app = express();

// app.use(middle1);
// app.use(joinValidator);
// app.use(loginValidator);
app.use(middle3('인수1'));
app.use(middle3('인수2'));
app.use(middle3('인수3'));

app.use((req, res, next) => {
    console.log("공통 라우터");
    // return res.send("가장상단");
    next();
});

app.get("/", middle1, (req, res, next) => {
    console.log("1번째");
    // const error = new Error('1번째 미들웨어에서 발생시킨 에러!');
    // throw error;
    // next(error);
    next();
});

app.get("/", (req, res, next) => {
    console.log("2번째");
    next();
});

app.get("/", (req, res, next) => {
    console.log("3번째");
    next();
}, (req, res, next) => {
    console.log("4번째");
    next();
}, (req, res, next) => {
    console.log("5번째");
    next();
}, (req, res) => {
    console.log("6번째");
    return res.send("6번째 미들웨어에서 출력...");
});

app.get("/text", (req, res) => {
    return res.send("/test 페이지...");
});

// 없는 페이지
app.use((req, res, next) => {
    const error = new Error('없는 페이지...');
    next(error);
});

// 오류 처리 라우터
app.use((err, req, res, next) => {
    return res.send(err.message);
});

app.listen(3000, () => {
    console.log("3000번 포트에서 서버 대기중...");
});