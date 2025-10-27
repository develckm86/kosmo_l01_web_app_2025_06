<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>users</title>
</head>
<body>
    <%
        Object usersObj=request.getAttribute("users");
        //out.println(usersObj);
        List<Map<String,Object>> users=(List<Map<String, Object>>) usersObj;
    %>

    <h1>조회한 유저 내역</h1>
    <hr>
    <table border="1">
        <thead>
            <tr>
                <th>이름</th>
                <th>나이</th>
                <th>결혼</th>
            </tr>
        </thead>
<%--    jsp : html 렌더링 구식     --%>
        <tbody>
            <%for(Map<String,Object> u :users){ %>
            <tr><%-- out.print("<tr>") --%>
                <td><%=u.get("name")%></td>
                <td><%=u.get("age")%></td>
                <td><%=(boolean)u.get("isMarried") ? "O":"X"%></td>
            </tr>
            <%}%>
        </tbody>
    </table>
</body>
</html>
