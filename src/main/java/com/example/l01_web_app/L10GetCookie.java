package com.example.l01_web_app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/l10get_cookie.do")
public class L10GetCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out=resp.getWriter();
        out.println("<h1>저장된 쿠키 조회</h1>");
        // userName 쿠키
        // localhost:8888/[cotext-path]/* : 브라우저가 해당 요청을 할때 쿠키가 따라다님
        Cookie[] cookies=req.getCookies(); //해당 요청에 따라온 모든 쿠키를 반환
        if(cookies!=null){
            for(Cookie c: cookies){
                out.println("<p>");
                out.println(c.getName());
                out.println(":");
                out.println(c.getValue());
                out.println("</p>");
            }
        }

    }
}
