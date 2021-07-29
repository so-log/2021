// 사이트 초기화 미들웨어

module.exports = (req, res, next) => {

    // 공통 타이틀
    res.locals.pageTitle = "사이트 공통제목...";

    // 공통 메뉴
    res.locals.mainMenu = [
        { name : "메뉴1", url : "/menu1" },
        { name : "메뉴2", url : "/menu2" },
        { name : "메뉴3", url : "/menu3" },
        { name : "메뉴4", url : "/menu4" },
        { name : "메뉴5", url : "/menu5" },
    ];

    // 기타 필요한 초기화 등등
    
    next();
};