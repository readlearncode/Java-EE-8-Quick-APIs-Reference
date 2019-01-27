package com.readlearncode.serlvet.response;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ReadTrailerFields extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter writer = response.getWriter();

        boolean ready = request.isTrailerFieldsReady();

        writer.append("Ready: " + ready);

        request.getTrailerFields()
                .forEach((key, value) -> writer.append("key: " + key + "value: " + value));

    }

}