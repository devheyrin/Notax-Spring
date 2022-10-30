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
      onSliderLoad : function () {
         $("#edd").css("visibility", "visible").animate({opacity:1});
      }
   });
});

/* 카테고리 내비게이터 */
$(function () {
   let $main_name = $('#mainname').attr('value');
   let $middle_name = $('#mid_name').attr('value');
   console.log($main_name);
   console.log($middle_name);

   $('.main-category').FeastSelect({
      btnText: $main_name, // 선택한 분류 가져와서 지정
      btnClass: 'my-custtom-btn',
      hideOriginal: true
   });
   $('.middle-category').FeastSelect({
      btnText: $middle_name, // 선택한 분류 가져와서 지정
      btnClass: 'my-custtom-btn',
      hideOriginal: true
   });
});

$(function () {
   $('#main-selects').siblings().eq(1).find('li').click(function () {
      console.log($(this).attr('id'));
      location.href = `/main-category/id=${$(this).attr('id')}`;
   });

   $('#middle-selects').siblings().eq(1).find('li').click(function () {
      console.log($(this).attr('id'));
      let main_no = $('#main_no').val();

      //location.href=`/main-category/id=${$('#main-selects option:selected').val()}/middle-category/id=${$(this).attr('id')}/select/id=1`;
      location.href = `/main-category/id=${main_no}/middle-category/id=${$(this).attr('id')}/select/id=1`;
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