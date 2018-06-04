package com.mindtree.inher_poly;

public class TestBike {

	public static void main(String[] args) {

		Vehicle obj=new Bike("Activa", "2016", 65000, 65, "Honda");
		Vehicle objVeh=new Vehicle("Test","test",100);
		
		//Compile time
		obj.speed();//Overloadding
		//Runtime
			//Bike Speed
		
			//Overrding
		System.out.println(obj.speed());
	}

}
