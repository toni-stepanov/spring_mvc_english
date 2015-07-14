<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>

    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <spring:url value="/resources/css/bootstrap.min.css" var="bootstrap" />
    <spring:url value="/resources/js/bootstrap.min.js" var="bootstrap_js" />
    <spring:url value="/resources/slider/1.jpg" var="slider1" />
    <spring:url value="/resources/slider/2.jpg" var="slider2" />
    <spring:url value="/resources/slider/3.jpg" var="slider3" />
    <spring:url value="/resources/css/submit.css" var="register" />

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <link href="${bootstrap}" rel="stylesheet" media="screen">
    <link href="${register}" rel="stylesheet" media="screen">
    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="${bootstrap_js}"></script>
    <title><tiles:getAsString name="title" /></title>
</head>
<body>

<tiles:insertAttribute name="header" />

<form:form class="form-signin" commandName="person">
    <h2 class="form-signin-heading">Registration</h2>
    <form:input path="mail" id="mail" class="form-control" placeholder="Email address"/>
    <form:password path="password" id="password" class="form-control" placeholder="Password"/>
    <button class="btn btn-lg btn-primary btn-block btn-custom" type="submit">Sign up</button>
</form:form>

</br>
<tiles:insertAttribute name="footer"/>
</body>
</html>