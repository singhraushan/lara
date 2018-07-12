package com.rau.naresh.praveen.coreJava;

public class Demo2 {

	int x=1;
	int y=2;
	
	void fun1() {
		x= x+1;
		y = y+1;
		System.out.println("Set");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d1 = new Demo2();
		System.out.println(d1.x);
		System.out.println(d1.y);
		System.out.println();
		d1.fun1();
		System.out.println(d1.x);
		System.out.println(d1.y);
		System.out.println();
		d1.fun1();
		d1.fun1();
		System.out.println(d1.x);
		System.out.println(d1.y);
		
	}
	

}
