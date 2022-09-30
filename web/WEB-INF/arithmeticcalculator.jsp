<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 30, 2022, 9:48:33 AM
    Author     : admin
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
        <form method="POST" action="arithmetic">
            <table>
            <tr>
                <td>
                <label>First: </label>
                </td>
                <td>
                <input type="text" name="first_arithmetic" value="${FirstEntered}">
                </td>
            </tr>
            <tr>
                <td>
                <label>Second: </label>
                </td>
                <td>
                <input type="text" name="second_arithmetic" value="${SecondEntered}">
                </td>
            </tr>
            </table>
                <br>
            <div>
                <input type="submit" value="+" name="calc_arithmetic">
                <input type="submit" value="-" name="calc_arithmetic">
                <input type="submit" value="*" name="calc_arithmetic">
                <input type="submit" value="%" name="calc_arithmetic">
            </div>
            <div>
                <p>
                    Result: <b>${message}${result}</b>
                </p>
            </div>
            
            <div>
                <a href="age"> Age Calculator </a>
            </div>
        </form>
    </body>
</html>
