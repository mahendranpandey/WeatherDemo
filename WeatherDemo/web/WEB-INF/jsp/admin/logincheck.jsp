<%@ page import =" java.lang.Object" %>

<%
    String userid = request.getParameter("uname");    
    String pwd = request.getParameter("pass");
    
   
    if(userid.equals("admin") && pwd.equals("admin")) {
        
        response.sendRedirect("firstpage");
    } else {
        out.println("wrong username/ password ");
    }%>
