<%@page import="helpers.ResponseHandler"%>
<%    
    ResponseHandler rHandler = new ResponseHandler(
        response,
        request,
        application
    );
    
    if (rHandler.logOut())
        rHandler.redirect("index.jsp");
    else
        rHandler.error();
%>
