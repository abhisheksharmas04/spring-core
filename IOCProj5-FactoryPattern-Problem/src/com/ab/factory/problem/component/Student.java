package com.ab.factory.problem.component;

public class Student extends Person {
	private int rollno;
	private String course;
	// HAS-A-Property (Composition)
	private Food food;

	public Student(Food food) {
		System.out.println("Student.Student():: 1-Param Constructor");
		this.food = food;
	}

	public void work() {
		System.out.println("Student.work():: Student is studying B.tech (CS) and taking food: " + food);
	}
}
