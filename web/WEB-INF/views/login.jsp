<%--
  Created by IntelliJ IDEA.
  User: 16051
  Date: 2018/12/13
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>login</title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <link href="/css/style.css" rel="stylesheet">
    <style>
        div.modal-body{
            margin-left: 15%;
            width: 70%;
        }
    </style>
</head>
<body>
<script type="text/javascript">
    /*function refresh() {
       login.imgValidate.src="validate.jsp?id=" +Math.random();
    }*/
/*
    function text() {
      var c=document.getElementById("code");
      if(c!=m)
         tip.innerHTML("jb,kdkgh") ;

    }*/
</script>
<div class="modal-title">
    <h1 class="text-center">登录</h1>
</div>
<div class="modal-body">
    <form name="login" class="form-group" action="/user/login" method="post" accept-charset="UTF-8">

        <div class="form-group">
            <label>用户名</label>
            <input name="username" class="form-control" type="text" placeholder="请输入用户名" value="${messageError}">
        </div>
        <div class="form-group">
            <label>密码</label>
            <input name="password" class="form-control" type="password" placeholder="请输入密码">
        </div>
      <%--  <div class="form-group">
            <label>验证码</label>
            <input name="code" id="code" type="text" size="10">
            <img src="validate.jsp" name="imgValidate" onclick="refresh()">
        </div>--%>
        <div class="text-right">
            <button class="btn btn-primary" type="submit">登录</button>
            <button class="btn btn-default" data-dismiss="modal">关闭</button>
        </div>
    </form>
</div>
<script src="/js/jquery.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
</body>
</html>
