
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

<title>getClientNameByLawyerId</title>

</head>

<body>
<form action ="getClientNameByLawyerId" method="get">


 <label>Enter the Lawyer Id</label>
    <input type="number" name="lawyerId" placeholder="Enter the ID" required>

    <input type="submit" value="SEARCH">
    <br><br>

</form>


<h2>${clientName}</h2>

</body>
</html>