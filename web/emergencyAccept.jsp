

<%@page import="dbTest.Appointment"%>
<%@page import="dbTest.User"%>
<%@page import="dbTest.Manager"%>
<%@page import="helpers.ResponseHandler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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

        
        int id = Integer.parseInt(request.getParameter("id"));
        Manager man = new Manager();
        Appointment ap=man.returnAp(id);
        String decision = request.getParameter("decision");
        if(decision.equals("accept")){
            man = new Manager();
            man.changeAppointment(ap);
        }else{
            man = new Manager();
            man.declineAppointment(ap);
        }
        
        
            

            
        
    }
    %>
