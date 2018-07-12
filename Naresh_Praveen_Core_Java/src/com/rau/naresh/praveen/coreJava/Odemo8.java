package com.rau.naresh.praveen.coreJava;

public class Odemo8 {

	int x=3;
	A a1= new A();
	//Odemo8 odemo8 = new Odemo8(); // Runtime error:java.lang.StackOverflowError beacue of infinite loop
	Odemo8 d1 ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Odemo8 d1 = new Odemo8();
		System.out.println(d1.x);
		d1.d1 = new Odemo8();
		d1.d1.d1 = new Odemo8();
		int y=13;
		d1.d1.d1.x = y;
		d1.d1.d1.d1 = d1;
		d1.d1.d1.d1.x = 21;
		System.out.println(d1.x);
		System.out.println(d1.d1.x);
		System.out.println(d1.d1.d1.x);
	}

}
