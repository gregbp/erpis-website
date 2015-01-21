$(function () {
     
    // Make login request
    $('#sign-in').click(function () {
        
        var username = $('#username').val();
        var password = $('#password').val();
        
        if (!username || !password) {
            showError("Fill in username and password");
            return;
        }
        
        disableButton('#sign-in');
        
        $.ajax({
            url: 'login.jsp',
            type: 'POST',
            data: {
                username: username,
                password: password
            },
            error: function (jqXHR) {
                showError(jqXHR.responseText);
            },
            success: function () {
                refresh();
            },
            complete: function () {
                enableButton('#sign-in');
            }
        });
    });
    
    $('#username, #password').on('keypress', function (e) {
        
        // Handle "Enter" key
        if (e.keyCode === 13)
            $('#sign-in').click();
        
        // Hide error if user edits credentials
        hideError();
    });
});
