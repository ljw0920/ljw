package com.woody.session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class FirstServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        String result = request.getParameter("eat");

      //  request.setAttribute("eat", result);
      //  request.getServletContext().setAttribute("eat", result);

        //把数据放在会话的作用域中！
        /*request.getSession();表面上是普通的方法，但是，实际上，
        tomcat从这个Http访问的过程，查看是否有携带JSessionId数据。
        如果没有携带，那么就在服务端创建一个session对象，返回。
            不但返回session对象。同时，服务器还把 JsessionId="5F232"放在响应的数据里
        如果有携带数据，“5F2323FDsdfa”（键），服务器就在服务端通过提供的jsessionId
        作为键，查询到相应session(这个客户端的session对象)返回
         */
        HttpSession session = request.getSession();
        session.setAttribute("eat", result);


        System.out.println(result);
    }
}
