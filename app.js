const express = require('express');
const dotenv = require('dotenv');
const morgan = require('morgan');
const nunjucks = require('nunjucks');
const path = require('path');
const logger = require('./lib/logger');

const bootStrap = require('./boot');

// 라우터
const indexRouter = require('./routes');

const app = express();
dotenv.config();

// templete
app.set("view engine", "html");

// nunjucks
nunjucks.configure(path.join(__dirname, 'views'), {
    express: app,
    watch : true,
});

// PORT
app.set('PORT', process.env.PORT || 3000);

// 사이트 초기화
app.use(bootStrap);

// morgan
app.use(morgan('dev'));

// 정적
app.use(express.static(path.join(__dirname, 'public')));

// body-paser
app.use(express.json());
app.use(express.urlencoded({ extended: false }));

// 라우터 연동
app.use(indexRouter); // "/ (생략가능"

// 없는
app.use((req, res, next) => {
    const err = new Error(`${req.url}은 없는 페이지 입니다.`);
    err.status = 404;
    next(err);
});

// 오류
app.use((err, req, res, next) => {
    const data = {
        message : err.message,
        status : err.status || 500,
        stack : err.stack,
    };

    //로그 기록
    logger(`[${data.status}]${data.message}`, 'error');
    logger(data.stack, 'error');

    if(process.env === 'production') {
        delete data.stack;
    }

    return res.status(data.status).render("error", data);
});

app.listen(app.get('PORT'), () => {
    console.log(app.get('PORT'), "번 포트에서 서버 대기중...");
});