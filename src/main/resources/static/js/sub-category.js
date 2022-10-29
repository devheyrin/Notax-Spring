$(document).ready(function () {
    /* 이동 */
    $(function (){
        $('#main-selects').siblings().eq(1).find('li').click(function(){
            console.log($(this).attr('id'));
            location.href= `/main-category/id=${$(this).attr('id')}/select/id=1`;
        }) ;

        $('#middle-selects').siblings().eq(1).find('li').click(function(){
            console.log($(this).attr('id'));
            let mainnumber=$('#main_no').val();
            console.log(mainnumber);
            location.href=`/main-category/id=${mainnumber}/middle-category/id=${$(this).attr('id')}/select/id=1`;
        }) ;
    });
});
