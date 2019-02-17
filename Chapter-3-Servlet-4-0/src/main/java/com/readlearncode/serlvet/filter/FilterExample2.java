package com.readlearncode.serlvet.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class FilterExample2 implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("Enter Filter Example 2");

        chain.doFilter(request, response);

        System.out.println("Exit Filter Example 2");

    }

}