<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<!--相当于response.setContentType("text/html; charset=UTF-8"); 通知浏览器以UTF-8进行中文解码   导入jar包-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询结果</title>
</head>
<body>
<table border="1" width="1000px"  align='center'>
    <tr>
        <td>id</td>
        <td>home</td>
        <td>no</td>
        <td>EntranceTime</td>
        <td>name</td>
        <td>sex</td>
        <td>age</td>
        <td>qq</td>
        <td>school</td>
        <td>city</td>
        <td>motto</td>
    </tr>
    <c:forEach items="${getName}" var="c" varStatus="st"><!--打印循环-->
    <tr>
        <td>${c.id}</td>
        <td>${c.home}</td>
        <td>${c.no}</td>
        <td>${c.entranceTime}</td>
        <td>${c.name}</td>
        <td>${c.sex}</td>
        <td>${c.age}</td>
        <td>${c.getqq()}</td>
        <td>${c.school}</td>
        <td>${c.city}</td>
        <td>${c.motto}</td>
        </c:forEach>
</table>
</table>
</body>
<a href="http://47.94.245.252">返回列表</a>
</html>
