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
        try {
            dbtest.WsManService service = new dbtest.WsManService();
            dbtest.WsMan port = service.getWsManPort();
             // TODO initialize WS operation arguments here
            java.lang.String arg0 = request.getParameter("firstName");
            java.lang.String arg1 = request.getParameter("lastName");
            java.lang.String arg2 = request.getParameter("password");
            java.lang.String arg3 = request.getParameter("insurance");
            java.lang.String arg4 = request.getParameter("amka");
            // TODO process result here
            boolean result = port.crUser(arg0, arg1, arg2, arg3, arg4);
            //out.println("Result = "+result);
            if(result)
                rHandler.success();
            else
                rHandler.error("Invalid credentials");
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
    }
%>    