<%@ page import="jakarta.servlet.http.HttpSession" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<% HttpSession session1 = request.getSession(); %>
<head>

    <title>Hello Vipun JSP</title>
</head>
<body>
    <h1>Result : <%= session1.getAttribute("result") %> </h1>

</body>
</html>
