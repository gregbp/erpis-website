<%-- 
    Document   : signUp
    Created on : Jan 25, 2015, 7:01:58 PM
    Author     : dimbourgiotis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <%-- start web service invocation --%><hr/>
    <%
    try {
	dbtest.WsManService service = new dbtest.WsManService();
	dbtest.WsMan port = service.getWsManPort();
	 // TODO initialize WS operation arguments here
	java.lang.String arg0 = request.getParameter("first_name");
	java.lang.String arg1 = request.getParameter("last_name");
	java.lang.String arg2 = request.getParameter("password");
	java.lang.String arg3 = request.getParameter("insurance");
	java.lang.String arg4 = request.getParameter("amka");
	// TODO process result here
	boolean result = port.crUser(arg0, arg1, arg2, arg3, arg4);
        //handling gia to error
	//out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
