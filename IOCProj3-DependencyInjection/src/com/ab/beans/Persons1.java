package com.ab.beans;

public class Persons1 {
	// Spring bean properties
	private int pid;
	private String pname;
	private String paddress;
	private float income;

	public Persons1(int pid, String pname, String paddress, float income) {
		System.out.println("4 param constructor");
		this.pid = pid;
		this.pname = pname;
		this.paddress = paddress;
		this.income = income;
	}

	// ALT + SHIFT + ALT,S
	public String toString() {
		return "Persons [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + ", income=" + income + "]";
	}

}
