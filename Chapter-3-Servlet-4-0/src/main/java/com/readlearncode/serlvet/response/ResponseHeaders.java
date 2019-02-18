package com.readlearncode.serlvet.response;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@WebServlet("/response-headers")
public class ResponseHeaders extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

        response.setHeader("x-supported-counties", "UK");
        response.addHeader("x-supported-counties", "US");

        response.setIntHeader("x-image-size", 8);
        response.addIntHeader("x-image-size", 16);

        response.setDateHeader("x-date-release",1548591442);
        response.addDateHeader("x-date-release", 1580127442);

    }
}