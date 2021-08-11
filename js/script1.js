$(function () {
  $(".menu_button").click(function() {
    $(".m_nav").addClass("on");
  });
  
  $(".close_nav").click(function() {
    $(".m_nav").removeClass("on");
  });
});