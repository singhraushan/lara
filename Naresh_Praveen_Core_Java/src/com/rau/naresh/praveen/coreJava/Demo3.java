package com.rau.naresh.praveen.coreJava;

public class Demo3 {

	int x=2;
	int y=3;
	
	void fun1() {
		x= x+1;
		y= y+1;
	}
	void fun2() {
		fun1();
		System.out.println(x);
		System.out.println(y);
		System.out.println("fu2 of Demo3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 d1 = new Demo3();
		d1.fun1();
		d1.fun2();
	}
	

}
