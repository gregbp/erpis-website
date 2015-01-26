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
            var informationmeetings = xml.getElementsByTagName('informationmeeting');
            for (var i = 0; i < informationmeetings.length; i++) {
                createMeeting(
                    xmlToMeeting(informationmeetings[i])
                );
            }
        }
    });
});

function xmlToMeeting (xml) {
    var getEl = function (tagname) {
        return xml.getElementsByTagName(tagname);
    }
    return {
        'name': getEl('name')[0].innerHTML,
        'description': getEl('description')[0].innerHTML,
        'place': getEl('place')[0].innerHTML,
        'date': getEl('date')[0].innerHTML
    }
}

function createMeeting (a) {
    console.log('appending', a)
    $('ul').append(
        '<li class="meeting">' +
            '<div class="name">' + a['name'] + '</div>' +
            '<div class="date">' + a['place'] + ' | ' + a['date'] +'</div>' +
            '<div class="description">' + a['description'] + '</div>' +
        '</li>'
    );
}