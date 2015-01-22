package helpers;

import dbtest.User;
import javax.servlet.http.HttpServletRequest;


public class Auth {
   
    public final static String USER = "username";
    public final static String PASS = "password";

    public boolean logIn (HttpServletRequest request) {

        

        // Connect to the database and check if user exists
        Boolean exists = checkUser(
            request.getParameter(USER),
            request.getParameter(PASS)
        );

        if (!exists)
            return false;

        // Save username to session so that we know
        // if a user has already logged in
        
        
        User user = getUser(request.getParameter(PASS));
        request.getSession().setAttribute(USER, request.getParameter(USER));
        request.getSession().setAttribute("role", user.getRole());
        request.getSession().setAttribute("id", user.getId());
        
        return true;
    }
    
    public void logOut (HttpServletRequest request) {
        request.getSession().setAttribute(USER, null);
    }

    public boolean isLoggedIn (HttpServletRequest request) {
        return request.getSession().getAttribute(USER) != null;
    }

    private static User getUser(java.lang.String arg0) {
        dbtest.ManagerService service = new dbtest.ManagerService();
        dbtest.Manager port = service.getManagerPort();
        return port.getUser(arg0);
    }

    private static boolean checkUser(java.lang.String arg0, java.lang.String arg1) {
        dbtest.ManagerService service = new dbtest.ManagerService();
        dbtest.Manager port = service.getManagerPort();
        return port.checkUser(arg0, arg1);
    }
}
