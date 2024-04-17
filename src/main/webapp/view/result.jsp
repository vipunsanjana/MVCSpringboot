
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


<head>

    <title>Hello Vipun JSP</title>
</head>
<body>
<h1>HI : <%= request.getAttribute("year") %> </h1>
    <h1>Result : <%= request.getAttribute("user") %> </h1>

</body>
</html>
