package com.readlearncode.serlvet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class RequestHandlingMethods extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().append("You called the doGet method");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().append("You called the doPost method");
    }

    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().append("You called the doPut method");
    }

    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().append("You called the doDelete method");
    }

    protected void doHead(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().append("You called the doHead method");
    }

    protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().append("You called the doOptions method");
    }

    protected void doTrace(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().append("You called the doTrace method");
    }

}