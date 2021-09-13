package com.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        1、获取 web.xml 中配置的上下文参数 context - param
        ServletContext servletContext = getServletConfig().getServletContext();
        String username = servletContext.getInitParameter("username");
        System.out.println("context-param参数username的值是："+username);
        System.out.println("context-param参数password的值是："+servletContext.getInitParameter("password"));
//        2、获取当前的工程路径，格式: /工程路径
        System.out.println("当前工程路径："+ servletContext.getContextPath());
//        3、获取工程部署后在服务器硬盘上的绝对路径
        /*
        '/' 斜杠被服务器解析地址为：http://ip:port/工程名/ 映射到IDEA代码的web目录

         */
        System.out.println("工程部署的路劲是"+servletContext.getRealPath("/"));
//        4、像 Map 一样存取数据
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
