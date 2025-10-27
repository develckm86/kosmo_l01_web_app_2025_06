<%--response.setContentType("text/html;charset=UTF-8")--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- jsp 주석 --%>
<%-- out.print("<html>") --%>
<%!
//class L05JspParam extends HttpServlet{
//  전역
// }
    private int a=10;
    private final String NAME="상수";
%>
<html>
<head>
    <title>jsp 문서에 파라미터를 받아서 처리</title>
</head>
<body>
    <h1>jsp 문서에 파라미터를 받아서 처리</h1>
    <% //doPost(req,resp){doGet(req,resp);}

        //doGet(HttpServletRequest request, HttpServletResponse) response
        // 함수 내부
        //PrintWriter out=response.getWriter()
        String id=request.getParameter("id");
        String name=request.getParameter("name");
        //out.println("<p> id : "+id+"</p>");
        //out.println("<p> name : "+name+"</p>");
    %>
    <p>id : <%=id%></p>
    <p>name : <%=name%></p>
</body>
</html>
