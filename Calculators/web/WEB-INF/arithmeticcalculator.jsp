<%-- 
    Document   : arithmeticcalculator
    Author     : parveen kaur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <main>
            <form action="arithmetic" method="post">
            <label>First</label>
            <input type="text" name="firstno" value="${first}">
            <br>
             <label>Second</label>
            <input type="text" name="secondno" value="${second}">
            <br>
            <input type="submit" value="+" name="calculate">
            <input type="submit" value="-" name="calculate">
            <input type="submit" value="*" name="calculate">
            <input type="submit" value="%" name="calculate">
            </form>
            <p>${message}</p>
            
            
        </main>
        <nav>
            <a href="age">Age Calculator</a>
        </nav>
    </body>
</html>
