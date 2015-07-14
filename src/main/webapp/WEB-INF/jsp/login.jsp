<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>
<html>
<head>

    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <spring:url value="/resources/css/bootstrap.min.css" var="bootstrap" />
    <spring:url value="/resources/js/bootstrap.min.js" var="bootstrap_js" />
    <spring:url value="/resources/css/submit.css" var="submit" />

    <!-- Bootstrap -->
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="${bootstrap}" rel="stylesheet" media="screen">
    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="${bootstrap_js}"></script>
    <!-- Custom styles for this template -->
    <link href="${submit}" rel="stylesheet">
    <style>
        .error_pwd{
            text-align: center;
            color: red;
        }
    </style>
    <title><tiles:getAsString name="title" /></title>
</head>
<body>

<tiles:insertAttribute name="header" />
<div class="container">

    <form class="form-signin" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" id="inputEmail" name="mail" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" name="pwd" class="form-control" placeholder="Password" required>
        <button class="btn btn-lg btn-primary btn-block btn-custom" type="submit">Sign in</button>
    </form>

</div> <!-- /container -->
<p class="error_pwd">
    <c:out value="${result}"/>
</p>
</br>
<tiles:insertAttribute name="footer"/>
</body>
</html>