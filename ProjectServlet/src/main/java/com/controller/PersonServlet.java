package com.controller;

import com.model.Person;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

@WebServlet("/PersonServlet")
public class PersonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get form data
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age"); 

        int age = 0; // Default value
        if (ageStr != null && !ageStr.trim().isEmpty()) {
            try {
                age = Integer.parseInt(ageStr);
            } catch (NumberFormatException e) {
                age = 0; // Handle invalid input gracefully
            }
        }

        // Create Person object
        Person person = new Person(name, age);

        // Store person object in request scope
        request.setAttribute("personData", person);

        // Forward request to JSP
        RequestDispatcher dispatcher = request.getRequestDispatcher("person.jsp");
        dispatcher.forward(request, response);
    }
}
