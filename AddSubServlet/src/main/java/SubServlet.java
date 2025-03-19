

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/SubServlet")
public class SubServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SubServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int num1 = Integer.parseInt(request.getParameter("num1"));
	        int num2 = Integer.parseInt(request.getParameter("num2"));
	        int difference = num1 - num2;

	        response.getWriter().println("Subtraction Result: " + difference);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
