package com.john.test;

public class TestBlockA {
	 
	TestBlockA(int x) {
        System.out.println("TestBlockA: 1 argument constructor, param = " + x);
    }
	
	TestBlockA(int x, int y) {
        System.out.println("TestBlockA: 1 argument constructor, x + y");
    }
 /*
	TestBlockA() {
        System.out.println("TestBlockA: no argument constructor");
 
    }
 */
    /* First static initialization block */
    static {
        System.out.println("TestBlockA: first static init block ");
    }
 
    /* First instance initialization block  */
    {
        System.out.println("TestBlockA: first instance init block");
    }
 
    /* Second instance initialization block */
    {
        System.out.println("TestBlockA: second instance init block");
    }
 
    /* Second static initialization block  */
    static {
        System.out.println("TestBlockA: second static int block ");
    }
 
    public static void main(String args[]) {
     //   new TestBlockA();
      //  new TestBlockA();
        new TestBlockA(7);
    }
    
    /**
     * First called - Static init is only called once , regardless of the number of instance of that class
     * Second called - Instance init is called after static block, and is only called upon new of the class
     * Third called - Constructor
     */

}
