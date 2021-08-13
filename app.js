const express = require('express');
const morgan = require('morgan');
const dotenv = require('dotenv');
const nunjucks = require('nunjucks');
const path = require('path');
const logger = require('./lib/logger');


// 라우터
const indexRouter = require('./routes');
const menuRouter = require('./routes/menu');

const app = express();

dotenv.config();

app.set('PORT', process.env.PORT || 3500);
app.set("view engine", "html");
nunjucks.configure(path.join(__dirname, 'views'), {
    express : app,
    watch: true,
});

app.use(morgan('dev'));
app.use(express.static(path.join(__dirname, 'public')));

// 라우터 등록
app.use(indexRouter);
app.use(menuRouter);

// 없는 페이지 라우터
app.use((req, res, next) => {
    const err = new Error(`${req.url}은 없는 페이지 입니다.`);
    err.status = 404;
    next(err);
});

// 오류 처리 라우터
app.use((err, req, res, next) => {
    const data = {
        message : err.message,
        status : err.status || 500,
        stack : err.stack,
    };

    // 로그 기록
    logger(`[${data.status}]${data.message}`, 'error');
    logger(data.stack, 'error');

    if(process.env.NODE_ENV === 'production') {
        delete data.stack;
    }
    return res.status(data.status).render('error', data);
});

app.listen(app.get('PORT'), () => {
    console.log(app.get('PORT'), '번 포트에서 서버 대기중');
});