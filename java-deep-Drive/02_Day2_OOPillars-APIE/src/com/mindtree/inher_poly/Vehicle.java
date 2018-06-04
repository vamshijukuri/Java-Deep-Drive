package com.mindtree.inher_poly;

public  class Vehicle {
	
	private String name;
	private String model;
	private float price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public Vehicle(String name, String model, float price) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
	}
	
	public String speed(){
		
		return "Speed is 50 KMPH";
	}
	
	
	

}
