<%-- 
    Document   : lang
    Created on : 24 Oct, 2024, 8:33:47 AM
    Author     : hites
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="a" value="${param.num1}" />
         <c:set var="b" value="${param.num2}" />
         <c:out value="${a + b}" />
    </body>
</html>
