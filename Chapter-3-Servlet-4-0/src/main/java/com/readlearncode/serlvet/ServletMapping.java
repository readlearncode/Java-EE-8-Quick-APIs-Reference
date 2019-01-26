package com.readlearncode.serlvet;

import javax.servlet.annotation.WebServlet;
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
@WebServlet({"helloworld"})
public class ServletMapping extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpServletMapping servletMapping = request.getHttpServletMapping();
        response.getWriter()
                .append("<html><body>")
                .append("Mapping Matched: ").append(servletMapping.getMappingMatch().name())
                .append("<br/>")
                .append("Value Matched: ").append(servletMapping.getMatchValue())
                .append("<br/>")
                .append("Servlet Name: ").append(servletMapping.getServletName())
                .append("<br/>")
                .append("Pattern Used: ").append(servletMapping.getPattern())
                .append("<br/>")
                .append("</body></html>");
    }
}
