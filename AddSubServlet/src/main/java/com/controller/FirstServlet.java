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
        // Get user input
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));

        // Create Person object
        Person person = new Person(name, age);

        // Store in request scope
        request.setAttribute("personObj", person);

        // Forward to JSP
        RequestDispatcher dispatcher = request.getRequestDispatcher("person.jsp");
        dispatcher.forward(request, response);
    }
}
