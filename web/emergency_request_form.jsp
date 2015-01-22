
<%@page import="dbTest.Appointment"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="helpers.Auth"%>
<%@page import="java.text.ParseException"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="dbTest.Manager"%>
<%@page import="dbTest.User"%>
<%@page import="helpers.ResponseHandler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   
ResponseHandler rHandler = new ResponseHandler(
    response,
    request,
    application
);
    
 
String method = request.getMethod();
    
// Redirect to appointment page
if (method == "GET")
    rHandler.render("emergency.html");
    
// Schedule appointment
else if (method == "POST") {
        
     
    // Unauthorized
    if (!rHandler.isLoggedIn()) {
        rHandler.redirect("login.jsp");
            
    } else {   
        
        String str_ap_ad = request.getParameter( "appointment_id" );
        int ap_id = 0;
        String dt1 = request.getParameter( "date" );
        String rsn = request.getParameter("reason"); 
        Date dt = new Date();
    
    
    
        try{
            ap_id = Integer.parseInt(str_ap_ad);
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");
            dateFormat.setLenient(false);
            try {     
                dt = dateFormat.parse(dt1.trim());
                //insert data into database
                 Manager m = new Manager();

                 if(m.existAp(ap_id)){
                     m = new Manager();
                     m.addEmergency(ap_id, rsn, new Timestamp(dt.getTime()));
                     rHandler.success();
                 }else{
                     rHandler.error("Appointment does not exist");
                 }

            } catch (ParseException pe) {
                rHandler.error("Invalid date");
            }
        } catch (NumberFormatException e){
            rHandler.error("Invalid appointment id");
        }
   
        
 
    
        
        
        
 
    
    }
}
    
    
    
    
    
    
    
    
%>