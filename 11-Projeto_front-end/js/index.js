function softScroll(selector){
    $(selector).click(function(event){
        event.preventDefault();
        let target = $(this).attr('href');

        $('html, body').animate({
            scrollTop: $(target).offset().top
        }, 1000)

    });
}

softScroll('a[href*=panel-about]');
softScroll('a[href*=panel-speakers]');
softScroll('a[href*=panel-form]');