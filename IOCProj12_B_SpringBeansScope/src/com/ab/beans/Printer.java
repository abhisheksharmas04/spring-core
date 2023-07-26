package com.ab.beans;

public class Printer {
	private static Printer INSTSNCE;

	private Printer() {
		System.out.println("Printer.Printer()");
	}

	public static Printer getInstance() {
		if (INSTSNCE == null) {
			INSTSNCE = new Printer();
		}
		return INSTSNCE;
	}

	// Business Method
	public void print(String msg) {
		System.out.println(msg);
	}

}
