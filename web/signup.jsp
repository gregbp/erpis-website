<%@page import="helpers.ResponseHandler"%>
<%
    ResponseHandler rHandler = new ResponseHandler(
        response,
        request,
        application
    );
    
    String method = request.getMethod();

    if (method == "GET") {
        rHandler.render("signup.html");
    } else if (method == "POST") {
        
    }
%>
