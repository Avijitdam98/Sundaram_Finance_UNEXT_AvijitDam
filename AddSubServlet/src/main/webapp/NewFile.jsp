<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.Date, java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Counter Example</title>
</head>
<body>
    <h2>Today's Date</h2>
    <p>
        <%
            
            Date today = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String formattedDate = formatter.format(today);
            out.println(formattedDate);
        %>
    </p>

    <h2>Counter Example</h2>
    <%
        
        Integer x = (Integer) session.getAttribute("x");
        if (x == null) {
            x = 1; 
        } else {
            x++; 
        }
        session.setAttribute("X", x); 

        
        Integer y = (Integer) application.getAttribute("y");
        if (y == null) {
            y = 20; // Fixed value
            application.setAttribute("Y", y);
        }
    %>

    <p><strong>x:</strong> <%= x %> )</p>
    <p><strong>y:</strong> <%= y %></p>

</body>
</html>
