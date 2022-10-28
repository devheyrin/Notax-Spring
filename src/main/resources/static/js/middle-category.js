$(document).ready(function () {
    /* 이동 */
    // $('.category-name .feastSelect_example-2:first-child li').click(function () {
    //     console.log($(this).attr('id'));
    //     location.href = `/main-category/id=${$(this).attr('id')}`;
    // });
    let main_category = $('ul.feastSelect_example-2')[0];
    let middle_category = $('ul.feastSelect_example-2')[1];
    console.log(main_category);
    console.log(middle_category);

    // $('.category-name .feastSelect_example-2:last-child li').click(function () {
    //     console.log($(this).attr('id'));
    //     location.href = `/main-category/id=${$(this).attr('id')}/middle-category/id=${$(this).attr('id')}`;
    // });

    $('.category-name').children('ul.feastSelect_example-2:eq(0)').children('li').click(function () {
        console.log($(this).attr('id'));
    });

    $('.category-name').children('ul.feastSelect_example-2:eq(1)').children('li').click(function () {
        console.log($(this).attr('id'));
    });


});
