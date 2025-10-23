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
<br><br><br><br><br><br><br><br><br><br>
<%--/Users/som/Downloads/apache-tomcat-11.0.13/bin
/Users/som/Downloads/apache-tomcat-11.0.13/bin/catalina.sh

sudo chmod +x catalina.sh


sudo chown -R $(whoami) /Users/som/Downloads/apache-tomcat-10.1.48

--%>
</body>
</html>