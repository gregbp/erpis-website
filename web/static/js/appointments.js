$(function () {
   
    $('.form input').on('keypress', function () {
        hideError();
    });
    
    $('#new-appointment').click(function () {
       showPopup('#appointment');
    });
    
    /*
     * Handle New Appointment Submition
     */
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

    /*
     * Handle Emergency Request Submition
     */
    $('#emergency .submit').click(function () {
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

    /*
     * Load Appointments and dump them into the DOM
     */
    $.ajax({
        url: 'getAppointments.jsp',
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
