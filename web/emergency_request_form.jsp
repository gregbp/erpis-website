
<%@page import="java.sql.Timestamp"%>
<%@page import="helpers.Auth"%>
<%@page import="java.text.ParseException"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
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
                dbtest.WsManService service = new dbtest.WsManService();
                dbtest.WsMan port = service.getWsManPort();
                 // TODO initialize WS operation arguments here
                int arg0 = ap_id;
                java.lang.String arg1 = rsn;
                long arg2  = dt.getTime();             
                // TODO process result here
                boolean result = port.addEm(arg0, arg1, arg2);
                out.println("Result = "+result);
                if(!result)
                    rHandler.error("Appointment does not exist");
                else{
                    rHandler.success();
                }
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        } catch (NumberFormatException e){
            rHandler.error("Invalid appointment id");
        } 
   
    
%>