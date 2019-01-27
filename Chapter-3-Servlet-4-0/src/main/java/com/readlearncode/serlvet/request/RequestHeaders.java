package com.readlearncode.serlvet.request;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class RequestHeaders extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter writer = response.getWriter();

        Enumeration<String> names = request.getHeaderNames();
        while (names.hasMoreElements()) {
            writer.append("\nHeader name: " + names.nextElement());
        }

        String cacheControl = request.getHeader("Cache-Control"); // public
        writer.append("\nCache-Control: " + cacheControl);

        Enumeration<String> acceptLanguage = request.getHeaders("Accept-Language"); // en-US,
        while (acceptLanguage.hasMoreElements()) {
            writer.append("\nAccept-Language values: " + acceptLanguage.nextElement());
        }

        int maxAge = request.getIntHeader("max-age"); // 31536000
        writer.append("\nmax-age: " + maxAge);

        long ifModifiedSince = request.getDateHeader("If-Modified-Since"); // Saturday, 26 January 2019 21:58:21 GMT+00:00
        writer.append("\nIf-Modified-Since: " + ifModifiedSince);

    }

}