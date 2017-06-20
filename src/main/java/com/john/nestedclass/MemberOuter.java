package com.john.nestedclass;

/**
 * Sample of Method-local Inner Class
 * 
 * @author jangolluan
 *
 */
public class MemberOuter {
	
	void printOuter() {
		class MethodInner_Demo {
			public void printInnerMethod() {
				System.out.println("This is method inner class.");
			}
		} 

		MethodInner_Demo inner = new MethodInner_Demo();
		inner.printInnerMethod();
	}
	
	public static void main(String[] args) {
		MemberOuter memOut = new MemberOuter();
		memOut.printOuter();
	}
}
