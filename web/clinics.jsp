<%@page import="helpers.ResponseHandler"%>
<%  
    ResponseHandler rHandler = new ResponseHandler(
        response,
        request,
        application
    );

    rHandler.render("clinics.html");
%>
