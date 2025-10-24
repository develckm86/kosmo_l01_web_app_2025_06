package com.example.l01_web_app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/l02request.do")
public class L02Request extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //url : 클라이언트의 요청 (클라이언트가 요청하는 리소스의 위치)
        //url?param=안녕&param2=1.... : 쿼리스트링 (동적리스소에게 이 파라미터로 데이터를 처리해서 주세요!)
        //HttpServletRequest req : 클라이언트의 요청정보를 처리하는 객체
        //?a=10&b=20
        String aStr=req.getParameter("a"); //"10"
        String bStr=req.getParameter("b"); //"20"
        System.out.println("a:"+aStr);
        System.out.println("b:"+bStr);
        System.out.println("i am request.do");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out=resp.getWriter();
        out.println("<html>");
        out.println("<h1 style='color:red;'>요청한 a,b 파라미터 처리</h1>");
        out.println("<p> a:"+aStr+"</p>");
        out.println("<p> b:"+bStr+"</p>");
        out.println("<p> aStr+bStr:"+(aStr+bStr)+"</p>");
        try{
            int a=Integer.parseInt(aStr);
            int b=Integer.parseInt(bStr);
            out.println("<p> a+b:"+(a+b)+"</p>");
        }catch(NumberFormatException e){
            e.printStackTrace();
            //out.println("400에러 : 요청할 파라미터를 잘못보낸것! ");
            resp.sendError(400);
            //404 : 요청한 페이지가 없음
        }
        out.println("</html>");
        //-Dfile.encoding=UTF-8
        //-Dconsole.encoding=UTF-8
        //-Dsun.stdout.encoding=UTF-8
        //-Dsun.stderr.encoding=UTF-8

    }
}
