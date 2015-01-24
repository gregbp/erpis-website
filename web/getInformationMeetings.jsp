<%-- 
    Document   : getInformationMeetings
    Created on : Jan 22, 2015, 3:25:50 PM
    Author     : it21219
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <hr/>
        <h1>    <%-- start web service invocation --%>
    <%
       
            
    <%
    try {
	dbtest.WsManService service = new dbtest.WsManService();
	dbtest.WsMan port = service.getWsManPort();
	// TODO process result here
	java.lang.String result = port.loadMeet();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%>

    
    %>
    <%-- end web service invocation --%>
 </h1>
 <hr/>
    </body>
</html>
