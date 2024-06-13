window.onload = function() {
	var swiper = new Swiper(".main_banner .mySwiper", {
		navigation: {
			nextEl: ".main_banner .next",
			prevEl: ".main_banner .prev",
		},
		pagination: {
          el: ".main_banner .swiper-pagination",
		  clickable : true,
        },
	});
    var swiper2 = new Swiper(".main_event .mySwiper", {
        effect: "coverflow",
        grabCursor: true,
        centeredSlides: true,
        slidesPerView: "auto",
        coverflowEffect: {
          rotate: 50,
          stretch: 0,
          depth: 100,
          modifier: 1,
          slideShadows: true,
        },
        pagination: {
          el: ".main_event .swiper-pagination",
        },
      });
      var swiper3 = new Swiper(".main_sns .mySwiper", {
        slidesPerView: 3,
        spaceBetween: 30,
        pagination: {
          el: ".main_sns .swiper-pagination",
          clickable: true,
        },
      });
};