<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp" %>

<c:forEach items="${users}" var="user">
    <tr>
        <td>
                <c:out value="${user.mail}" />
        </td>
        <td>
            <a>
                remove<br>
            </a>
        </td>
    </tr>
</c:forEach>
