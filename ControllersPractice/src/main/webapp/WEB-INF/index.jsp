<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Ada's Page</title>
</head>
<body>
<h1><c:out value="${firstName}"/> <c:out value="${lastName}"/></h1>
<ul>
    <li>Email: <c:out value="${email}"/></li>
    <li>Age: <c:out value="${age}"/></li>
</ul>
</body>
</html>
