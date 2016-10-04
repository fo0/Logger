package com.fo0.ss.logger;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;

public class ConfigureLogger {

	public static void initialize() {
		LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
		try {
			ctx.setConfigLocation(new URI("log4j2.xml"));
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Configuration config = ctx.getConfiguration();
		LoggerConfig loggerConfig = config.getLoggerConfig(LogManager.ROOT_LOGGER_NAME);
		switch (CONSTANTS.LOGGER_LEVEL) {
		case "INFO":
			loggerConfig.setLevel(Level.INFO);
			break;
		case "DEBUG":
			loggerConfig.setLevel(Level.DEBUG);
			break;
		case "WARN":
			loggerConfig.setLevel(Level.WARN);
			break;
		case "ALL":
			loggerConfig.setLevel(Level.ALL);
			break;
		case "ERROR":
			loggerConfig.setLevel(Level.ERROR);
			break;

		default:
			break;
		}
		ctx.updateLoggers();
	}

}