<%@ page import="cn.edu.ncu.bookstore.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: 16051
  Date: 2018/12/8
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <link href="/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="/css/style.css" rel="stylesheet"/>
    <title>网上书店</title>
</head>
<body onload="initAJAX();showCategory()">
<div class="modal fade" id="myModal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header"></div>
            <div class="modal-body"></div>
            <div class="modal-footer"></div>
        </div>
    </div>
</div>

<div class="header">
    <div class="container">
        <div class="row">
            <div class="login span4">
                <h1><a href=""> 欢迎来到<strong>我的</strong>书店</a>
                    <span class="red">.</span></h1>
            </div>
            <div class="links span8">
                <%
                    User user= (User) session.getAttribute("u");
                    if (user==null){
                        %>
                <a  href="/index/login" rel="tooltip" data-placement="bottom" data-toggle="modal" ><img src="/images/login.png"></a>
                <a  href="/index/register" rel="tooltip" data_placement="bottom"><img src="/images/register.png"></a>
                <%
                    }else{
                        %>
                <a  href="/index/login" rel="tooltip" data-placement="bottom" data-toggle="modal" ><%=user.getUsername()%></a>
                <a  href="/index/register" rel="tooltip" data_placement="bottom">注销</a>
                <%
                    }
                %>
            </div>
        </div>
    </div>
</div> <%--header--%>

<div class="row"> <%--下方左右div控制--%>
    <div class="col-md-3"> <%--左侧菜单div控制--%>
        <ul class="nav nav-list" id="categoryList">
            <li class="nav-header">书籍类型</li>
            <c:forEach items="${category}" var="category">
                <li>
                    <a href="#">${category.name}</a>
                </li>
            </c:forEach>
        </ul>
    </div><%--左侧菜单div控制--%>

    <div class="col-md-9" id="book"><%-- 书籍布局控制--%>
        <c:forEach items="${books}" var="books">
        <div class="col-sm-9 col-md-3" >
            <div class="thumbnail" >
                <img src="/images/book.jpg">
                <div class="caption">
                    <h4>${books.name}</h4>
                    <p>${books.description}</p>
                    <p>
                        <a href="#" class="btn btn-primary" role="button">加入购物车</a>
                        <a href="#" class="btn btn-default" role="button">查看详情</a>
                    </p>
                </div>
            </div>
        </div>
        </c:forEach>
    </div> <%-- 书籍布局控制--%>
</div><%--下方左右div控制--%>
<script>
    function showCategory() {
        xmlHttp.open("GET", "/category/view1", true);
        xmlHttp.onreadystatechange = function() {
            if (xmlHttp.readyState == 4) {
                if(xmlHttp.status == 200) {
                    var data = xmlHttp.responseText;
                    var obj = JSON.parse(data);
                    var listHtml = "<li class=\"nav-header\">书籍类别</li>\n" ;
                    for(var i in obj){
                        listHtml += "<li>\n" +
                            " <a href=\"javascript:showBook("+ obj[i].id + ")\">"+obj[i].name+"</a>\n" +
                            "           </li>"
                    }
                    document.getElementById("categoryList").innerHTML=listHtml;
                }
            }
        };
        xmlHttp.send();
    }
    function showBook(categoryID) {
        xmlHttp.open("GET", "/book?id="+categoryID, true);
        xmlHttp.onreadystatechange = function () {
            if (xmlHttp.readyState == 4) {
                if (xmlHttp.status == 200) {
                    var data = xmlHttp.responseText;
                    var obj = JSON.parse(data);
                    var listbook = '';
                    for (var i in obj) {
                        var bookname = obj[i].name;
                        var desc = obj[i].description;
                        if (desc.length > 20) {
                            desc = desc.substring(0, 17)
                        }
                        listbook += '<div class="col-sm-9 col-md-3">' +
                            '<div class="thumbnail" >' +
                            '<img src="/images/book.jpg">' +
                            '<div class="caption">' +
                            '<h4>' + bookname + '</h4>' +
                            '<p>' + desc + '</p>' +
                            '<p>' +
                            '<a href="#" class="btn btn-primary" role="button">加入购物车</a>' +
                            '<a href="#" class="btn btn-default" role="button">查看详情' + '</a>' +
                            '</p>' +
                            '</div></div></div>';
                    }
                    document.getElementById("book").innerHTML = listbook;
                }
            }
        };
        xmlHttp.send();
    }

</script>
<script src="/js/jquery.min.js" ></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/commons.js"></script>
</body>
</html>

