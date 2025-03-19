import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/First")
public class FirstServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher disp = null;

        String str = request.getParameter("uname");
        String pwd = request.getParameter("pass");
        

        if (str != null && pwd != null && str.equals("admin") && pwd.equals("tiger")) {
            request.setAttribute("nick", "Pls proceed");
            disp = request.getRequestDispatcher("/success"); 
        } else{
            request.setAttribute("errorMsg", "Invalid username or password.");
            disp = request.getRequestDispatcher("/error"); 
        }

        disp.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}