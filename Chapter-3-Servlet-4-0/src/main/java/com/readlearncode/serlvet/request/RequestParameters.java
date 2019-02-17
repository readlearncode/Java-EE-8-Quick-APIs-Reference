package com.readlearncode.serlvet.request;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@WebServlet("/request-parameters")
public class RequestParameters extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter writer = response.getWriter();

        String country = request.getParameter("country");
        writer.append("Country: " + country);

        Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements()) {
            writer.append("\nParameter name: " + names.nextElement());
        }

        String[] keywords = request.getParameterValues("keywords");
        for (String keyword : keywords) {
            writer.append("\nKeyword: " + keyword);
        }

        Map<String, String[]> parameterMap = request.getParameterMap();
        parameterMap.forEach((key, value) -> writer.append("\nkey: " + key + " value: " + Stream.of(value).collect(joining(", "))));

    }

}