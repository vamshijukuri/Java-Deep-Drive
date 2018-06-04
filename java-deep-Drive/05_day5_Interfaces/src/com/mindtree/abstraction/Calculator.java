/**
 * 
 */
package com.mindtree.abstraction;

/**
 * @author Shree
 *
 */
public interface Calculator {
	
	double PI=3.7;
	double expectedValue=4;
	
	public abstract int add(int a ,int b);
	public int subtract(int a,int b);
    double multiply(int a ,int b);
	
	

}
