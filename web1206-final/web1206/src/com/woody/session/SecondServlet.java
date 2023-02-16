package com.woody.session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SecondServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //String answer = request.getParameter("answer");

       // String answer = (String) getServletContext().getAttribute("eat");
        //从会话的作用域中，取出数据
        HttpSession session = request.getSession();
        String eat = (String) session.getAttribute("eat");

        if("yes".equals(eat)) {
            System.out.println("你吃了什么");
        } else {
            System.out.println("为什么没有吃？");
        }


    }
}
