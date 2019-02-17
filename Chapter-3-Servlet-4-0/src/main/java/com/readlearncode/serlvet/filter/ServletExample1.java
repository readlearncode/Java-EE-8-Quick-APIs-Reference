package com.readlearncode.serlvet.filter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ServletExample1 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("Reached Servlet");

    }

}