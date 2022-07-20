<%--
  Created by IntelliJ IDEA.
  User: E146796
  Date: 7/19/2022
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer Page</title>
</head>
<body>
    <h1>Customer Name: <c:out value="${name}"/></h1>
    <p>Item name: <c:out value="${itemName}"/></p>
    <p>Price: $<c:out value="${price}"/></p>
    <p>Description: <c:out value="${description}"/></p>
    <p>Vendor: <c:out value="${vendor}"/></p>
</body>
</html>
