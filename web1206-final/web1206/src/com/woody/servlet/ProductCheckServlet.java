package com.woody.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class ProductCheckServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ProductCheckServlet");
        String[] products = request.getParameterValues("product");

        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(10);
        session.setAttribute("checkProducts", products);

        request.getRequestDispatcher("/3-check.jsp").forward(request, response);


    }
}
