package com.mindtree.inher_poly;

public class Bike   extends Vehicle {
	
	private float mileage;
	
	private String manufacturer;

	public Bike(String name, String model, float price,float mileage,String manufacturer) {
		
		super(name, model, price);
		this.manufacturer=manufacturer;
		this.mileage=mileage;
	}

	public float getMileage() {
		return mileage;
	}

	public void setMileage(float mileage) {
		
		this.mileage = mileage;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	/*public String speed(){	
		
		return "Speed is 60 KMPH";
	}*/
	
	
	

}
