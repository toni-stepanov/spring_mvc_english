
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ include file="../layout/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>

    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@ taglib prefix="tilesx" uri="http://tiles.apache.org/tags-tiles-extras" %>

    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <spring:url value="/resources/css-res/bootstrap.min.css" var="bootstrap" />
    <spring:url value="/resources/css-res/bootstrap-theme.min.css" var="bootstrap_theme" />
    <spring:url value="/resources/css-res/themes.css" var="themes" />
    <spring:url value="/resources/css-res/submit.css" var="submit" />
    <spring:url value="/resources/css-res/arrows.css" var="arrows" />

    <spring:url value="/resources/js-res/bootstrap.js" var="bootstrap_js" />
    <spring:url value="/resources/js-res/jquery-validate.js" var="validate"/>
    <spring:url value="/resources/js-res/jquery.js" var="jquery"/>

    <link href="${bootstrap}" rel="stylesheet" media="screen">
    <link href="${bootstrap_theme}" rel="stylesheet" media="screen">
    <link href="${submit}" rel="stylesheet" media="screen">
    <link href="${themes}" rel="stylesheet" media="screen">
    <link href="${arrows}" rel="stylesheet" media="screen">

    <script src="${jquery}"></script>
    <script src="${bootstrap_js}"></script>
    <script src="${validate}"></script>


    <title><tiles:getAsString name="title" /></title>

</head>
<body>
<tilesx:useAttribute name="current_page"/>
<br>
    <div class="navbar-wrapper">
        <div class="container">

            <nav class="navbar navbar-inverse navbar-static-top">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="#">English Vocabulary</a>
                    </div>
                    <div id="navbar" class="navbar-collapse collapse" align="right">
                        <ul class="nav navbar-nav">
                            <li class="${current_page == 'start' ? 'active' : ''}" ><a href="<spring:url value="/" />">Home</a></li>
                            <security:authorize access="!isAuthenticated()">
                                <li class="${current_page == 'login' ? 'active' : ''}" ><a href="<spring:url value="/login" />">Login</a></li>
                            </security:authorize>
                            <security:authorize access="!isAuthenticated()">
                                <li class="${current_page == 'registration' ? 'active' : ''}" ><a href="<spring:url value="/registration" />">Registration</a></li>
                            </security:authorize>
                            <security:authorize access="hasRole('ROLE_ADMIN')">
                                <li class="${current == 'users' ? 'active' : ''}"><a href="<spring:url value="/users" />">Users</a></li>
                            </security:authorize>
                            <security:authorize access="isAuthenticated()">
                                <li><a href="<spring:url value="/logout" />">Logout</a></li>
                            </security:authorize>
                        </ul>

                    </div>
                </div>
            </nav>

        </div>
    </div>

    <tiles:insertAttribute name="body"/>
    <tiles:insertAttribute name="footer" />

</body>