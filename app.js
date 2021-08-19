const express = require('express');
const path = require('path');
const morgan =require('morgan');
const dotenv =require('dotenv');
const cookieParser =require('cookie-parser');
const nunjucks =require('nunjucks');
const session =require('express-session');
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

app.get("/", (req, res, next) => {
    const error = new Error('에러 발생!');
    next(error);
    // throw error;
});

// 없는 페이지 처리 라우터
app.use((req, res, next) => {
    
});

// 오류 처리 라우터
app.use((err, req, res, next) => {
    return res.send(err.message);
});

app.listen(app.get('PORT'), () => {
    console.log(app.get('PORT'), "번 포트에서 서버 대기중...");
});