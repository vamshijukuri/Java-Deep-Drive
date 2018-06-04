package com.mindtree.domain;

public class TestEmployee {

	public static void main(String[] args) {

		Employee obj=new Employee(25, true, 20000);
		System.out.println(obj.isMarried());
	}

}
