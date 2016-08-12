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
    
    
    
                                   <tr>
                                     <c:set var="tmaxTotal" value="${0}" />
                                     <c:set var="tminTotal" value="${0}" />
                                     <c:set var="hamTotal" value="${0}" />
                                     <c:set var="hpmTotal" value="${0}" />
                                     <c:set var="rainfallTotal" value="${0}" />
                                     <c:set var="sunshineTotal" value="${0}" />
                                     <c:set var="windTotal" value="${0}" />
                                     <c:forEach items="${data}" var="weather">
                                         <c:set var="tmaxTotal" value="${tmaxTotal + weather.TMax}" />
                                         <c:set var="tminTotal" value="${tminTotal + weather.TMin}" />
                                         <c:set var="hamTotal" value="${hamTotal + weather.HAm}" />
                                         <c:set var="hpmTotal" value="${hpmTotal + weather.HPm}" />
                                         <c:set var="rainfallTotal" value="${rainfallTotal + weather.rainfall}" />
                                         <c:set var="sunshineTotal" value="${sunshineTotal + weather.sunshine}" />
                                         <c:set var="windTotal" value="${windTotal + weather.wind}" />
                                     </c:forEach>
                                     
                                        <td>Maximum Temp.            = ${tmaxTotal/5}</td></br>
                                        <td>Minimum Temp.            = ${tminTotal/5}</td></br>
                                        <td>Humidity at AM           = ${hamTotal/5}</td></br>
                                        <td>Humidity at PM           = ${hpmTotal/5}</td></br>
                                        <td>Rainfall                 = ${rainfallTotal/5}</td></br>
                                        <td>Sunshine                 = ${sunshineTotal/5}</td></br>
                                        <td>Wind                     = ${windTotal/5}</td><br></br>                                        
                                    </tr>
       
      
<!--    <table border="1">   
            <thead>
                <tr>
                    <th>MaxTemperature</th>
                    <th>MinTemperature</th>
                    <th>HumidityAm</th>
                    <th>HumidityPm</th>
                    <th>Rainfall</th>
                    <th>Sunshine</th>
                    <th>Wind</th>
                </tr>
            </thead>
            
            <tbody>
                <c:forEach items="${data}" var="weather">
                <tr>
                   <td>${weather.TMax}</td>
                   <td>${weather.TMin}</td>
                   <td>${weather.HAm}</td>
                   <td>${weather.HPm}</td>
                   <td>${weather.rainfall}</td>
                   <td>${weather.sunshine}</td>
                   <td>${weather.wind}</td>
                </tr>
                </c:forEach>
            </tbody>
    </table> -->


    </body>
</html>
 