package com.ab.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ab.beans.Persons;

public class DependencyInjectionWithOverloadedGetBeanMethod {

	public static void main(String[] args) {
		// Create IOC Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		// Created Empty IOC container without having spring configurations

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		// By default SRC folder are there in CLASSPATH in every eclipse project
		reader.loadBeanDefinitions("com/ab/cfgs/applicationContext.xml");
		// This will give xml file to factory.
		
		Persons per = factory.getBean("per", Persons.class);
		System.out.println(per);

	}

}
