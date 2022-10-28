$(document).ready(function () {
    $('.slider').bxSlider({
        auto: true
    });

    /* 이동 */W
    $('.feastSelect_example-2 li').click(function () {
        console.log($(this).attr('id'));
        location.href = `/main-category/id=${$(this).attr('id')}`;
    });
});
