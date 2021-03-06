<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp" %>

<div class="container">

    <form class="form-signin" role="form" action="<spring:url value="/j_spring_security_check" />" method="POST">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" id="inputEmail" name="j_username" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" name="j_password" class="form-control" placeholder="Password" required>
        <button class="btn btn-lg btn-primary btn-block btn-custom" type="submit">Sign in</button>
    </form>

</div>
<form>
    <input class="button22" type="button" value="ajax get List">
    <br/>
    <div class="result"/>
</form>
<script>
    $(document).ready(function(){
        $('.button22').click(function() {
            $.ajax({
                type : 'GET',
                headers: {
                    Accept : "application/json; charset=utf-8",
                    "Content-Type": "application/json; charset=utf-8"
                },
                url : '/login/result/listjson',
                success : function(data) {
                    var result = "";
                    for(var i=0; i<data.length;i++)
                        result += "<br>" + data[i].id + ' - ' + data[i].name;
                    $('.result').html(result);
                }
            });
        });
    });
</script>
