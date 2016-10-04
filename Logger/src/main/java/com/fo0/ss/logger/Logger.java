package com.fo0.ss.logger;

import org.apache.logging.log4j.LogManager;

public class Logger extends LogManager {

	public static org.apache.logging.log4j.Logger log = getLogger();

	static {
		ConfigureLogger.initialize();

		log.info("Logger-Configure Options:");
		log.info("\t Logger-Path: " + CONSTANTS.path);
		log.info("\t Logger-Level: " + CONSTANTS.LOGGER_LEVEL);

		log.info("Logger has been successful initialized");
	}

}