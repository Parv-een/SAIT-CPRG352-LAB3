<%-- 
    Document   : login
    Created on : 13-Jun-2022, 2:02:55 PM
    Author     : parve
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="Post" action="login">
        <main>
            <label>Username:</label>
            <input type="text" name="username" Value="${username}">
            <br>
            <label>Password:</label>
            <input type="password" name="password" value="${password}">
            <br>
            <input type ="submit" name="Log In" value="Log In ">
            <input type="hidden" name="operate" Value ="Logout">
        </main>
        </form>
           
            
            
    </body>
</html>
