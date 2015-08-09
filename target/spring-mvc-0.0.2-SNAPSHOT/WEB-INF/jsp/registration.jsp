<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp" %>

<form:form cssClass="form-signin" id="form" commandName="user">
    <h2 class="form-signin-heading">Registration</h2>
    <form:input path="email" id="email" class="form-control" placeHolder="Enter email"/>
    <form:password path="password" id="password_main" class="form-control" placeHolder="Enter password"/>
    <button class="btn btn-lg btn-primary btn-block btn-custom" type="submit">Sign up</button>
</form:form>


<script type="text/javascript">
    $(document).ready(function(){
        $(".form-signin").validate(
                {
                    rules : {
                        email : {
                            required : true,
                            email : true,
                            remote: {
                                url : "<spring:url value='/registration/available.html' />",
                                type : "get",
                                data : {
                                    email : function() {
                                        return $("#email").val();
                                    }
                                }
                            }
                        },
                        password: {
                            required : true,
                            minlength : 5
                        }
                    },
                    messages : {
                        email : {
                            remote : "Such username already exists!"
                        }
                    }
                }
        )
    });
</script>