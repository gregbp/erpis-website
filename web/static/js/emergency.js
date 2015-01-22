$(function () {
   
    $('.form input').on('keypress', function () {
        hideError();
    });
    
    $('.create').click(function () {
       showPopup();
    });
    
    $('.overlay, .popup .close').click(function () {
        hidePopup();
    });
    
    $('#submit').click(function () {
        $.ajax({
            url: 'emergency_request_form.jsp',
            type: 'POST',
            data: {
               appointment_id: $('#ap_id').val(),
               date: $('#date').val(),
               reason: $('#reason').val(),
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
        url: 'getEmergencyAp.jsp',
        type: 'GET',
        success: function (xml) {
            window.x = xml;
            var appointments = xml.getElementsByTagName('emergency');
            console.log(appointments);
            for (var i = 0; i < appointments.length; i++) {
                window.a = appointments[i];
                createAppointment(
                    xmlToAppointment(appointments[i])
                );
            }
        }
    });
    $(".datepicker").datetimepicker();;
});
window.isEmergency = true;