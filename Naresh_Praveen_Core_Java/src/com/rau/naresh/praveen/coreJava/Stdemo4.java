package com.rau.naresh.praveen.coreJava;

public class Stdemo4 {
    int i,j;
	static int x;
	
	static void fun1() {
		x=x+1;
		//i=i+i;// c.e.
		Stdemo4 d1 = new Stdemo4();
		d1.i=x+1;
	}
    void fun2() {
		i=i+1;
		x=x+1;
	}
	public static void main(String[] args) {
		x=3;
		System.out.println(x);
		Stdemo4 d1 = new Stdemo4();
		d1.fun2();
		System.out.println(x);
		d1.fun1();//can call like this for static method too.
	}
}
