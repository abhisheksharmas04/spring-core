package com.ab.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ab.beans.A;

public class CyclicInjectionTest {
	
	public static void main(String[] args) {
		// Locate and hold spring bean configuration file
		FileSystemResource resource = new FileSystemResource("src/com/ab/cfgs/applicationContext.xml");
		
		// Create IOC container
		XmlBeanFactory iocContainer = new XmlBeanFactory(resource);
		
		A a = (A)iocContainer.getBean("a1");
		System.out.println(a);
		
	}

}
