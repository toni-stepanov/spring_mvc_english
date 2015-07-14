<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ include file="../layout/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>

    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

    <spring:url value="/resources/css/bootstrap.min.css" var="bootstrap" />
    <spring:url value="/resources/js/bootstrap.min.js" var="bootstrap_js" />
    <spring:url value="/resources/slider/1.jpg" var="slider1" />
    <spring:url value="/resources/slider/2.jpg" var="slider2" />
    <spring:url value="/resources/slider/3.jpg" var="slider3" />

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <link href="${bootstrap}" rel="stylesheet" media="screen">
    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="${bootstrap_js}"></script>
    <title><tiles:getAsString name="title" /></title>
    <style>
        .hello{
            text-align: center;
            font-size: 20px;
            color: green;
        }
    </style>
</head>
<body>

<tiles:insertAttribute name="header" />
<c:if test="${person != null}" >
    <p class="hello">hi, <c:out value="${person.mail}" /></p>
</c:if>

<%--<div class="container">--%>
    <%--<div id="carousel-generic" class="carousel slide" data-ride="carousel" style="width: 600px; margin: 0 auto">--%>
        <%--<!-- Indicators -->--%>
        <%--<ol class="carousel-indicators">--%>
            <%--<li data-target="#carousel-generic" data-slide-to="0"></li>--%>
            <%--<li data-target="#carousel-generic" data-slide-to="1"></li>--%>
            <%--<li data-target="#carousel-generic" data-slide-to="2"  class="active"></li>--%>
        <%--</ol>--%>

        <%--<!-- Wrapper for slides -->--%>
        <%--<div class="carousel-inner" >--%>
            <%--<div class="item active">--%>
                <%--<img src="${slider1}" alt="...">--%>
                <%--<div class="carousel-caption">--%>
                    <%--<h3>English - it is .. </h3>--%>
                    <%--<p>It is spoken in many countries around the world. </p>--%>
                <%--</div>--%>
            <%--</div>--%>

            <%--<div class="item">--%>
                <%--<img src="${slider2}" alt="...">--%>
                <%--<div class="carousel-caption">--%>
                    <%--<h3>English - it is .. </h3>--%>
                    <%--<p> West Germanic language that was first spoken in Anglo-Saxon England in the early Middle Ages.</p>--%>
                <%--</div>--%>
            <%--</div>--%>

            <%--<div class="item">--%>
                <%--<img src="${slider3}" alt="...">--%>
                <%--<div class="carousel-caption">--%>
                    <%--<h3>English - it is .. </h3>--%>
                    <%--<p>English has changed, and has been changed by many different languages.</p>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>

        <%--<!-- Controls -->--%>
        <%--<a class="left carousel-control" href="#carousel-generic" data-slide="prev">--%>
            <%--<span class="glyphicon glyphicon-chevron-left"></span>--%>
        <%--</a>--%>
        <%--<a class="right carousel-control" href="#carousel-generic" data-slide="next">--%>
            <%--<span class="glyphicon glyphicon-chevron-right"></span>--%>
        <%--</a>--%>
    <%--</div>--%>
<%--</div>--%>
</br></br></br>
<div align="center">
    <p><a class="btn btn-lg btn-primary" href="#" role="button" style="width:160px; color:#ffffff; background:black">Start</a></p>
</div>
</br>
<tiles:insertAttribute name="footer"/>
</body>
</html>