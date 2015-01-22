package helpers;

import javax.servlet.http.HttpServletRequest;


public class Auth {
   
    public final static String USER = "username";
    public final static String PASS = "password";

    public boolean logIn (HttpServletRequest request) {

        
        // Connect to the database and check if user exists
        Boolean exists = logInExist(
            request.getParameter(USER),
            request.getParameter(PASS)
        );

        if (!exists)
            return false;

        // Save username to session so that we know
        // if a user has already logged in
                
        request.getSession().setAttribute(USER, request.getParameter(USER));
        request.getSession().setAttribute("role", returnRole(request.getParameter(USER),request.getParameter(PASS)));
        request.getSession().setAttribute("id",  returnId(request.getParameter(USER),request.getParameter(PASS)));
        
        return true;
    }
    
    public void logOut (HttpServletRequest request) {
        request.getSession().setAttribute(USER, null);
    }

    public boolean isLoggedIn (HttpServletRequest request) {
        return request.getSession().getAttribute(USER) != null;
    }

    private static boolean logInExist(java.lang.String arg0, java.lang.String arg1) {
        dbtest.WsManService service = new dbtest.WsManService();
        dbtest.WsMan port = service.getWsManPort();
        return port.logInExist(arg0, arg1);
    }

    private static int returnId(java.lang.String arg0, java.lang.String arg1) {
        dbtest.WsManService service = new dbtest.WsManService();
        dbtest.WsMan port = service.getWsManPort();
        return port.returnId(arg0, arg1);
    }

    private static String returnRole(java.lang.String arg0, java.lang.String arg1) {
        dbtest.WsManService service = new dbtest.WsManService();
        dbtest.WsMan port = service.getWsManPort();
        return port.returnRole(arg0, arg1);
    }
}
