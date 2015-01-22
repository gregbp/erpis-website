package helpers;

import javax.servlet.http.HttpServletRequest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Timestamp;

public class AppointmentForm {
    
    public final static String AP_ID = "ap_id";
    public final static String AMKA = "amka";
    public final static String FIRST_NAME = "first_name";
    public final static String LAST_NAME = "last_name";
    public final static String INSURANCE = "insurance";
    public final static String EXAMINATION = "examination";
    public final static String DATE = "date";
    public final static String OFFICE = "office";
    
    private String error="";
    
    public String getError() {
        return this.error;
    }
    
    private void setError(String error) {
        this.error = error;
    }
    
    /*public boolean updateAppointment (HttpServletRequest request) {
        String date = request.getParameter(DATE);
        String office = request.getParameter(OFFICE);
        String apId = request.getParameter(AP_ID);
       
        // Validate date
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        dateFormat.setLenient(false);
        Date dt = new Date();
        try {     
            dt = dateFormat.parse(date.trim());
        } catch (ParseException e) {
            setError("Invalid date");
            return false;
        }
        if (!office.matches("[a-zA-Z ]+") || office.length() < 1) {
            setError("Invalid medical office name");
            return false;
        }
        if (!apId.matches("[0-9]+") || apId.length() < 1) {
            setError("Invalid amka");
            return false;
        }
        
        int ap_id = Integer.parseInt(apId);
        
        // Update appointment
        Manager m = new Manager();
        
        if(m.existAp(ap_id)){
            Appointment appointment = new Appointment();
            appointment.setDate(new Timestamp(dt.getTime()));
            appointment.setMedicalOffice(office);
            appointment.setId(ap_id);
            m = new Manager();
            
            System.out.println(appointment.getDate());//upopto
                System.out.println(appointment.getMedicalOffice());
                System.out.println(appointment.getId());
            m.updateAppointment(appointment);
        }
        return true;
    }*/
    
    public boolean scheduleAppointment (HttpServletRequest request) {
        
        // Get parameters
        String amka = request.getParameter(AMKA);
        String firstName = request.getParameter(FIRST_NAME);
        String lastName = request.getParameter(LAST_NAME);
        String insurance = request.getParameter(INSURANCE);
        String examination = request.getParameter(EXAMINATION);

        // Validate data
        if (!amka.matches("[0-9]+") || amka.length() < 1) {
            setError("Invalid amka");
            return false;
        }
        if (!firstName.matches("[a-zA-Z]+") || firstName.length() < 1) {
            setError("Invalid first name");
            return false;
        }
        if (!lastName.matches("[a-zA-Z]+") || lastName.length() < 1) {
            setError("Invalid last name");
            return false;
        }
        if (!insurance.matches("[a-zA-Z ]+") || insurance.length() < 1) {
            setError("Invalid insurance company name");
            return false;
        }
        if (!examination.matches("[a-zA-Z ]+") || examination.length() < 1) {
            setError("Invalid examination name");
            return false;
        }
            
       
        return schedApp(firstName,lastName,insurance,amka,examination,Integer.parseInt(request.getAttribute("userid").toString()));
    }

    private static boolean schedApp(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, int arg5) {
        dbtest.WsManService service = new dbtest.WsManService();
        dbtest.WsMan port = service.getWsManPort();
        return port.schedApp(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
