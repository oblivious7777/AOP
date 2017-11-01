<%@ page language="java" contentType="text/html; charset=UTF-8"
                pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>输入新的学生信息</title>

</head>
<body>
<form method="post" action="${pageContext.request.contextPath }/add"><!--指向的是路径名称-->
    <table width="100px" border=1>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name" value="" /></td>
        </tr>
        <tr>
            <td>班级</td>
            <td><input type="text" name="home" value="" /></td>
        </tr>
        <tr>
            <td>学号</td>
            <td><input type="text" name="no" value="" /></td>
        </tr>
        <tr>
            <td>入学时间</td>
            <td><input type="text" name="entranceTime" value="" /></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="text" name="sex" value="" /></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" name="age" value="" /></td>
        </tr>
        <tr>
            <td>qq</td>
            <td><input type="text" name="qq" value="" /></td>
        </tr>
        <tr>
            <td>学校</td>
            <td><input type="text" name="school" value="" /></td>
        </tr>
        <tr>
            <td>城市</td>
            <td><input type="text" name="city" value="" /></td>
        </tr>
        <tr>
            <td>格言</td>
            <td><input type="text" name="motto" value="" /></td>
        </tr>

        <tr>
            <td colspan="5" align="center"><input type="submit" value="提交" />
            </td>
        </tr>
    </table>
</form>

<a href="http://47.94.245.252">返回查询界面</a>
</body>

</html>