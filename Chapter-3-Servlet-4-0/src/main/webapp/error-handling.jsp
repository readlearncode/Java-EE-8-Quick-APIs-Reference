<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error Page</title>
</head>
<body>

<br/>javax.servlet.error.status_code: <%=request.getAttribute("javax.servlet.error.status_code")%>
<br/>javax.servlet.error.exception_type: <%=request.getAttribute("javax.servlet.error.exception_type")%>
<br/>javax.servlet.error.message: <%=request.getAttribute("javax.servlet.error.message")%>
<br/>javax.servlet.error.exception: <%=request.getAttribute("javax.servlet.error.exception")%>
<br/>javax.servlet.error.request_uri: <%=request.getAttribute("javax.servlet.error.request_uri")%>
<br/>javax.servlet.error.servlet_name: <%=request.getAttribute("javax.servlet.error.servlet_name")%>

</body>
</html>
