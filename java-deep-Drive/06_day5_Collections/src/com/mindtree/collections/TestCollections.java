package com.mindtree.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestCollections {

	public static void main(String[] args) {
//List
		/*List obj=new ArrayList();
		obj.add("Narasimha");
		obj.add("Bharani");
		obj.add("XXX");
		obj.add("XXX");
		
		//System.out.println(obj);
		for(Object myObject:obj){
			System.out.println(myObject);
			
		}*/
		//Set
		//No Insertion Oreder...no Duplicates
		/*Set obj=new HashSet();
		
		
		obj.add("XXX");
		obj.add("XXX");
		
		obj.add("Bharani");
		obj.add("Narasimha");
		
		//System.out.println(obj);
		for(Object myObject:obj){
			System.out.println(myObject);
			
		}*/
		/*
		 * Two Diemnsional
		 * Keys are unique
		 * Keys can be accepted anything
		 * */
		
		Map<Integer,String> obj=new HashMap<>();
		
		//int [] text=new int[50];
		
	//Generics:
		
		//Enforccing type at compile time 
		//Are compile time: Performance is no gain no loss
		
		
		obj.put(1,"XXX");
		obj.put(1,"XXX");
		
		obj.put(3,"Bharani");
		obj.put(4,"Narasimha");
		
		
		Set keys=obj.keySet();
		
		//System.out.println(obj);
		for(Object key:keys){
			System.out.println(obj.get(key));
			
		}
		
		
	}

}
