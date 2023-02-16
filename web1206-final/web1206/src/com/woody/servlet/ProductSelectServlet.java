package com.woody.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class ProductSelectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("select product Servlet");
        String[] products = request.getParameterValues("product");

        HttpSession session = request.getSession();
        session.setAttribute("products", products);

        //转发到jsp进行显示
        //response.writer().println("<html>"):
        request.getRequestDispatcher("/2-cart.jsp").forward(request, response);

    }

}
