const sideMenu = {
  open : function() {
    if (!$(".m_nav, .close_nav").hasClass("on")) {
      $(".m_nav, .close_nav").addClass("on");
    }

    $("#layer_dim").removeClass("dim");
  },

  close : function() {
    $(".m_nav, .close_nav").removeClass("on");
    if (!$("#layer_dim").hasClass("dim")) {
      $("#layer_dim").addClass("dim");
    }
  }
};

$(function() {
  $(".menu_button").click(function() {
    sideMenu.open();
  });

  $(".close_nav, #layer_dim").click(function() {
    sideMenu.close();  
  });
});

var swiper = new Swiper(".swiper-container mySwiper", {
    pagination: {
    el: ".swiper-pagination",
    },
    spaceBetween: 30,
    loop:true,
    autoplay: {
    delay: 3000,
    disableOnInteraction: false,}
  });


