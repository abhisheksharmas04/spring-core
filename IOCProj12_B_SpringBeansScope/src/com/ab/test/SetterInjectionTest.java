package com.ab.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ab.beans.Printer;

public class SetterInjectionTest {
	
	public static void main(String[] args) {
		// Locate and hold spring bean configuration file
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/ab/cfgs/applicatoinContext.xml");
		
		// Get target beans object reference
		/*WishMessageGenerator generator1 = (WishMessageGenerator) factory.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator generator2 = (WishMessageGenerator) factory.getBean("wmg",WishMessageGenerator.class);
		
		System.out.println(generator1.hashCode() + " " + generator2.hashCode());
		System.out.println("generator1 == generator2 ? " + (generator1 == generator2));
		
		WishMessageGenerator generator3 = (WishMessageGenerator) factory.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator generator4 = (WishMessageGenerator) factory.getBean("wmg",WishMessageGenerator.class);
		
		System.out.println(generator3.hashCode() + " " + generator3.hashCode());
		System.out.println("generator3 == generator4 ? " + (generator3 == generator4));
		
		// Invoke the business method
		String result = generator1.generateWishMessage("Abhishek");
		System.out.println("Result: " + result);*/
		
		for(int i=0; i<=100; i++)
			System.out.println("=");
		
		Printer p1 = (Printer) factory.getBean("p1", Printer.class);
		Printer p2 = (Printer) factory.getBean("p1", Printer.class);
		
		System.out.println(p1.hashCode() + " " + p2.hashCode());
		

	}

}
