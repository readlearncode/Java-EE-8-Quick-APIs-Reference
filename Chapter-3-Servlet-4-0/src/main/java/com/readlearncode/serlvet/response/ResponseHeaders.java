package com.readlearncode.serlvet.response;

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
public class ResponseHeaders extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();

        response.setHeader("x-supported-counties", "UK");
        response.addHeader("x-supported-counties", "US");

        response.setIntHeader("x-image-size", 8);
        response.addIntHeader("x-image-size", 16);

        response.setDateHeader("x-date-release",1548591442);
        response.addDateHeader("x-date-release", 1580127442);

    }
}