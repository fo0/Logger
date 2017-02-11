package com.fo0.ss.logger;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;

import com.fo0.ss.logger.OSCheck.OSType;

public class ConfigureLogger {
	
	private static LoggerContext ctx = null;

	public static void initialize(OSType os) {
		ctx = (LoggerContext) LogManager.getContext(false);

		if (CONSTANTS.LOGGER_ENABLE_COLOR == null)
			CONSTANTS.LOGGER_ENABLE_COLOR = "default";

		if (CONSTANTS.LOGGER_ENABLE_COLOR.equals("default") || CONSTANTS.LOGGER_ENABLE_COLOR.isEmpty()) {

			try {
				switch (os) {
				case Windows:
					ctx.setConfigLocation(new URI("log4j2_win.xml"));
					break;

				case Linux:
					ctx.setConfigLocation(new URI("log4j2.xml"));
					break;

				default:
					ctx.setConfigLocation(new URI("log4j2.xml"));
					break;
				}

			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (CONSTANTS.LOGGER_ENABLE_COLOR.equalsIgnoreCase("true")) {
			try {
				ctx.setConfigLocation(new URI("log4j2_lx.xml"));
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (CONSTANTS.LOGGER_ENABLE_COLOR.equalsIgnoreCase("false")) {
			try {
				ctx.setConfigLocation(new URI("log4j2_win.xml"));
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		Configuration config = ctx.getConfiguration();
		LoggerConfig loggerConfig = config.getLoggerConfig(LogManager.ROOT_LOGGER_NAME);
		switch (CONSTANTS.LOGGER_LEVEL.toUpperCase()) {
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
	
	protected static void setLoggerLevel(Level level){
		Configuration config = ctx.getConfiguration();
		LoggerConfig loggerConfig = config.getLoggerConfig(LogManager.ROOT_LOGGER_NAME);
		loggerConfig.setLevel(level);
		ctx.updateLoggers();
	}

}