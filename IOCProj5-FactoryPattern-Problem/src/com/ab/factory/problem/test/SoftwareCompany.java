package com.ab.factory.problem.test;
import com.ab.factory.problem.component.Employee;
import com.ab.factory.problem.component.Food;
public class SoftwareCompany {

	public static void main(String[] args) {
		// Software company needs employee
		// create Dependent object
		Food food = new Food();
		Employee emp1 = new Employee(food);
		emp1.work();
	}
}
