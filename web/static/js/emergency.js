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
   
});
window.isEmergency = true;