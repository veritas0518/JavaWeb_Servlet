package com.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class helloServlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("helloServlet3的 doGet方法");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("helloServlet3的 doPost方法");
    }
}
