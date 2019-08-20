<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: dominik
  Date: 8/20/19
  Time: 4:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home page</title>
</head>
<body>

    <form:form modelAttribute="form" method="post">
        <form:errors path="*"/>
        Give an alien name: <br>
        <form:input path="name"/> <br>
        Give a tech: <br>
        <form:input path="tech"/> <br>
        <input type="submit" value="Submit">
    </form:form>

</body>
</html>
