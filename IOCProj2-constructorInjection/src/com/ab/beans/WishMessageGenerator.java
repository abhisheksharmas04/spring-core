package com.ab.beans;

import java.util.Date;

public class WishMessageGenerator {
	// ctrl + shift + o to import the package
	private Date date;
	
	
	// ALT + Shift + s,o
	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator.WishMessageGenerator() One param Constructor");
		this.date = date;
	}



	/*public WishMessageGenerator() {
		System.out.println("Zero-param constructor WishMessageGenerator class");
	}*/

	/*// ALt + shift + s r to get setter method
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate(-) method");
		this.date = date;
	}*/
	
	// business method
	public String generateWishMessage(String user) {
		// Get current hour of the day
		int hour = date.getHours(); // 24 hours formate
		
		if(hour < 12) return "Good Morning " + user;
		else if (hour < 16) return "Good Afternoon " + user;
		else if (hour < 20) return "Good Evening " + user;
		else return "Good Night " + user;
	}
	
}
