<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Weather Forecasting </title>
    </head>

    <body>

    <h1> data </h1>
    
        <table border="1">   
            <thead>
                <tr>
                    <th>Day</th>
                    <th>MaxTemperature</th>
                    <th>MinTemperature</th>
                    <th>HumidityAm</th>
                    <th>HumidityPm</th>
                    <th>Rainfall</th>
                    <th>Sunshine</th>
                    <th>Wind</th>
                    <th>Year</th>                    
                </tr>
            </thead>
            
            <tbody>
                <c:forEach items="${data}" var="weather">
                <tr>
                   <td>${weather.day}</td>
                   <td>${weather.TMax}</td>
                   <td>${weather.TMin}</td>
                   <td>${weather.HAm}</td>
                   <td>${weather.HPm}</td>
                   <td>${weather.rainfall}</td>
                   <td>${weather.sunshine}</td>
                   <td>${weather.wind}</td>
                   <td>${weather.year}</td>
                </tr>
                </c:forEach>
            </tbody>
    </table>


    </body>
</html>
 