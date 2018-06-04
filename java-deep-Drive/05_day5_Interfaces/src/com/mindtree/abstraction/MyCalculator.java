/**
 * 
 */
package com.mindtree.abstraction;
/**
 * @author Shree
 *
 */
public abstract class MyCalculator implements Calculator {
	
	private String name;
	public static final String testName="Test";

	/* (non-Javadoc)
	 * @see com.mindtree.abstraction.Calculator#add(int, int)
	 */
	@Override
	public int add(int a, int b) {
		return a +b;
	}

	/* (non-Javadoc)
	 * @see com.mindtree.abstraction.Calculator#subtract(int, int)
	 */
	@Override
	public int subtract(int a, int b) {
		return a -b;
	}

	/* (non-Javadoc)
	 * @see com.mindtree.abstraction.Calculator#multiply(int, int)
	 */
	
	
	public double divide(int a, int b) {
		return (a/b);
	}


}
