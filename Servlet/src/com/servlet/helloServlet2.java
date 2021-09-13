package com.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName: helloServlet2
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/8/30 17:05
 **/

public class helloServlet2 extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        //当重写了init方法后，一定要调用super.init(config);
        super.init(config);
        System.out.println("重写了init初始化方法，做了一些工作");
    }

    /*方法描述
     * @author: TianXing.Xue
     * @Description: doGet()方法在get请求的时候调用
     * @param:
     * @return:
     * @date: 2021/8/30 17:07
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("helloServlet2的 doGet方法");

        //getServletConfig()方法也可以调用
        ServletConfig servletConfig = getServletConfig();
        System.out.println(servletConfig);

//        2、获取初始化参数 init -param
        System.out.println("初始化参数username的值是：" + servletConfig.getInitParameter("username"));
        System.out.println("初始化参数url的值是：" + servletConfig.getInitParameter("url"));
    }

    /*方法描述
     * @author: TianXing.Xue
     * @Description: doPost()方法在post请求的时候调用
     * @param:
     * @return:
     * @date: 2021/8/30 17:07
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("helloServlet2的 doPost方法");
    }
}
