package com.ab.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ab.beans.Persons;
import com.ab.beans.Persons1;

public class DependencyInjectionTest1 {

	public static void main(String[] args) {
		// Create IOC Container
		XmlBeanFactory facotry = new XmlBeanFactory(new FileSystemResource("src/com/ab/cfgs/applicationContext.xml"));
		
		//get spring bean class object
		/*Persons person = (Persons)facotry.getBean("per");
		System.out.println(person);*/
		
		// Using constructor Injection
		Persons1 person = (Persons1) facotry.getBean("per");
		System.out.println(person);

	}

}
