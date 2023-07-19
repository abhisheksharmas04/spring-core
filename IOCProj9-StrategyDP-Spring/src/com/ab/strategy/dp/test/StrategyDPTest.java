package com.ab.strategy.dp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ab.strategy.dp.component.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		// Create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/ab/spring/config/applicationContext.xml");

		// Get target class object
		Flipkart fpkt = factory.getBean("fpkt", Flipkart.class);

		// Invoke the business method
		String result = fpkt.shopping(new String[] { "Mangos", "Apple" }, new float[] { 2000.0f, 5000.0f });

		// Display Result:
		System.out.println(result);

	}
}