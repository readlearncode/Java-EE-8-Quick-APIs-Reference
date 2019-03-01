package com.readlearncode.serlvet.session;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@WebServlet("/session-tracking")
public class SessionTracking extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int count = 0;

        HttpSession session = request.getSession(true);

        Date createTime = new Date(session.getCreationTime());
        Date lastAccessTime = new Date(session.getLastAccessedTime());

        if (session.isNew()) {
            session.setAttribute("userID", "JonSmith");
            session.setMaxInactiveInterval(30 * 60);
        } else {
            count = 1 + Integer.parseInt(session.getAttribute("count").toString());
        }
        session.setAttribute("count", count);

        response.getWriter()
                .append("Session ID : " + session.getId())
                .append("\nCreation time: " + createTime)
                .append("\nLast accessed time : " + lastAccessTime)
                .append("\nUser id : " + session.getAttribute("userID"))
                .append("\nCount : " + count)
                .append("\nMax Inactive Interval : " + session.getMaxInactiveInterval());

    }

}