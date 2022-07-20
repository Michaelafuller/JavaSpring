<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Omikuji Form</title>
</head>
<body>
<h1>Send an Omikuji!</h1>
    <form action="/submit" method="post">
        <label>Pick any number from 5 to 25</label>
        <input type="number" min="5" max="25" name="yearNumber"/>

        <label>Enter the name of any city</label>
        <input type="text" maxlength="25" name="city"/>

        <label>Enter the name of any real person</label>
        <input type="text" maxlength="25" name="roommate">

        <label>Enter professional endeavor or hobby</label>
        <input type="text" maxlength="50" name="job"/>

        <label>Enter any type of living thing</label>
        <input type="text" maxlength="25" name="livingThing">

        <label>Say something nice to someone</label>
        <textarea name="message"></textarea>

        <label>Send and show a friend</label>
        <input type="submit" value="Send">
    </form>
</body>
</html>
