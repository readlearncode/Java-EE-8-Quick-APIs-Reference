package com.readlearncode.serlvet.request;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ServletMapping extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        HttpServletMapping servletMapping = request.getHttpServletMapping();
        response.getWriter()
                .append("\nMapping Matched: ").append(servletMapping.getMappingMatch().name())
                .append("\nValue Matched: ").append(servletMapping.getMatchValue())
                .append("\nServlet Name: ").append(servletMapping.getServletName())
                .append("\nPattern Used: ").append(servletMapping.getPattern());
    }
}
