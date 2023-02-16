package com.woody.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AcServlet extends HttpServlet {

    /*
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Ac servlet");

        ServletConfig config = getServletConfig();
        ServletContext context1 = request.getServletContext();
        ServletContext context2 = getServletContext();
        System.out.println(context1 == context2);


        String name = config.getInitParameter("name");
        String country = context1.getInitParameter("country");
        String username = request.getParameter("username");
        String username2 = (String) request.getAttribute("username");

        System.out.println(name);
        System.out.println(country);


    }

}
