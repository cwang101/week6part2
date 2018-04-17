<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>员工列表</title>
</head>
<body>


<table border="1" cellspacing="0" style="text-align:center;width:80%;height: 300px"  >
    <thead>
        <tr bgcolor="black">
            <td><font size="4" color="white">编号</font></td>
            <td><font size="4" color="white">姓名</font></td>
            <td><font size="4" color="white">年龄</font></td>
            <td><font size="4" color="white">性别</font></td>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${employees}" var="employee">
            <tr >
                <td>${employee.id}</td>
                <td>${employee.name}</td>
                <td>${employee.age}</td>
                <td>${employee.gender}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
