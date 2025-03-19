import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import javax.servlet.RequestDispatcher;

import com.model.Person;

@WebServlet("/MVC")
public class MVCServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public MVCServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Get and validate request parameters
        String idParam = request.getParameter("id");
        String name = request.getParameter("uname");

        if (idParam == null || idParam.isEmpty() || name == null || name.isEmpty()) {
            response.getWriter().println("Invalid input: ID or Name is missing.");
            return;
        }

        int id;
        try {
            id = Integer.parseInt(idParam);
        } catch (NumberFormatException e) {
            response.getWriter().println("Invalid ID format.");
            return;
        }

        // Create Person object
        Person p = new Person(id, name);

        // Check name and forward if "albin"
        if ("albin".equalsIgnoreCase(p.getName())) {
            request.setAttribute("str", p);
            javax.servlet.RequestDispatcher disp = (RequestDispatcher) request.getRequestDispatcher("DetailsServlet");
            disp.forward(request, response);
        } else {
            response.getWriter().println("Person name is not 'albin'.");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        doGet(request, response);
    }
}
