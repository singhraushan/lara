package com.rau.naresh.praveen.coreJava;

public class Odemo10 {

	void fun1(A a1) {
		System.out.println(a1);
		if(a1!=null) {
			a1.i = a1.i+1;
			a1.funA();
		}
		System.out.println("End f func1()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Odemo10 d1 = new Odemo10();
		A a1= new A();
		a1.i=3;
		d1.fun1(a1);
		System.out.println(a1.i);
		d1.fun1(a1);
		System.out.println(a1.i);
		d1.fun1(new A());
		System.out.println(a1.i);
		System.out.println();
		d1.fun1(null);
	}

}
