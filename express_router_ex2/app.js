const express = require('express');
const dotenv = require('dotenv');
const morgan = require('morgan');
const path = require('path');
const nunjucks = require('nunjucks');

const app = express();

const boardRouter = require("./routes/board");

dotenv.config();
app.set('PORT', process.env.PORT || 4000);

app.set('view engine', 'html'); // 1.템프릿 엔진 사용, 2. 템플릿 파일의 확장자
nunjucks.configure(path.join(__dirname, 'views'), {
    express: app, 
    watch: true,
});

app.use(morgan('dev'));

// 정적
app.use(express.static(path.join(__dirname, 'public')));

// body-parser
app.use(express.json());
app.use(express.urlencoded({extended : false}));

//라우터
app.use("/board", boardRouter);

// 없는
app.use((req, res, next) => {
    const err = new Error(`${res.url}은 없는 페이지 입니다.`);
    err.status = 404;
    next(err);
})

// 오류
app.use((err, req, res, next) => {
    return res.status(err.status || 500).send(err.message);
});

app.listen(app.get('PORT'), () => {
    console.log(app.get('PORT'), "번 포트에서 서버 대기중...");
});