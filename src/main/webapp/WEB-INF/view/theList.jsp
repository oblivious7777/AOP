<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<!--相当于response.setContentType("text/html; charset=UTF-8"); 通知浏览器以UTF-8进行中文解码   导入jar包-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户列表</title>
</head>
<body>
<table border="1" width="200px"  align='center'>
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>
    <c:forEach items="${list}" var="c" varStatus="st"><!--打印循环-->
    <tr>
        <td>${c.id}</td>
        <td>${c.name}</td>
        <td><a href="selI/${c.id}">查询</a></td>
        <td><a href="del/${c.id}">删除</a></td>
        </c:forEach>
</table>
<div style="text-align:center">
    <a href="?start=0">首  页</a>
    <a href="?start=${page.start-page.count}">上一页</a>
    <a href="?start=${page.start+page.count}">下一页</a>
    <a href="?start=${page.last}">末  页</a>
</div>
</table>
</body>
<body>
<a href="/add" >添加</a>
<a href="/upd">改</a>
</body>
</html>

