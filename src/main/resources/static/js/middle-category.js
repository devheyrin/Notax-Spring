$(document).ready(function () {
    /* 이동 */
    $(function (){
       $('#main-selects').siblings().eq(1).find('li').click(function(){
           console.log($(this).attr('id'));
           location.href= `/main-category/id=${$(this).attr('id')}/select/id=1`;
       }) ;

       $('#middle-selects').siblings().eq(1).find('li').click(function(){
            let mainnumber=$('#main_no').val();
            location.href=`/main-category/id=${mainnumber}/middle-category/id=${$(this).attr('id')}/select/id=1`;
       }) ;
    });
    $('#searchBTN').click(function() {
        let text = document.getElementById('search').value;
        let mainnumber=$('#main_no').val();
        let middlenumber=$('#middle_no').val();

        location.href = `/main-category/id=${mainnumber}/middle-category/id=${middlenumber}/search/${text}/select/id=1`;
    });
});
