package com.ab.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ab.beans.Robo;

public class RequiredAnnotationTest {
	public static void main(String[] args) {
		// Create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/ab/cfgs/applicationContext.xml");
		
		// get bean
		Robo robo = ctx.getBean("robo", Robo.class);
		System.out.println(robo);
		
		ctx.close();
	}

}
