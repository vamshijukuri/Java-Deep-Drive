package com.mindtree.design.classes;

import java.util.HashMap;

public class Calculator {
	/*This is a Static block*/
	static{
		
		b=5;
	}
	
	private  int a;
	private static int b;
	
	public Calculator(int c,int d){
		
		this.a=c;
		this.b=d;
		
	}
	
	public int add(){
		Math.ceil(2.5);
		HashMap<String,String> hm=new HashMap<>();
		return a+b;
	}
	
	public static int addStatic(){
		
		return b;
	}

}
