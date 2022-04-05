package com.company.java.log4j;

import org.apache.log4j.Logger;

public class Log4JTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final Logger logger = Logger.getLogger(Log4JTest.class);
		
		logger.debug("This is debug: " + "parameter/exception object");
		logger.info("This is info: " + "parameter/exception object");
		logger.warn("This is warn: " + "parameter/exception object");
		logger.error("This is error: " + "parameter/exception object");
		logger.fatal("This is fatal: " + "parameter/exception object");

	}

}
