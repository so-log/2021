const mobileSide = {
    // 사이드 메뉴 열기
    open : function(){
        if(!$("aside").hasClass("on")) {
            $("aside").addClass("on");
        }
    
        $("#layer_dim").removeClass("dn");
    },

    // 사이드 메뉴 닫기
    close : function(){
        $("aside").removeClass("on");

        if(!$("#layer_dim").hasClass("dn")) {
            $("#layer_dim").addClass("dn");
        }

    }

};


$(function() {
    // 메뉴 열기
    $(".side_open").click(function(){
        mobileSide.open();
    });

    // 메뉴 닫기
    $(".side_close, #layer_dim").click(function(){
        mobileSide.close();
    });
});
