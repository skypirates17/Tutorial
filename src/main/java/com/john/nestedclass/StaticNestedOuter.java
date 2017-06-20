package com.john.nestedclass;

public class StaticNestedOuter {

	static class StaticNestedInner {
		public void my_method() {
			System.out.println("This is my nested class");
		}
	}

	public static void main(String args[]) {
		StaticNestedOuter.StaticNestedInner nested = new StaticNestedOuter.StaticNestedInner();
		nested.my_method();
	}

}
