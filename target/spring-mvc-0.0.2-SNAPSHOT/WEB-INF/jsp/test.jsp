<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>

    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <spring:url value="/resources/css/bootstrap.min.css" var="bootstrap" />
    <spring:url value="/resources/js/bootstrap.min.js" var="bootstrap_js" />
    <spring:url value="/resources/css/signin.css" var="signin" />

    <!-- Bootstrap -->
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="${bootstrap}" rel="stylesheet" media="screen">
    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="${bootstrap_js}"></script>
    <!-- Custom styles for this template -->
    <link href="${signin}" rel="stylesheet">
    <title><tiles:getAsString name="title" /></title>
</head>
<body>

<tiles:insertAttribute name="header" />
hi, ${result2}
<tiles:insertAttribute name="footer"/>
</body>
</html>