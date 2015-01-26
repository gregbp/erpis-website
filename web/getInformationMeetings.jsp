<%-- 
    Document   : getInformationMeetings
    Created on : Jan 24, 2015, 12:37:21 PM
    Author     : dimbourgiotis
--%>
<%@page import="helpers.ResponseHandler"%>
<%
    ResponseHandler rHandler = new ResponseHandler(
        response,
        request,
        application
    );
    
    try {
	dbtest.WsManService service = new dbtest.WsManService();
	dbtest.WsMan port = service.getWsManPort();
	java.lang.String result = port.loadMeet();
        rHandler.success(result);
    } catch (Exception ex) {
        rHandler.error("Oups!");
    }
%>
