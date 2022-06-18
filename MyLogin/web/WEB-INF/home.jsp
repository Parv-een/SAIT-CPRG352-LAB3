<%-- 
    Document   : home
    Created on : 13-Jun-2022, 2:01:53 PM
    Author     : parve
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <main>
            <h2>Hello ${username}.</h2>
            <h5>${sessionAttribute}</h5>
            <nav>
                <a href ="login?logout">Log out</a>
            </nav>
            
        </main>
    </body>
</html>
