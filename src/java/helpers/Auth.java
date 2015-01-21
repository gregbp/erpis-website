package helpers;

import javax.servlet.http.HttpServletRequest;
import dbtest.Manager;
import dbtest.User;

public class Auth {
   
    public final static String USER = "username";
    public final static String PASS = "password";

    public boolean logIn (HttpServletRequest request) {

        Manager manager = new Manager();

        // Connect to the database and check if user exists
        Boolean exists = manager.checkUser(
            request.getParameter(USER),
            request.getParameter(PASS)
        );

        if (!exists)
            return false;

        // Save username to session so that we know
        // if a user has already logged in
        
        manager = new Manager();
        User user = manager.getUser(request.getParameter(PASS));
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
}
