$(function () {
     
    // Make sign up request
    $('#sign-up').click(function () {
        
        var amka = $('#amka').val();
        var firstName = $('#first-name').val();
        var lastName = $('#last-name').val();
        var password = $('#password').val();
        
        if (!amka || !firstName || !lastName || !password) {
            showError("Fill in all fields");
            return;
        }
        
        disableButton('#sign-up');
        
        $.ajax({
            url: 'signup.jsp',
            type: 'POST',
            data: {
                amka: amka,
                firstName: firstName,
                lastName: lastName,
                password: password
            },
            error: function (jqXHR) {
                showError(jqXHR.responseText);
            },
            success: function () {
                refresh();
            },
            complete: function () {
                enableButton('#sign-up');
            }
        });
    });
    
    $('#amka, #fist-name, #last-name, #password').on('keypress', function (e) {
        
        // Handle "Enter" key
        if (e.keyCode === 13)
            $('#sign-up').click();
        
        hideError();
    });
});
