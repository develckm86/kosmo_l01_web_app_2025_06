package com.example.l01_web_app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/l13remove_session.do")
public class L13RemoveSession extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        //session.invalidate(); //로그아웃시 사용, 세션 파기
        session.removeAttribute("userId");
        session.removeAttribute("userPw");
        //몇개의 세션을 삭제할때 사용
        resp.sendRedirect("./index.jsp");
    }
}
