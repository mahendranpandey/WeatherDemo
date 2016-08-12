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
        <title> Weather Forecasting </title>
        <link href="${BASE_URL}/static/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="${BASE_URL}/static/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="${BASE_URL}/static/js/jquery.min.js" type="text/javascript"></script>
        <script src="${BASE_URL}/static/js/bootstrap.min.js" type="text/javascript"></script>
    </head>

  <body>

    <section class="jumbotron text-xs-center">
      <div class="container">
        <h1 class="jumbotron-heading"> Weather Forecasting </h1>      
        <form action="login" method="POST">
          <input type="submit" name="submit" class="btn btn-primary" value="Log In" >
          <input type="submit" name="submit" class="btn btn-success" value="Sign Up" >
        </form>
          
      </div>
    </section>

    <div class="album text-muted">
      
        
        
        
        
        
    </div>

    <footer class="text-muted">
      <div class="container">
        <p class="pull-xs-right">
          <a href="#">Back to top</a>
        </p>
        <p>Album example is &copy; Bootstrap, but please download and customize it for yourself!</p>
        <p>New to Bootstrap? <a href="../../">Visit the homepage</a> or read our <a href="../../getting-started/">getting started guide</a>.</p>
      </div>
    </footer>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="../../assets/js/vendor/holder.min.js"></script>
    <script>
      $(function () {
        Holder.addTheme("thumb", { background: "#55595c", foreground: "#eceeef", text: "Thumbnail" });
      });
    </script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
