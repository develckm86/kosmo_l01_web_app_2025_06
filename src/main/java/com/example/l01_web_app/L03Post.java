package com.example.l01_web_app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/l03post.do")
public class L03Post extends HttpServlet {
    //method="POST" 인 양식 데이터를 처리
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId=req.getParameter("userId");
        String userPw=req.getParameter("userPw");
        System.out.println(userId);
        System.out.println(userPw);
        //UserService.login()=> 로그인성공!!
        //User id=sum777 pw=1234
        String msg="로그인실패";
//        if (userId=="smu777" && userPw=="1234"){msg="로그인성공!";}
        if(userId.equals("smu777") && userPw.equals("1234")){
            msg="로그인성공";
        }
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("<h1>"+msg+"</h1>");
        resp.getWriter().write("<h2>다시배포테스트</h2>");
    }
}
