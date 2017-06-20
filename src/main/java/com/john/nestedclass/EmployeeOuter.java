package com.john.nestedclass;

/**
 * Example of Inner Class
 * 
 * @author jangolluan
 *
 */
public class EmployeeOuter {
	private int count = 10;
	
	class EmployeeInner {
		void message () {
			System.out.println("COUNT IS " + count );
		}
	}
	
	public static void main(String[] args) {
		EmployeeOuter empOut1 = new EmployeeOuter();
		EmployeeOuter.EmployeeInner empInn1 = empOut1.new EmployeeInner();
		
		empInn1.message();
		
	}
}
