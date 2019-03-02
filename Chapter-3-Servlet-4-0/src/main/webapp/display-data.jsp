
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display Data</title>
</head>
<body>

<%
    String[] messages = request.getParameterValues("message");
%>

Message: <%=messages[0]%>

<h2>Include</h2>
<br/>javax.servlet.include.mapping: <%=request.getAttribute("javax.servlet.include.mapping")%>
<br/>javax.servlet.include.request_uri: <%=request.getAttribute("javax.servlet.include.request_uri")%>
<br/>javax.servlet.include.context_path: <%=request.getAttribute("javax.servlet.include.context_path")%>
<br/>javax.servlet.include.servlet_path: <%=request.getAttribute("javax.servlet.include.servlet_path")%>
<br/>javax.servlet.include.path_info: <%=request.getAttribute("javax.servlet.include.path_info")%>
<br/>javax.servlet.include.query_string: <%=request.getAttribute("javax.servlet.include.query_string")%>

<h2>Forward</h2>
<br/>javax.servlet.forward.mapping: <%=request.getAttribute("javax.servlet.forward.mapping")%>
<br/>javax.servlet.forward.request_uri: <%=request.getAttribute("javax.servlet.forward.request_uri")%>
<br/>javax.servlet.forward.context_path: <%=request.getAttribute("javax.servlet.forward.context_path")%>
<br/>javax.servlet.forward.servlet_path: <%=request.getAttribute("javax.servlet.forward.servlet_path")%>
<br/>javax.servlet.forward.path_info: <%=request.getAttribute("javax.servlet.forward.path_info")%>
<br/>javax.servlet.forward.query_string: <%=request.getAttribute("javax.servlet.forward.query_string")%>

</body>
</html>
