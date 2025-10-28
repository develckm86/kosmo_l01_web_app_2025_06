<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<p>톰캣서버 서비스 등록 수업</p>
<br/>
<a href="hello-servlet">안녕하세요!! 웹어플리케이션입니다.</a>
<br>
<%-- localhost:8080/l01_web_app_war[컨텍스트패스 : 톰캣이 여러 wap 실행할 수 있는데 구분]/  --%>
<%--/l01servlet.do => localhost:8080/l01servelt.do  --%>
<%--./l01servlet.do => localhost:8080/l01_web_app_war/l01servelt.do  --%>
<a href="./l01servlet.do">서블릿 생성!!</a>
<hr>
<h2>파마미터 요청 처리</h2>
<a href="./l02request.do?a=10&b=20">요청처리?a=10&b=20(쿼리스트링)</a>
<br>
<a href="./l02request.do?a=99&b=77">요청처리?a=99&b=77(쿼리스트링)</a>
<br>
<a href="./l02request.do?a=99">요청처리?a=99(쿼리스트링)</a>
<hr>
<h2>post 요청처리(doPost)</h2>
<p>ulr 로 서버에 리소스를 요청할때 요청하는 클라이언트의 정보를 포함하는 곳 요청본문해더에 쿼리스트링을 포함함!</p>
<p>요청 헤더는
    클라이언트(브라우저 또는 프로그램)가 서버에 요청을 보낼 때 함께 전달하는 추가 정보입니다.
    즉, “요청의 부가 설명서”라고 할 수 있습니다.
</p>
<form action="./l03post.do" method="POST">
    <p>
        <label>유저아이디 : <input type="text" name="userId" value="smu777"></label>
    </p>
    <p>
        <lable>비밀번호 : <input type="password" name="userPw" value="1234"></lable>
    </p>
    <p>
        <button>로그인</button>
    </p>
</form>
<hr>
<h2>JSP JavaServerPage</h2>
<p><a href="l04jsp.jsp">jsp 문서 호출</a></p>
<p>
    <a href="l05jspParam.jsp?id=a_1234&name=경민">
        jsp 파라미터 전달 및 호출
    </a>
</p>
<div>
    <h3>l05jspParam.jsp을 post 방식으로 호출</h3>
    <form action="l05jspParam.jsp" method="POST">
        <p>
            <label>id :
                <input name="id" value="id_test_123" type="text">
            </label>
        </p>
        <p>
            <label>name :
                <input name="name" value="경민코딩" type="text">
            </label>
        </p>
        <p>
            <button type="button">버튼</button>
            <button type="reset">리셋</button>
            <button type="submit">제출</button>
            <input type="submit" value="제출2">
        </p>
    </form>
</div>
<hr>
<h2>forward로 jsp 를 뷰로 사용하자!</h2>
<%
    //contextPath : 톰캣에서 여러웹앱을 구분하기 위해 만든경로
    String contextPath=request.getContextPath();
    // "/l01_web_app_war_exploded"
%>

<p><a href="<%=contextPath%>/l06forward.do">포워드</a></p>
<%--<p><a href="l06forward.do">포워드</a></p>--%>

<p><a href="l07users.do">유저리스트</a></p>
<hr>
<h2>리다이렉트 : 서버 내부에서 다른 페이지로 이동 (302)</h2>
<p><a href="l08redirect.do">리다이렉트</a></p>
<p><a href="l09login_form.jsp">로그인폼</a></p>
<%
String loginResultStr=request.getParameter("loginResult");
//null, "falsess","t" => 오류
try{
    boolean loginResult=Boolean.parseBoolean(loginResultStr);
    if(loginResult){
        //out.println("<script>alert('로그인 성공')</script>");
    %>
        <script>
            alert("로그인 성공!")
        </script>
    <%
    }
}   catch (Exception e){
    e.printStackTrace(); //오류는 무시
}

%>
<hr>
<h2>브라우저에 남기는 데이터 쿠키</h2>
<p>서버의 응답으로 브라우저에 저장되며 브라우저가 서버에 요청할때마다 따라다님</p>
<p><a href="l10cookie.do">쿠키만들기</a></p>
<p><a href="l10get_cookie.do">쿠키 가져오기</a></p>
<p><a href="l11cookie_home.jsp">쿠키 팝업 홈</a></p>



<br><br><br><br><br><br><br><br><br><br>
<%--/Users/som/Downloads/apache-tomcat-11.0.13/bin
/Users/som/Downloads/apache-tomcat-11.0.13/bin/catalina.sh

sudo chmod +x catalina.sh


sudo chown -R $(whoami) /Users/som/Downloads/apache-tomcat-10.1.48

--%>
</body>
</html>