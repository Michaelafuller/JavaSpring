<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Fruity Loops</title>
</head>
<body>
<h1>Fruit Store</h1>
<div>
    <table>
        <tbody>
        <tr>
            <th>Name</th>
            <th>Price</th>
        </tr>
        <c:forEach var="eachFruit" items="${fruitsArray}">
            <tr>
                <td><c:out value="${eachFruit.name}"></c:out></td>
                <td><c:out value="${eachFruit.price}"></c:out></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
