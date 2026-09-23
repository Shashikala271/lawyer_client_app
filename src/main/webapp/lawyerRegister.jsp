
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>




<!DOCTYPE html>
<html>
<head>
    <title>Lawyer Sign Up</title>

    <style>
        body {
            font-family: Arial;
            background: #f5f3ff;
        }

        form {
            width: 400px;
            margin: 50px auto;
            padding: 30px;
            background: white;
            border-radius: 10px;
            box-shadow: 0 4px 15px #ccc;
        }

        h2 {
            text-align: center;
            color: #6a1b9a;
            margin-bottom: 25px;
        }

        label {
            display: inline-block;
            width: 120px;
            font-weight: bold;
        }

        input[type="text"],
        input[type="email"],
        input[type="tel"],
        input[type="password"] {
            width: 200px;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        input[type="submit"] {
            display: block;
            margin: 10px auto;
            padding: 10px 30px;
            background: #6a1b9a;
            color: white;
            border: 0;
            border-radius: 5px;
            font-weight: bold;
        }
    </style>
</head>

<body>

<form action="lawyerRegister" method="post">

    <h2>Lawyer Sign Up</h2>

    <label>Name</label>
    <input type="text" name="name" placeholder="Enter the name" required>
    <br><br>

    <label>Email</label>
    <input type="email" name="email" placeholder="Enter the email" required>
    <br><br>

    <label>Address</label>
    <input type="text" name="address" placeholder="Enter Address" required>
    <br><br>


    <label>Contact</label>
    <input type="tel" name="phoneNumber" placeholder="Enter phone number" required>
    <br><br>

    <label>Client ID</label>
    <select name="clientId">
 <option value="">-- Select Client --</option>

<c:forEach items="${allClients}" var ="client">

     <option value="${client.id}">${client.getId()}</option>
 </c:forEach>

     </select>
     <button type="button"><a href="getClients">GetClients</a></button>
        <br><br>

    <input type="submit" value="SUBMIT">

</form>



</body>
</html>