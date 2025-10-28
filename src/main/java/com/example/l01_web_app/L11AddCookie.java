package com.example.l01_web_app;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/l11add_cookie.do")
public class L11AddCookie extends HelloServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Cookie hidePopupCookie=new Cookie("hidePopup","1");
        hidePopupCookie.setPath(request.getContextPath());
        //hidePopupCookie.setPath("/"); //안됨!!
        hidePopupCookie.setMaxAge(60*60*24*7);//일주일
        //hidePopupCookie.setMaxAge(60*2);
        response.addCookie(hidePopupCookie);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("일주일간 안보기 쿠키생성 완료");
        //창을 종료=>script
        out.println("<script> setTimeout(()=>{ window.close(); }, 1000)</script>");



    }
}
