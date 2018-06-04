package com.mt.jdd;



public class Student {
	
	private int id;
	private String name;
	private double fee;
	
	public Student(int id){
		
		this.id=id;
		
	}
	
	public Student(int id, String name, double fee) {
		this(id);
		//this.id=id;
		this.name = name;
		this.fee = fee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	

}
