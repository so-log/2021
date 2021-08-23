const app = require('express')();
const bootStrap = require('./boot');
const cookieParser = require('cookie-parser');

app.use(bootStrap);
app.use((req, res , next) => {
    // 상단 라우터 .use
    // 공통, 공유 라우터 > 보조적인 역할 > 실제 처리는 해당하는 라우터 > next로 미들웨어 이동이 필요
    console.log("사이트 로딩시 공통으로 처리할 부분이나, 기능 추가");
    next();
});

// 미들웨어를 외부로 빼서 공통 라우터에 등록 > 기능 확장, 기능 추가

app.get("/member" , (req, res, next) => {
    return res.send("회원 페이지...");
    // next();
});

app.use((req, res) => {
    // 없는 url은 가장 하단의 공통 라우터에 매칭 > 없는 페이지 처리 미들웨어
    return res.send("없는 페이지 입니다.");
});

/*
app.get("/", (req, res) => {
    return res.send("첫번째");
});

app.get("/", (req, res) => {
    return res.send("두번째");
});
*/

/*
const memberRouter = require('./member');
app.use("/member", memberRouter);
*/

/*
app.get("/", (req, res,next) => {
    console.log("1번 미들웨어");
    next();
}, (req, res, next) => {
    console.log("2번 미들웨어");
    next();
}, (req, res) => {
    console.log("3번 미들웨어");
});
*/

/*
app.get("/", (req, res, next) => {
    // 미들웨어는 request 요청 데이터 분석 > 분석 > response 객체 출력
    const text = req.url + ":" + req.method;

    return res.send(text);
});
*/

/*
app.get("/", (req, res, next) => {
    console.log("첫번째 미들웨어");
    next();
});

app.get("/test", (req, res, next) => {
    console.log("테스트1 미들웨어");
    next();
});

app.get("/test", (req, res) => {
    console.log("테스트2 미들웨어");
});

app.get("/", (req, res, next) => {
    console.log("두번째 미들웨어");
    next();
});

app.get("/", (req, res) => {
    return res.send("세번째 미들웨어");
});
*/

app.listen(3000, () => {
    console.log("서버 대기중...");
});
