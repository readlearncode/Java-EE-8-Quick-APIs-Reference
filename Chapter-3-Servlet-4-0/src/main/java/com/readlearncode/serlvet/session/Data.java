package com.readlearncode.serlvet.session;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Data implements HttpSessionBindingListener {

    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("Added 'Data' attribute.");
    }

    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("Removed 'Data' attribute.");
    }
}