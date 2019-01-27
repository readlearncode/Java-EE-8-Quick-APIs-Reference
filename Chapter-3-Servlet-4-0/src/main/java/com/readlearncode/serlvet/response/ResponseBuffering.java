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
public class ResponseBuffering extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();

        int bufferSize = response.getBufferSize();

        response.setBufferSize(5000);

        writer.append("This text will be cleared from the buffer");
        response.setStatus(418);
        response.setHeader("x-custom-header", "No value");

        response.reset(); // clears all the buffer including status code and headers

        writer.append("Again, this text will be cleared from the buffer");
        response.setStatus(200);
        response.setHeader("x-custom-header", "No value");

        response.resetBuffer(); // Only removes the buffered text

        writer.append("This text will appear in the response");
        boolean committed = response.isCommitted();
        writer.append("\nCommitted? " + committed);

        response.flushBuffer();
        writer.append("\nThis text will also appear in the response");
        writer.append("\nResponse code: " + response.getStatus());
        writer.append("\nBuffer size before: " + bufferSize);
        writer.append("\nBuffer size after: " + response.getBufferSize());

        committed = response.isCommitted();
        writer.append("\nCommitted? " + committed);
        response.flushBuffer();


    }
}