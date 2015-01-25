$(function () {
   
    $('.form input').on('keypress', function () {
        hideError();
    });
    
    $('#new-appointment').click(function () {
       showPopup('#appointment');
    });
    
    $('#appointment .submit').click(function () {
        $.ajax({
            url: 'appointments.jsp',
            type: 'POST',
            data: {
               amka: $('#amka').val(),
               first_name: $('#first-name').val(),
               last_name: $('#last-name').val(),
               insurance: $('#insurance').val(),
               examination: $('#examination').val()
            },
            success: function () {
                refresh();
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
            window.x = xml;
            var appointments = xml.getElementsByTagName('appointment');
            console.log(appointments);
            for (var i = 0; i < appointments.length; i++) {
                window.a = appointments[i];
                createAppointment(
                    xmlToAppointment(appointments[i])
                );
            }
        }
    });
});

