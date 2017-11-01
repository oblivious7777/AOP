<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>修改信息</title>

</head>
<body>
<form method="post" action="${pageContext.request.contextPath }/upd"><!--指向的是路径名称-->
    <table width="100px" border=1>
        <tr>
            <td>id</td>
            <td><input type="text" name="id" value="" /></td>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name" value="" /></td>
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