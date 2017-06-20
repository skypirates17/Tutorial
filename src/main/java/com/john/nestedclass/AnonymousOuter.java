package com.john.nestedclass;

/**
 * Example of Anonymous Inner Class
 * 
 * @author jangolluan
 * 
 */
abstract class AnonymousInnerClass {
	public abstract void mymethod();
	
	void printName(AnonymousInnerInterface anonInner) {
		System.out.println(anonInner.mymethod() + "This is Anonymous Inner Class using interface");
	}
}

interface AnonymousInnerInterface {
	String mymethod();
}

public class AnonymousOuter {
	public static void main(String[] args) {
		AnonymousInnerClass innerClass = new AnonymousInnerClass() {
			public void mymethod() {
				System.out.println("This is an example of anonymous inner class");
			}
		};
		innerClass.mymethod();
		
		// Anonymous Inner Class as Argument
		innerClass.printName(new AnonymousInnerInterface() {
			public String mymethod() {
				return "HELLO, ";
			}
		});
		
	}
}
