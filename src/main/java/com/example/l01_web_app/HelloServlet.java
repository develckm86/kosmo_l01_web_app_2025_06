package com.example.l01_web_app;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;



//http://localhost:8080/l01_web_app_war_exploded/

//리소스 : 동적 ,정적
//동적리소스 : 프로그램언어(java,js,c#,c)로 작성되어서,DB 접속(JDBC,Dao,Service)
//정적리소스 : html,css,js(프론트에서 실행)
@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    @Override
    public void init() {
        message = "Hello Web Application";
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h1>" + (1+3+12)*19 + "</h1>");
        out.println("</body></html>");
    }
    @Override
    public void destroy() {
    }
}