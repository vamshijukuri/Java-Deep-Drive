package com.mindtree.domain;

public class Employee {
	private int age;
	private boolean isMarried;
	private float salary;
	
	public Employee(int age, boolean isMarried, float salary) {
		super();
		this.age = age;
		this.isMarried = isMarried;
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
	
	
	

}
