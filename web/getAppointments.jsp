<%-- 
    Document   : getAppointments
    Created on : Jan 13, 2015, 5:08:01 PM
    Author     : GREG
--%>

<%@page import="helpers.ResponseHandler"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/xml" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <%-- start web service invocation --%><hr/>
    <%
    ResponseHandler rHandler = new ResponseHandler(
        response,
        request,
        application
    );
    
    if (rHandler.isLoggedIn()){
        
        String name = request.getParameter("username");
        int amka = -1;   
        try {
            dbtest.WsManService service = new dbtest.WsManService();
            dbtest.WsMan port = service.getWsManPort();
             // TODO initialize WS operation arguments here
            java.lang.String arg0 = "";
            // TODO process result here
            amka = port.getAmka(arg0);
            out.println("Result = "+amka);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        try {
            dbtest.WsManService service = new dbtest.WsManService();
            dbtest.WsMan port = service.getWsManPort();
             // TODO initialize WS operation arguments here
            int arg0 =amka;
            // TODO process result here
            java.lang.String result = port.loadApps(arg0);
            out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        
    }

    else
        rHandler.redirect("index.jsp");    
   
    %>
    <%-- end web service invocation --%><hr/>    