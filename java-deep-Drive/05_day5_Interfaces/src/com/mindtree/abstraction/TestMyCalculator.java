package com.mindtree.abstraction;

public class TestMyCalculator {

	public static void main(String[] args) {

		Calculator obj=new ConcreteCalculator();		
		MyCalculator myCalc=new ConcreteCalculator();
		
		obj.multiply(2, 3);
		//obj.di
		myCalc.multiply(2, 3);
		myCalc.divide(2, 3);
		
		System.out.println(obj.multiply(2, 3));
	}

}
