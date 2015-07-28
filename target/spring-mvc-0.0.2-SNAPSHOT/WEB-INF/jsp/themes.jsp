<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp" %>

<div class="list-group custom-themes">

    <c:forEach items="${themes}" var="theme" >
        <a href="/thems/${theme.title}" class="list-group-item">${theme.title}</a>
    </c:forEach>
</div>
