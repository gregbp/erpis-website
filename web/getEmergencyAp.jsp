<%-- 
    Document   : getAppointments
    Created on : Jan 13, 2015, 5:08:01 PM
    Author     : GREG
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="dbTest.Appointment"%>
<%@page import="java.util.List"%>
<%@page import="dbTest.Manager"%>
<%@page contentType="text/xml" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

    Manager m = new Manager();
    List <Appointment> ls1 = m.loadAppointments();
    List <Appointment> ls2= new ArrayList(); ;
    
    for (int i = 0; i < ls1.size(); ++i){
        if(ls1.get(i).getEmergencyReason()!=null){
            ls2.add(ls1.get(i));
        }
    }
    
    
    String rxml = new String();
    
    rxml+="<emergencies>";
    for (int i = 0; i < ls2.size(); ++i){
        rxml+="<emergency>";
        rxml+="<fullname>"+ls2.get(i).getFullName()+"</fullname>";
        rxml+="<insurance_name>"+ls2.get(i).getInsuranceName()+"</insurance_name>";
        rxml+="<id>"+ls2.get(i).getId()+"</id>";
        rxml+="<userid>"+ls2.get(i).getUserId()+"</userid>";
        rxml+="<amka>"+ls2.get(i).getAmka()+"</amka>";
        rxml+="<emergency_reason>"+ls2.get(i).getEmergencyReason()+"</emergency_reason>";
        rxml+="<examination>"+ls2.get(i).getExamination()+"</examination>";
        rxml+="<date>"+ls2.get(i).getDate().getTime()+"</date>";
        rxml+="<emergency_date>"+ls2.get(i).getEmergencyDateTimestamp()+"</emergency_date>";
        rxml+="<medical_office>"+ls2.get(i).getMedicalOffice()+"</medical_office>";
        rxml+="</emergency>";
 
    }
    rxml+="</emergencies>";
    
    out.println(rxml);
    
    
    
    
    
%>
