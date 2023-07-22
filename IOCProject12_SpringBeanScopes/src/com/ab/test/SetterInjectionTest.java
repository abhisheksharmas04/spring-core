package com.ab.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ab.beans.WishMessageGenerator;

public class SetterInjectionTest {
	
	public static void main(String[] args) {
		// Locate and hold spring bean configuration file
		FileSystemResource resource = new FileSystemResource("src/com/ab/cfgs/applicationContext.xml");
		
		// Create IOC container
		XmlBeanFactory iocContainer = new XmlBeanFactory(resource);
		
		// Get Target bean class object
		Object obj = iocContainer.getBean("wmg");
		
		// typecaste 
		WishMessageGenerator generator = (WishMessageGenerator) obj;
		
		// invoke the business method:
		String result = generator.generateWishMessage("Raja");
		
		// use result
		System.out.println(result);
	}

}
