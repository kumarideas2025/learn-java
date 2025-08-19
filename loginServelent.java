// File: loginServelent.java
// This is the updated and fixed version for handling POST requests.

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet to handle user login functionality.
 */
@WebServlet(name = "loginServelent", urlPatterns = {"/login"})
public class loginServelent extends HttpServlet {

    /**
     * Handles the HTTP GET method.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Please use the login form to submit data.</h1>");
    }

    /**
     * Handles the HTTP POST method, which is used for form submissions.
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "mysql@123");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select * from users where username='" + username + "' and password='" + password + "'");

            if (rs.next()) {
                // If login is successful, create a session and redirect
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                response.sendRedirect("index.html");
            } else {
                out.println("Wrong username or password");
            }
            rs.close();
            stm.close();
            con.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            out.println("An error occurred. Please try again later.");
        }
    }
}