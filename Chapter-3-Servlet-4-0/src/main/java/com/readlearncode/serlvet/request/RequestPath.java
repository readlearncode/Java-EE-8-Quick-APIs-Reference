package com.readlearncode.serlvet.request;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class RequestPath extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter writer = response.getWriter();

        String contextPath = request.getContextPath();
        writer.append("Context Path: " + contextPath);

        String servletPath = request.getServletPath();
        writer.append("\nServlet Path: " + servletPath);

        String pathInfo =  request.getPathInfo();
        writer.append("\nPath Info: " + pathInfo);


    }
}