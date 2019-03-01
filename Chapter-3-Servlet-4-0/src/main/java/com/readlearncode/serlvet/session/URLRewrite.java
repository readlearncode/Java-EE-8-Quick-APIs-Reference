package com.readlearncode.serlvet.session;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@WebServlet("/url-rewrite")
public class URLRewrite extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        request.getSession(true);
        String encodedURL = response.encodeRedirectURL("users.jsp");
        response.sendRedirect(encodedURL);

    }

}