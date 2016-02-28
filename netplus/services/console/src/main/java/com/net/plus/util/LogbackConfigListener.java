package com.net.plus.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
/**
 * 
 * @author Administrator
 *
 * com.net.plus.util.LogbackConfigListener
 */
public class LogbackConfigListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event) {
		LogbackWebConfigurer.initLogging(event.getServletContext());
	}

	public void contextDestroyed(ServletContextEvent event) {
		LogbackWebConfigurer.shutdownLogging(event.getServletContext());
	}
}