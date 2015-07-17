<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp" %>

<form:form class="form-signin" commandName="user">
    <h2 class="form-signin-heading">Registration</h2>
    <form:input path="mail" id="mail" class="form-control" placeholder="Email address"/>
    <form:password path="password" id="password" class="form-control" placeholder="Password"/>
    <button class="btn btn-lg btn-primary btn-block btn-custom" type="submit">Sign up</button>
</form:form>
