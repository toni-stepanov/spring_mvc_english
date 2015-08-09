<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp" %>

<div class="list-group custom-themes">
    <c:forEach items="${themes}" var="theme" >
        <a href="/thems/${theme.title}" class="list-group-item ${theme.title == currentTheme ? 'active' : ''}">${theme.title}</a>
    </c:forEach>
</div>
<br/><br/>
<c:out value="${lesson.description}"/>
<c:out value="${lesson.title}"/>
<br/><br/><br/><br/>
<%--<iframe src="http://www.youtube.com/embed/pBYpNRz1FM4"--%>
        <%--width="560" height="315" frameborder="0" allowfullscreen></iframe>--%>
<nav>
    <ul class="pager">
        <li><a class="${currentIndex < 2 ? 'not-active-arrow' : 'active-arrow'}" href="/thems/${theme.title}/${currentIndex - 1}">Previous lesson</a></li>
        <li><a class="${theme.lessons.size() <= currentIndex ? 'not-active-arrow' : 'active-arrow'}" href="/thems/${theme.title}/${currentIndex + 1}">Next lesson</a></li>
    </ul>
</nav>