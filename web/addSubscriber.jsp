<%-- 
    Document   : addSubscriber
    Created on : Jan 24, 2015, 4:53:57 PM
    Author     : it21221
--%>

<%@page import="helpers.ResponseHandler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    ResponseHandler rHandler = new ResponseHandler(
        response,
        request,
        application
    );
    String mail = request.getParameter("us-email");
    try {
	dbtest.WsManService service = new dbtest.WsManService();
	dbtest.WsMan port = service.getWsManPort();
	 // TODO initialize WS operation arguments here
	java.lang.String arg0 = mail;
	// TODO process result here
	boolean result = port.addSub(arg0);
	if(!result)
            rHandler.error("Appointment does not exist");
        else{
            rHandler.success();
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }    
%>  
