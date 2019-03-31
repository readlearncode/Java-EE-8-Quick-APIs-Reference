package com.readlearncode.serlvet.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;
import java.io.IOException;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
//@WebFilter(filterName = "Filter Example 1", servletNames = "Servlet Example 1", initParams = {@WebInitParam(name = "code", value = "1234")})
public class FilterExample1 extends HttpFilter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Enter Filter");
        chain.doFilter(request, response);
        System.out.println("Exit Filter");
    }

}