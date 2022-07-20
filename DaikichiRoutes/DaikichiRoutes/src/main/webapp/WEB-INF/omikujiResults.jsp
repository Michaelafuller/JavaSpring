<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Results</title>
</head>
<body>
<h1>Here's Your Omikuji</h1>
<div>
    <p>In <c:out value="${yearNumber}"/> years, you will live in <c:out value="${city}"/> with
    <c:out value="${roommate}"/> as your roommate, <c:out value="${job}"/> for a living.
    The next time you see a <c:out value="${livingThing}"/>, you will have good luck.
    Also, <c:out value="${message}"/>. </p>
</div>
<a href="/">Go Back</a>
</body>
</html>
