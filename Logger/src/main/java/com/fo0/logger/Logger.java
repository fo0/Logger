package com.fo0.logger;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;

import com.fo0.logger.OSCheck.OSType;

public class Logger extends LogManager {

	public static org.apache.logging.log4j.Logger log = null;

	static {
		System.setProperty("java.util.logging.manager", "org.apache.logging.log4j.jul.LogManager");

		log = getLogger();

		OSType os = OSCheck.getOperatingSystemType();
		ConfigureLogger.initialize(os);

		String colorized = "false";
		if (CONSTANTS.LOGGER_ENABLE_COLOR.equals("default")) {
			switch (OSCheck.getOperatingSystemType()) {
			case Windows:
				colorized = "false";
				break;

			case Linux:
				colorized = "true";
				break;

			default:
				colorized = "false";
				break;
			}

		} else {
			colorized = CONSTANTS.LOGGER_ENABLE_COLOR;
		}

		log.info("#########################################");
		log.info("Logger-Configure Options:");
		log.info(" Logger-Path: " + CONSTANTS.path);
		log.info(" Logger-Level: " + CONSTANTS.LOGGER_LEVEL);
		log.info(" Detected OS: " + os);
		log.info(" Bridges: java.util.logging, slf4j");
		log.info(" Colorized: " + colorized);
		log.info("Logger has been successful initialized");
		log.info("#########################################");
		System.out.println();
	}

	public static void setLoggerLevel(String level) {
		ConfigureLogger.setLoggerLevel(Level.valueOf(level.toUpperCase()));
	}

}