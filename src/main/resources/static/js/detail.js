/* 쿠폰 토글 */
$(function (){
   $(".toggle-btn").click(function (){
      console.log($(this).attr("id"));
      let dfs_id = $(this).attr("id").slice(-1);
      let coupon = $('#coupon'+dfs_id);
      coupon.toggle();
   });
});

/* 슬라이더 */
$(document).ready(function () {
   $('.slider').bxSlider({
      auto: true,
      slideWidth: 430,
   });
});

/* 카테고리 내비게이터 */
$(function () {
   $('.main-category').FeastSelect({
      btnText: '시계/주얼리', // 선택한 분류 가져와서 지정
      btnClass: 'my-custtom-btn',
      hideOriginal: true
   });
   $('.middle-category').FeastSelect({
      btnText: '여성시계', // 선택한 분류 가져와서 지정
      btnClass: 'my-custtom-btn',
      hideOriginal: true
   });
});


/*  쿠폰 체크 */
$(function () {
   $(".ck-discount").click(function (){
      let checked = $(this).is(":checked");
      if (checked) {
         let discount_price = $(this).next().find('label')[0].innerHTML;
         let final_price = $(this).parent().parent().parent().prev().find(".final-price")[0].innerHTML;
         final_price = Number(final_price) - Number(discount_price);
         $(this).parent().parent().parent().prev().find(".final-price")[0].innerHTML = final_price;
      } else {
         let discount_price = $(this).next().find('label')[0].innerHTML;
         let final_price = $(this).parent().parent().parent().prev().find(".final-price")[0].innerHTML;
         final_price = Number(final_price) + Number(discount_price);
         $(this).parent().parent().parent().prev().find(".final-price")[0].innerHTML = final_price;
      }

   });
});