$(function () {
   
    $('.submit').click(function () {
        
        var email = $('#email').val();
        
        if (!email) {
            showError('Give an email');
            return;
        }
        
        $.ajax({
            url: 'addSubscriber.jsp',
            type: 'POST',
            data: {
                email: email,
            },
            success: function () {
                alert('Successfully subscribed');
            },
            error: function (jqXHR) {
                showError(jqXHR.responseText);
            },
        });
    });
    
    $('#email').on('keypress', function (e) {
        
        // Handle "Enter" key
        if (e.keyCode === 13)
            $('.submit').click();
        
        // Hide error if user edits credentials
        hideError();
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

