package com.mindtree.domain;

public class TestCalculator {

	public static void main(String[] args) {

		CalcuatorInterface obj=new Calculator();
		int result=obj.add(2, 3);
		System.out.println(result);
	}

}
