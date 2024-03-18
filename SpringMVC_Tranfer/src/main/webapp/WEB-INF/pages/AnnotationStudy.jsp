<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2024/3/18
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <h2 align="center">注解简要使用</h2>
        <h3 align="center">
            1.@RequestBody 注解
            <!-- request body 注解 -->
            <form action="annotationStudy/requestbody" method="post">
                用户名称：<input type="text" name="username" ><br/>
                用户密码：<input type="password" name="password" ><br/>
                用户年龄：<input type="text" name="age" ><br/>
                <input type="submit" value=" 保存 ">
            </form>
            <a href="annotationStudy/requestbody?body=test">requestBody 注解 get 请求</a>
        </h3>
        <h3 align="center">
            2.@PathVariable 注解
            <!-- PathVariable 注解 -->
            <a href="annotationStudy/pathVariable/100">pathVariable 注解</a>
        </h3>
        <h3 align="center">
            3.@RequestHeader 注解
            <!-- RequestHeader 注解 -->
            <a href="annotationStudy/requestHeader">获取请求消息头</a>
        </h3>
        <h3 align="center">
            4.@CookieValue 注解
            <!-- CookieValue 注解 -->
            <a href="annotationStudy/cookieValue">绑定 cookie 的值</a>
        </h3>
        <h3 align="center">
            5.@SessionAttribute 注解
            <!-- SessionAttribute 注解的使用 -->
            <a href="springmvc/testPut">存入 SessionAttribute</a>
            <hr/>
            <a href="springmvc/testGet">取出 SessionAttribute</a>
            <hr/>
            <a href="springmvc/testClean">清除 SessionAttribute</a>
        </h3>
        <h3 align="center">
            5.@ModelAttribute 注解: 未实现
        </h3>

</body>
</html>
