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
        } else if (method == "POST") {
            // TODO: Add appointment here
            try {
                dbtest.WsManService service = new dbtest.WsManService();
                dbtest.WsMan port = service.getWsManPort();
                 // TODO initialize WS operation arguments here
                java.lang.String arg0 = "";
                java.lang.String arg1 = "";
                java.lang.String arg2 = "";
                java.lang.String arg3 = "";
                java.lang.String arg4 = "";
                int arg5 = 0;
                // TODO process result here
                boolean result = port.schedApp(arg0, arg1, arg2, arg3, arg4, arg5);
                //out.println("Result = "+result);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }     
        }
    }
%>
