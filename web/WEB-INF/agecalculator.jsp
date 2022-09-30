<%-- 
    Document   : agecalculator
    Created on : Sep 22, 2022, 2:28:15 PM
    Author     : admin
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
        <form method="POST" action="age">
            <div>
                <label>Enter your age: </label>
                <input type="text" name="age_entered" value="${AgeEntered}">
            </div>
            
            <div>
                <br>
                <input type="submit" value="Age next birthday">
            </div>
            
            <div>
                <p>
                    ${message} ${str} ${result} ${error}
                </p>
            </div>
            
            <a href="arithmetic">Arithmetic Calculator</a>
        </form>
    </body>
</html>

