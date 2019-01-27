package com.readlearncode.serlvet.request;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ReadCookies extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter writer = response.getWriter();
        Cookie[] cookies = request.getCookies();
        Stream.of(cookies).forEach(
                cookie -> writer
                        .append("Value: " + cookie.getValue())
                        .append("\nMaxAge: " + cookie.getMaxAge())
                        .append("\nComment: " + cookie.getComment())
                        .append("\nPath: " + cookie.getPath())
                        .append("\nSecure: " + cookie.getSecure())
                        .append("\nVersion: " + cookie.getVersion())
                        .append("\nDomain: " + cookie.getDomain())
        );

    }
}