<%-- 
    Document   : lang
    Created on : 24 Oct, 2024, 8:27:39 AM
    Author     : hites
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Num1 :${param.num1} <br />
        Num2 :${param.num2} <br />
        Addition : ${param.num1 + param.num2}
    </body>
</html>
