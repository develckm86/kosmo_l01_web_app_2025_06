package com.example.l01_web_app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//동적리소스의 주소를 정의하는 방법
//DD(web.xml:배포설정) 에서 정의
//

@WebServlet(value = "/l01servlet.do")
public class L01Servlet extends HttpServlet {
    //doGet doPost
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("안녕! 난 서블릿.doGet 이야!!");
        System.out.println("hello i am servlet");

        //응답 : 클라이언트가 요청한 데이터를 전달
        //HttpServletResponse resp : 응답객체로 문자열 데이터를 작성하면 자동으로 응답!
        resp.setCharacterEncoding("UTF-8");
//        resp.setContentType("text/html;charset=utf-8");
//        PrintWriter out=resp.getWriter();
//        out.println("<h1>hello i am servlet!!!!</h1>");
//        out.println("<h2>한글이 깨질겁니다~ ㅠㅠ</h2>");
        resp.setContentType("application/json;charset=UTF-8");
        PrintWriter out=resp.getWriter();
        out.println("{\"id\":\"develckm86\",\"pw\":1234}");
    }
}
