$(function() {
    $('.game-container').click(function () {
        if($(this).hasClass('active'))
            $(this).removeClass('active')
        else
            $(this).addClass('active')
    });
});


