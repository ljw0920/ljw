package com.woody.servlet;

import javax.servlet.*;
import java.io.IOException;

public class AaServlet extends GenericServlet {

    //service服务
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("AaServlet service");
//        String username = servletRequest.getParameter("username");
//        System.out.println(username);

        ServletConfig config = getServletConfig();
        ServletContext context1 = servletRequest.getServletContext();
        ServletContext context2 = getServletContext();
        System.out.println(context1 == context2);

        String name = config.getInitParameter("name");
        String country = context1.getInitParameter("country");

        System.out.println(name);
        System.out.println(country);
    }
}
