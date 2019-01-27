package com.readlearncode.serlvet.request;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
public class CreateCookies extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        Cookie user = new Cookie("name", "John");
        user.setMaxAge(60 * 60 * 24);
        user.setHttpOnly(true);
        user.setComment("This is a cookie that stores a user's name");
        user.setPath("/");
        user.setSecure(false);
        user.setVersion(1);
        user.setDomain("localhost");
        user.setValue("Jane");

        response.addCookie(user);

        //RequestDispatcher requestDispatcher = request.getRequestDispatcher("read-cookies");
        //requestDispatcher.forward(request, response);

    }
}