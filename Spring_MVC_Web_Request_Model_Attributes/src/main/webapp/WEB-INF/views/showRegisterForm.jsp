<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(to right, #83a4d4, #b6fbff);
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }
    .form-container {
        background-color: #fff;
        padding: 30px 40px;
        border-radius: 12px;
        box-shadow: 0 8px 16px rgba(0,0,0,0.2);
        width: 350px;
    }
    .form-container h2 {
        text-align: center;
        margin-bottom: 20px;
        color: #333;
    }
    .form-container input[type="text"] {
        width: 100%;
        padding: 10px 12px;
        margin: 8px 0 16px 0;
        border: 1px solid #ccc;
        border-radius: 6px;
        box-sizing: border-box;
    }
    .form-container input[type="submit"] {
        width: 100%;
        background-color: #4CAF50;
        color: white;
        padding: 12px;
        border: none;
        border-radius: 6px;
        cursor: pointer;
        font-size: 16px;
        transition: background 0.3s ease;
    }
    .form-container input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>

<div class="form-container">
    <h2>Student Registration</h2>
    <form action="/Spring_MVC_Web_Request_Model_Attributes/register" method="post">
        <label>First Name:</label>
        <input type="text" name="firstName" required>
        
        <label>Last Name:</label>
        <input type="text" name="lastName" required>
        
        <label>Email:</label>
        <input type="text" name="email" required>
        
        <label>Mobile:</label>
        <input type="text" name="mobile" required>
        
        <input type="submit" value="Register">
    </form>
</div>

</body>
</html>
