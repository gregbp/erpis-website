$(function () {
   
    $('.submit').click(function () {
        $.ajax({
            url: 'addSubscriber.jsp',
            type: 'POST',
            data: {
                email: $('#email').val(),
            },
            success: function () {
                alert('Successfully subscribed');
            },
            error: function (jqXHR) {
                showError(jqXHR.responseText);
            },
        });
    });

    $.ajax({
        url: 'getInformationMeetings.jsp',
        type: 'GET',
        success: function (xml) {
            console.info(xml);
            window.x = xml;
            var informationmeetings = xml.getElementsByTagName('informationmeeting');
            console.log(informationmeetings);
            for (var i = 0; i < informationmeetings.length; i++) {
                window.a = informationmeetings[i];
                createAppointment(
                    xmlToAppointment(informationmeetings[i])
                );
            }
        }
    });

    
});

