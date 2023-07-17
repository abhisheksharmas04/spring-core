package com.ab.factory.problem.component;

public class Employee extends Person {
	private String desg;
	private float salary;
	// HAS-A-Property (Composition)
	private Food food;

	public Employee(Food food) {
		System.out.println("Employee.Employee():: 1-Param Constructor");
		this.food = food;
	}

	public void work() {
		System.out.println("Employee.work():: Employee is working on Software development and taking " + food);
	}

}
