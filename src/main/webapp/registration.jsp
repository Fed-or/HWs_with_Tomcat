<%--
  Created by IntelliJ IDEA.
  User: Adi
  Date: 27.04.2019
  Time: 1:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>

<body>
<center>
    <h1><b>Зарегистрироваться:</b></h1>
    <br><br>

    <form action="registration" method="post">

        <td>Регистрация <input type="text" name="name"/></td>
        <br><br>
        <tr>
            <td>Пароль <input type="text" name="password"/></td>
        </tr>
        <br><br>
        <input type="checkbox" name="agree" value="yes"/> Согласен с политикой обработки данных </input>
        <br><br>
        <input type="submit">
    </form>
</center>
</body>
</html>
