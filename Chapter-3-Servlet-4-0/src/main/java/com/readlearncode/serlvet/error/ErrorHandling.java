package com.readlearncode.serlvet.error;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
@WebServlet("/error-handling")
public class ErrorHandling extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/error-handling.jsp");

        request.setAttribute("javax.servlet.error.status_code", 404);
        request.setAttribute("javax.servlet.error.exception_type", Exception.class);
        request.setAttribute("javax.servlet.error.message", "Not found");
        request.setAttribute("javax.servlet.error.exception", Exception.class);
        request.setAttribute("javax.servlet.error.request_uri", "");
        request.setAttribute("javax.servlet.error.servlet_name", "");

        requestDispatcher.forward(request, response);

    }

}