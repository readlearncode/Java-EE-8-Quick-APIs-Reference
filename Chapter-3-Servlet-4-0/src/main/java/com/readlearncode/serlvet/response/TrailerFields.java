package com.readlearncode.serlvet.response;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class TrailerFields extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter writer = response.getWriter();

        response.setTrailerFields(() -> new HashMap<String, String>() {{
            put("Expires", "Monday, 27 January 2020 12:17:22 GMT+00:00");
        }});

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("read-trailer-fields");
        requestDispatcher.forward(request, response);

    }
}