package exp8.src;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password123";

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get parameters from the form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Start HTML response
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Login Result</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; margin: 0; padding: 20px; display: flex; justify-content: center; align-items: center; height: 100vh; background-color: #f0f2f5; }");
        out.println(".message-container { background-color: white; padding: 20px; border-radius: 8px; box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1); text-align: center; }");
        out.println(".success { color: #28a745; }");
        out.println(".error { color: #dc3545; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='message-container'>");

        // Check credentials
        if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
            out.println("<h2 class='success'>Welcome, " + username + "!</h2>");
            out.println("<p>Login successful.</p>");
        } else {
            out.println("<h2 class='error'>Login Failed</h2>");
            out.println("<p>Invalid username or password.</p>");
            out.println("<p><a href='login.html'>Try Again</a></p>");
        }

        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}
