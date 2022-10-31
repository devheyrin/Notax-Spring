/* 쿠폰 토글 */
$(function (){
   $(".toggle-btn").click(function (){
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
      let main_no = $(this).attr('id');
      location.href = `/main-category/id=${main_no}/select/id=1`;
   });

   $('#middle-selects').siblings().eq(1).find('li').click(function () {
      let main_no = $('#main_no').val();
      let middle_no = $(this).attr('id');
      location.href = `/main-category/id=${main_no}/middle-category/id=${middle_no}/select/id=1`;
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

/* 찜하기 */
$(function () {
   let pd_no = $('#pd-no').val();
   let user_id = $('#session-user-id').val();

   // 로그인하지 않은 사용자인 경우


   // 로그인한 사용자인 경우
   $('#btn-like').click(function () {
      if (!user_id) {
         alert("로그인 후 사용 가능한 기능입니다.");
         return;
      }

      console.log();
      if ($(this).val() === 'disliked') {
         $.ajax({
            type : 'POST',
            url : `/detail/${pd_no}/like`,
            data : {'userid': user_id},
            success : function (data) {
               console.log("성공 : " , data);
               $('path').removeClass('disliked');
               $('path').addClass('liked');
               $('#btn-like').val("liked");
               $('#pd_likes').text(Number($('#pd_likes').text()) + 1);
            }
         });
      } else {
         $.ajax({
            type : 'POST',
            url : `/detail/${pd_no}/dislike`,
            data : {'userid': user_id},
            success : function (data) {
               console.log("성공 : " , data);
               $('path').removeClass('liked');
               $('path').addClass('disliked');
               $('#btn-like').val("disliked");
               $('#pd_likes').text(Number($('#pd_likes').text()) - 1);
            }
         });
      }
   });
});