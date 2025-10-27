package com.example.l01_web_app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/l09login_action.do")
public class L09LoginAction extends HttpServlet {
    //action : 양식 데이터를 처리 (DML Insert,Delete,Update)
    //405 : 서블릿에 get으로 요청했는데 doGet이 구현되지 않음
    //존재하지 않는 동적리소스를 요청(같은 이름의 다른 동적리소스는 존재함)
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        String pw=req.getParameter("pw");
        //UserDto existUser=UserService.login(id,pw);
        String existId="kosmo_smu";
        String existPw="1234";
        boolean loginResult=false;
        if(id.equals(existId) && pw.equals(existPw)){
            loginResult=true;
        }
        /*
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<h1>로그인액션페이지(옛날버전 25년전)</h1>");
        if(loginResult){
            out.println("<h2>로그인 성공</h2>");
            out.println("<a href='./index.jsp'>메인페이지로</a>");
        }else{
            out.println("<h2>로그인 실패</h2>");
            out.println("<a href='./l09login_form.jsp'>로그인으로</a>");
        }
        */
        ///리다이렉트를 하면 해당 서블릿은 절대절대절대!!! 응답하지 않는다.
        if (loginResult){
            resp.sendRedirect("./index.jsp?loginResult=true");
        }else {
            resp.sendRedirect("./l09login_form.jsp?loginResult=false");
        }
    }
}
