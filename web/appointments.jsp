<%@page import="helpers.AppointmentForm"%>
<%@page import="helpers.ResponseHandler"%>
<%
    ResponseHandler rHandler = new ResponseHandler(
        response,
        request,
        application
    );
    
    if (!rHandler.isLoggedIn()) {
        rHandler.redirect("index.jsp");
        
    } else {
        
        String method = request.getMethod();

        if (method == "GET") {
            
            // Render appointments page
            rHandler.render("appointments.html");
            
        } 
        }
    
%>
