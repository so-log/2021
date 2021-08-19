const express = require('express');
const path = require('path');
const morgan =require('morgan');
const dotenv =require('dotenv');
const cookieParser =require('cookie-parser');
const nunjucks =require('nunjucks');
const session =require('express-session');
const logger = require('./lib/logger');

// 라우터 등록
const indexRouter = require('./routes');
const boardRouter = require('./routes/board');


const app = express();

app.set('PORT', process.env.PORT || 3000);
app.set("view engine", "njk");
nunjucks.configure(path.join(__dirname, "views"), {
    express: app,
    watch : true,
});
dotenv.config();

app.use(morgan('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended : false }));
app.use(express.static(path.join(__dirname, 'public')));
app.use(cookieParser(process.env.COOKIE_SECRET));
app.use(session({
    resave : false,
    saveUninitialized: true,
    secret : process.env.COOKIE_SECRET,
    name: "yhsessionid",
}));


// 라우터 등록
app.use(indexRouter);
app.use("/board", boardRouter);

// 없는 페이지 처리 라우터
app.use((req, res, next) => {
    const error = new Error(`${req.url}은 없는 페이지 입니다.`);
    error.status = 404;
    next(error);
    
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
    return res.send(err.status || 500).render('error', data);
});

app.listen(app.get('PORT'), () => {
    console.log(app.get('PORT'), "번 포트에서 서버 대기중...");
});