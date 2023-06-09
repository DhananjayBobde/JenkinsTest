package com.lovetolearn.SpringBooApplication;

import java.util.logging.Logger;


public class Application {

	public static final Logger logger = Logger.getLogger(String.valueOf(Application.class));
	public static void main(String[] args) {
		logger.info("its a continous integration job");

	}


}
