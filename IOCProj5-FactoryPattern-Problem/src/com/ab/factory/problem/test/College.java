package com.ab.factory.problem.test;
import com.ab.factory.problem.component.Food;
import com.ab.factory.problem.component.Student;
public class College {

	public static void main(String[] args) {
		// College needs students
		// create Dependent object
		Food food = new Food();
		Student st1 = new Student(food);
		st1.work();
	}
}
