<%-- 
    Document   : lang
    Created on : 24 Oct, 2024, 8:46:32 AM
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
        <%  
            if(request.getParameter("username").length() < 3){
                out.print("Usename should be 3 lenght");
            }else {
                response.sendRedirect("message.jsp?" + request.getQueryString());
            }
                
        %>
    </body>
</html>
