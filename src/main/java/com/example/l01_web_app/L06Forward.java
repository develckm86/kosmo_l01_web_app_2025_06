package com.example.l01_web_app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

//@WebServlet("/l06forward.do")
//DD(배포서술자 web.xml) : 서블릿의 url 등록!
public class L06Forward extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("안녕 난 jsp를 forward할거야!!");
        //List<String> names=userService.readNames();
        List<String> names=new ArrayList<>();
        names.add("경만");
        names.add("범쭌");
        names.add("찌형");
        names.add("쩡호");
        names.add("혜찌");
        names.add("까은");
        names.add("현태");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<style>");
        out.println("body{margin:0}");
        out.println("</style>");
        out.println("<ul>");
        for (String name : names) {
            out.println("<li>이름 :"+name+"</li>");
        }
        out.println("</ul>");
        //포워드할 view에 객체 전달!!!
        req.setAttribute("names",names); //Object
        req.getRequestDispatcher("/WEB-INF/views/l06forward.jsp")
                .forward(req, resp);

    }
}
