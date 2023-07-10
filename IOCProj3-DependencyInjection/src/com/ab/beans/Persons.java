package com.ab.beans;

public class Persons {
	// Spring bean properties
	private int pid;
	private String pname;
	private String paddress;
	private float income;

	//setter for setter injection (ALT + SHIFT + S,R)
	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public void setIncome(float income) {
		this.income = income;
	}

	// ALT + SHIFT + ALT,S
	public String toString() {
		return "Persons [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + ", income=" + income + "]";
	}
	
	

}
