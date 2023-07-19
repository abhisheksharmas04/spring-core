package com.ab.strategy.dp.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import com.ab.strategy.dp.component.BlueDart;
import com.ab.strategy.dp.component.Courier;
import com.ab.strategy.dp.component.DTDC;
import com.ab.strategy.dp.component.Flipkart;

public class FlipkartFactory {
	private static final Properties props = loadProperties();

	private static Properties loadProperties() {
		Properties properties = new Properties();
		try (InputStream is = Files.newInputStream(getPropertiesFilePath())) {
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}

	private static Path getPropertiesFilePath() throws IOException {
		return Paths.get("src/com/ab/strategy/dp/commons/inputs.properties");
	}

	// static factory method having factory pattern
	public static Flipkart getInstance() {
		// get dependent class name from properties file
		String courierClassName = props.getProperty("courier.type");
		Courier courier = null;
		// Load dependent class
		try {
			Class<?> c = Class.forName(courierClassName);
			Constructor<?> constructor = c.getDeclaredConstructor();
			constructor.setAccessible(true);
			courier = (Courier) constructor.newInstance();
		} catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

		// crate target class object.
		Flipkart flipkart = new Flipkart();

		// assing dependet class object to target class object
		flipkart.setCourier(courier);

		return flipkart;
	}

}
