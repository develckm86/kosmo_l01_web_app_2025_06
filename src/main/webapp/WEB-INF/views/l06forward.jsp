<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>유저 이름 조회</title>
    <style>
        body{
            padding: 0;
            margin: 0;
        }
    </style>
</head>
<body>
    <%
        Object namesObj =request.getAttribute("names");
        List<String> names=(List<String>) namesObj;
        out.println(names);
    %>
    <h1>유저 이름 조회</h1>
    <hr>
    <ul>
        <%for(String name: names){%>
            <li style="color: aquamarine">이름은 <%=name%></li>
        <%}%>
    </ul>
</body>
</html>
