package com.fo0.ss.logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class CONSTANTS {

	// INFO | WARN
	public static String LOGGER_LEVEL = "";
	public static String LOGGER_ENABLE_COLOR = "";
	public static String path;

	static {

		path = System.getProperty("user.dir") + "/config/logger.properties";

		if (!new File(System.getProperty("user.dir") + "/config/").exists()) {
			new File(System.getProperty("user.dir") + "/config/").mkdirs();
		}

		if (!new File(path).exists()) {

			// ########### Create DEFAULT properties ############
			try (OutputStream out = new FileOutputStream(path)) {
				Properties properties = new Properties();
				properties.setProperty("LOGGER.LEVEL", "INFO");
				properties.setProperty("LOGGER_ENABLE_COLOR", "default");
				properties.store(out, "This is a sample for java properties");

				LOGGER_LEVEL = properties.getProperty("LOGGER.LEVEL");

			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {

			// ########### Reading properties ###########
			try (InputStream in = new FileInputStream(path)) {
				Properties prop = new Properties();
				prop.load(in);

				LOGGER_LEVEL = prop.getProperty("LOGGER.LEVEL");
				LOGGER_ENABLE_COLOR = prop.getProperty("LOGGER_ENABLE_COLOR");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
