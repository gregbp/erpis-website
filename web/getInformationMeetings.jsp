<%-- 
    Document   : getInformationMeetings
    Created on : Jan 24, 2015, 12:37:21 PM
    Author     : dimbourgiotis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	dbtest.WsManService service = new dbtest.WsManService();
	dbtest.WsMan port = service.getWsManPort();
	// TODO process result here
	java.lang.String result = port.loadMeet();
	//out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
