$(function() {
    var lnb = $("#navbar").offset().top;
    $(window).scroll(function() {
        var window = $(this).scrollTop();

        if(lnb <= window) {
            $("#navbar").addClass("fixed");
        } else {
            $("#navbar").removeClass("fixed");
        }
    })
});

//======================================================
