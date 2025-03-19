<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8" import="com.model.Person"%>
<!DOCTYPE html>
<html>
<head>
    <title>Person Details</title>
</head>
<body>
    <h2>Person Details</h2>
    <%
        // Retrieve object from request scope
        Person p = (Person) request.getAttribute("personData");

        // Check if the person object exists before using it
        if (p != null) {
    %>
        <p><strong>Name:</strong> <%= p.getName() %></p>
        <p><strong>Age:</strong> <%= p.getAge() %></p>
    <%
        } else {
    %>
        <p>No person data available. Please submit the form first.</p>
    <%
        }
    %>
</body>
</html>
