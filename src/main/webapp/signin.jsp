<%--
  Created by IntelliJ IDEA.
  User: Adi
  Date: 01.05.2019
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<c:if test="${param.message == 'error'}">
    <h1>Вы уже зарегистрированы. Войдите под логином</h1>
</c:if>

<form action="signin" method="post">

    <td>Логин <input type="text" name="name"/></td>
    <br><br>
    <tr>
        <td>Пароль <input type="text" name="password"/></td>
    </tr>
    <br><br>
    <input type="submit">
</form>
</center>
</body>
</html>