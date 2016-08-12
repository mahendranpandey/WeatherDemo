<%-- 
    Document   : index
    Created on : Jul 28, 2016, 6:39:10 PM
    Author     : mkpan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="BASE_URL" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="${BASE_URL}/static/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="${BASE_URL}/static/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="${BASE_URL}/static/js/jquery.min.js" type="text/javascript"></script>
        <script src="${BASE_URL}/static/js/bootstrap.min.js" type="text/javascript"></script>
    </head>
    <body>
      <style>
          body {
             background-image: url(${BASE_URL}/static/images/Rainfall.jpg);
            
             background-size: 1500px 750px;
             background-repeat:no-repeat;
             background-attachment:fixed;
             display: compact;
             padding-top: 40px;
             padding-bottom: 40px;
             background-color: #eee;
                }
            
                #display{
                    color: black;
                }

          .form-signin {
             max-width: 330px;
             padding: 15px;
             margin: 0 auto;
                        }
          .form-signin .form-signin-heading,
          .form-signin .checkbox {
             margin-bottom: 10px;
             margin-left: 10px;
                    }
          .form-signin .checkbox {
             font-weight: normal;
                }
          .form-signin .form-control {
             position: relative;
             height: auto;
             -webkit-box-sizing: border-box;
               -moz-box-sizing: border-box;
             box-sizing: border-box;
               padding: 10px;
                font-size: 16px;
                }
        .form-signin .form-control:focus {
         z-index: 2;
                }
        .form-signin input[type="email"] {
             margin-bottom: -1px;
             border-bottom-right-radius: 0;
             border-bottom-left-radius: 0;
                }
        .form-signin input[type="password"] {
          margin-bottom: 10px;
          border-top-left-radius: 0;
           border-top-right-radius: 0;
            }
      </style>

    <div class="container" id="display">

        <form class="form-signin" role="form" method="post" action="<spring:url value='/logincheck'/>">
        <h2 class="form-signin-heading" >Please sign in</h2>
        <label for="inputEmail" class="sr-only">Username</label>
        <input type="text" name="uname" id="inputUsername" class="form-control" placeholder="Username" required autofocus>
        <label for="inputPassword"  class="sr-only">Password</label>
        <input type="password" name="pass" id="inputPassword" class="form-control" placeholder="Password" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
            <label> <a href="register">Register</a></label>
        </div>
        
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>

    </div> <!-- /container -->


    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
