package com.ab.beans;

import org.springframework.beans.factory.annotation.Required;

public class Robo {
	private int id;
	private String name;
	private String labName;
	private double price;

	@Required
	public void setId(int id) {
		System.out.println("Robo.setId()");
		this.id = id;
	}

	@Required // From this ID and Name is compulsory 
	public void setName(String name) {
		System.out.println("Robo.setName()");
		this.name = name;
	}

	public void setLabName(String labName) {
		System.out.println("Robo.setLabName()");
		this.labName = labName;
	}

	public void setPrice(double price) {
		System.out.println("Robo.setPrice()");
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("Robo.toString()");
		return "Robo [id=" + id + ", name=" + name + ", labName=" + labName + ", price=" + price + "]";
	}

}
