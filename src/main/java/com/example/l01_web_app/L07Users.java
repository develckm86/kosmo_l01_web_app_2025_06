package com.example.l01_web_app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/l07users.do")
public class L07Users extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //유저리스트
        Map<String,Object> user1 = new HashMap<>();
        user1.put("name","경민");
        user1.put("age",39);
        user1.put("isMarried",true);
        Map<String,Object> user2 = new HashMap<>();
        user2.put("name","지형");
        user2.put("age",35);
        user2.put("isMarried",false);
        Map<String,Object> user3 = new HashMap<>();
        user3.put("name","가은");
        user3.put("age",20);
        user3.put("isMarried",false);
        List<Map<String,Object>> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3); //UsersService.readAll()
        //forward : 요청을 서브릿에서 마무리 하지않고 jsp에서 요청과 응답을 마무리시킴
        //forward는 요청이 2번 일어난다.
        //데이터처리는 servlet(java) 뷰 출력(렌더링)은 jsp가
        req.setAttribute("users",users);
        req.getRequestDispatcher("/WEB-INF/views/l07users.jsp")
                .forward(req,resp);




    }
}
