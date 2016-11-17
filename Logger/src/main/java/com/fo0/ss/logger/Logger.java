package com.fo0.ss.logger;

import org.apache.logging.log4j.LogManager;

import com.fo0.ss.logger.OSCheck.OSType;

public class Logger extends LogManager {

	public static org.apache.logging.log4j.Logger log = getLogger();

	static {
		OSType os = OSCheck.getOperatingSystemType();
		ConfigureLogger.initialize(os);
		log.info("#########################################");
		log.info("Logger-Configure Options:");
		log.info("\t Logger-Path: " + CONSTANTS.path);
		log.info("\t Logger-Level: " + CONSTANTS.LOGGER_LEVEL);
		log.info("\t Detected OS: " + os);
		log.info("Logger has been successful initialized");
		log.info("#########################################");
	}

}