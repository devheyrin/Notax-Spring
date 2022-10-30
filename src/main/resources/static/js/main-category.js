$(document).ready(function () {
    $('.slider').bxSlider({
        auto: true
    });

    /* 이동 */
    $('#main-selects').siblings().eq(1).find('li').click(function(){
        console.log($(this).attr('id'));
        location.href= `/main-category/id=${$(this).attr('id')}/select/id=1`;
    }) ;

    $('#searchBTN').click(function() {
        let text = document.getElementById('search').value;
        let mainnumber=$('#main_no').val();

        location.href = `/main-category/id=${mainnumber}/search/${text}/select/id=1`;
    });
});
