package com.example.l01_web_app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/l10cookie.do")
public class L10Cookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie=new Cookie("userName","최경민");
        //cookie.setPath("/"); //컨텍스트 패스가 있어서 위험
        //cookie.setMaxAge(60*60); //1시간
        cookie.setMaxAge(60*5); //5분
        resp.addCookie(cookie); // 응답할때 브라우저가 쿠키를 저장
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out=resp.getWriter();
        out.println("<h1>userName=최경민 인 쿠키 저장 완료!!</h1>");
    }
}
