package com.rau.naresh.praveen.coreJava;

public class Poly4 {
    void fun1(A a1) {
    	System.out.println("fun1 of A parameter type");
    }
    void fun1(B b1) {
    	System.out.println("fun1 of B parameter type");
    }
    void fun1(C c1) {
    	System.out.println("fun1 of C parameter type");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly4 poly4 = new Poly4();
		poly4.fun1(new A());
		//poly4.fun1(null);//C.E. method fun1(A) is ambiguous for the type Poly4
	}

}
