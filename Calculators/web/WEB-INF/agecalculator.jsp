<%-- 
    Document   : agecalculator
    Author     : parveen Kaur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <main>
            <form action="age" method="post">
            <label>Enter your age:</label>
            <input type="text"  name="age"  value="">
            <br>
            <input type="submit" value="Age next birthday">
            </form>
            <p>${message}</p>
        </main>
        <nav>
            <a href="arithmetic">Arithmetic Calculator</a>
        </nav>
    </body>
</html>
