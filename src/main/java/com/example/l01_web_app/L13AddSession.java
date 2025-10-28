package com.example.l01_web_app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/l13add_session.do")
public class L13AddSession extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //서버가 세션객체를 저장하고 있다가
        //세션객체에 정의된 id와 동일한 id를 쿠키로 갖는 브라우저가 접속하면!!
        //요청객체에 세션을 포함시켜 서블릿을 동작
        HttpSession session=req.getSession();
        session.setAttribute("userId","smu1234"); //forward req.setAttribute(key,value);
        session.setAttribute("userPw",7777);
        //서버에 저장된 세션객체에 정보를 바로 추가!!
        //session : 브라우저 종료 JSESSIONID 쿠키가 사라져서  해당세션을 찾을 수 없음
        //session : 재접속이 30분간 없으면 만료시간이 다되어 서버내부에서 삭제
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out=resp.getWriter();
        out.println("<h1>세션 저장완료!!!</h1>");
    }
}
