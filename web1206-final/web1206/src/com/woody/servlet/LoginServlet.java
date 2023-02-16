package com.woody.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1. 获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String remPwd = request.getParameter("remPwd");



        //2. 调用业务方法
        boolean flag = false;
        if("admin".equals(username)) {
            flag = true;
        }

        //登入成功
        if(flag){
            //并且客户选择了，记住密码
            if("1".equals(remPwd)) {
                Cookie cookie1 = new Cookie("username", username);
                Cookie cookie2 = new Cookie("password", password);
                Cookie cookie3 = new Cookie("remPwd", "1");

                response.addCookie(cookie1);
                response.addCookie(cookie2);
                response.addCookie(cookie3);
            } else {
                Cookie cookie = new Cookie("remPwd", "0");
                response.addCookie(cookie);
            }
            request.getSession().setAttribute("username", username);
            request.getRequestDispatcher("/main.jsp").forward(request, response);
        } else {
           // request.setAttribute("msg", "登入失败");
            response.sendRedirect("/1-login.jsp");
        }
    }
}
