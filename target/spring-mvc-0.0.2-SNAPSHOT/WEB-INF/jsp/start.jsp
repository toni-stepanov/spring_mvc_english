<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp" %>

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
    <security:authorize access="!isAuthenticated()">
        <p><a class="btn btn-lg btn-primary disabled" href="#" role="button" style="width:160px; color:#ffffff; background:black">Start</a></p>
    </security:authorize>
    <security:authorize access="isAuthenticated()">
        <form action="main">
            <p><a class="btn btn-lg btn-primary" style="width:160px; color:#ffffff; background:black" type="submit" href="themes">Start</a></p>
        </form>
    </security:authorize>
</div>
</br>