package com.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @ClassName: helloServlet
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/8/30 14:35
 **/

public class helloServlet implements Servlet {
    public helloServlet() {
        System.out.println("1.构造器方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2.init初始化");

//        1、可以获取 Servlet 程序的别名 servlet -name 的值
        System.out.println("helloServlet程序的别名是："+servletConfig.getServletName());
//        2、获取初始化参数 init -param
        System.out.println("初始化参数username的值是："+servletConfig.getInitParameter("username"));
        System.out.println("初始化参数url的值是："+servletConfig.getInitParameter("url"));
//        3、获取 ServletContext 对象
        System.out.println(servletConfig.getServletContext());
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /*方法描述
     * @author: TianXing.Xue
     * @Description:service()方法是专门用来处理请求和响应的
     * @param:
     * @return:
     * @date: 2021/8/30 14:38
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("3.services方法 hello servlet被访问了");

        //类型转换（因为它有getMethod()方法）
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        //获取请求的方式
        String method = httpServletRequest.getMethod();

        System.out.println(method);

        if ("GET".equalsIgnoreCase(method)) {
            doGet();
        } else if ("POST".equalsIgnoreCase(method)) {
            doPost();
        }
    }

    public void doGet() {
        System.out.println("get请求");
        System.out.println("get请求");
        System.out.println("get请求");
    }

    public void doPost() {
        System.out.println("post请求");
        System.out.println("post请求");
        System.out.println("post请求");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("4.destroy销毁方法");
    }
}
