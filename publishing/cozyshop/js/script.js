window.onload = function() {
    var swiper = new Swiper(".main_banner .mySwiper", {
        navigation: {
        nextEl: ".main_banner .swiper-button-next",
        prevEl: ".main_banner .swiper-button-prev",
        },
        pagination: {
            el: ".main_banner .swiper-pagination",
            clickable : true,
          },
    });
};