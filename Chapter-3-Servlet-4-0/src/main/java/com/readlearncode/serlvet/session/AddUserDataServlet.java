package com.readlearncode.serlvet.session;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@WebServlet("/add-user-data-servlet")
public class AddUserDataServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        HttpSession session = request.getSession(false);
        PrintWriter writer = response.getWriter();

        if (session == null) {
            session = request.getSession(true);
            writer.write("New session created");
        }

        Data data = (Data) session.getAttribute("data");
        if (data == null) {
            session.setAttribute("data", new Data());
            writer.write("\n'data' attribute set in session");
        }

    }
}