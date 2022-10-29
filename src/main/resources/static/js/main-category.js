$(document).ready(function () {
    $('.slider').bxSlider({
        auto: true
    });

    /* 이동 */
    $('.feastSelect_example-2 li').click(function () {
        console.log($(this).attr('id'));
        location.href = `/main-category/id=${$(this).attr('id')}/select/id=1`;
    });
});
