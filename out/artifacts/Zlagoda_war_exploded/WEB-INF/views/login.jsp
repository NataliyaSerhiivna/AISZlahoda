<%--
  Created by IntelliJ IDEA.
  User: Никита
  Date: 27.05.2024
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="C:\Users\Никита\Downloads\Tieliehin_client_server_app-main\Tieliehin_client_server_app-main\Zlagoda\web\resources\css\styles.css">
</head>
<body>
<div class="container">
    <h2>Login</h2>
    <div class="form-group">
        <label for="username">Username:</label>
        <input type="text" class="form-control" id="username" name="username" required>
    </div>
    <div class="form-group">
        <label for="password">Password:</label>
        <input type="password" class="form-control" id="password" name="password" required>
    </div>
    <button type="submit" class="btn btn-primary">Login</button>
</div>
</body>
</html>
