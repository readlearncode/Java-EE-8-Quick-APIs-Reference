package com.readlearncode.serlvet.response;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Internationalization extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

        response.setLocale(Locale.UK);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");

    }

}