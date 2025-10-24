<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp</title>
</head>
<body>
    <h1>jsp 동적페이지</h1>
    <p> <% //doGet()함수 내부
    int a=10;
    int b=20;
    //response.getWriter().print(a+b);
    %></p>
    <p><%=a+b%></p>
</body>
</html>
