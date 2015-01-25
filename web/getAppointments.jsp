<%-- 
    Document   : getAppointments
    Created on : Jan 13, 2015, 5:08:01 PM
    Author     : GREG
--%>

<%@page import="helpers.ResponseHandler"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/xml" pageEncoding="UTF-8"%>
<%
    ResponseHandler rHandler = new ResponseHandler(
        response,
        request,
        application
    );

    if (rHandler.isLoggedIn()){

        String name = rHandler.userName();
        int amka = -1;   
        try {
            dbtest.WsManService service = new dbtest.WsManService();
            dbtest.WsMan port = service.getWsManPort();
             // TODO initialize WS operation arguments here
            java.lang.String arg0 = name;
            // TODO process result here
            amka = port.getAmka(arg0);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            rHandler.error("Something went wrong dude!");
        }   

        try {
            dbtest.WsManService service = new dbtest.WsManService();
            dbtest.WsMan port = service.getWsManPort();
             // TODO initialize WS operation arguments here
            int arg0 =amka;
            // TODO process result here
            java.lang.String result = port.loadApps(arg0);
            rHandler.success(result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            rHandler.error("Something went wrong dude!");
        }

    }

    else
        rHandler.redirect("index.jsp");    

%>