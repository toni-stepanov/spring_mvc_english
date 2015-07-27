<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp" %>

<%--<c:url var="firstUrl" value="/pages/1" />--%>
<%--<c:url var="lastUrl" value="/pages/${deploymentLog.totalPages}" />--%>
<%--<c:url var="prevUrl" value="/pages/${currentIndex - 1}" />--%>
<%--<c:url var="nextUrl" value="/pages/${currentIndex + 1}" />--%>

<div class="list-group custom-themes">
    <%--<a href="#" class="list-group-item">Theme 1</a>--%>
    <c:forEach items="${themes}" var="theme" >
        <a href="/thems/${theme.title}" class="list-group-item">${theme.title}</a>
    </c:forEach>
        <c:forEach items="${words}" var="word">
            <a href="#1" class="list-group-item">${word.title}</a>
        </c:forEach>
</div>


