<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp" %>

<div class="list-group custom-themes">
    <c:forEach items="${themes}" var="theme" >
        <a href="/thems/${theme.title}" class="list-group-item ${theme.title == currentTheme ? 'active' : ''}">${theme.title}</a>
    </c:forEach>
</div>
<br/><br/>
<c:out value="${word.description}"/>
<c:out value="${word.title}"/>
<nav>
    <ul class="pager">
        <li><a class="${currentIndex < 2 ? 'not-active-arrow' : 'active-arrow'}" href="/thems/${theme.title}/${currentIndex - 1}">Previous word</a></li>
        <li><a class="${theme.words.size() <= currentIndex ? 'not-active-arrow' : 'active-arrow'}" href="/thems/${theme.title}/${currentIndex + 1}">Next word</a></li>
    </ul>
</nav>
<%--not-active-arrow--%>