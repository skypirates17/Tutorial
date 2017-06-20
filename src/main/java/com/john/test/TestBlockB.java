package com.john.test;

public class TestBlockB extends TestBlockA {

	/*
	public TestBlockB() {
		System.out.println("TestBlockB: no argument constructor");
	}
	*/
	

	TestBlockB(int x) {
		super(x);
		System.out.println("TestBlockB: 1 argument constructor");
		// TODO Auto-generated constructor stub
	}

	/* First static initialization block */
    static {
        System.out.println("TestBlockB: first static init block ");
    }
 
    /* First instance initialization block  */
    {
        System.out.println("TestBlockB: first instance init block");
    }
 
    /* Second instance initialization block */
    {
        System.out.println("TestBlockB: second instance init block");
    }
 
    /* Second static initialization block  */
    static {
        System.out.println("TestBlockB: second static int block ");
    }
    
    public static void main(String[] args) {
		new TestBlockB(9);
	}
    
    /**
     * Sequence
     * 1. all static block in Parent Class
     * 2. all static block in Child Class
     * 3. all instance block in Parent Class
     * 4. no arg of Parent Class
     * 5. all instance block in Child Class
     * 6. constructor of Child Class
     */
}
