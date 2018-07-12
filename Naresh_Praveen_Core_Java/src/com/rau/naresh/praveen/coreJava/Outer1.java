package com.rau.naresh.praveen.coreJava;
//4 types of inner class: 1. non-static inner class,2. static inner class,3.  local inner class and 4.anonymous inner class  
public class Outer1 {
 
	int x;
	void funOu() {
		x = x+1;
		Inner1 i1 = new Inner1();
		i1.funIn();
		System.out.println("End of funOu");
	}
	
   class Inner1{/// inner class can be any private,protected,default and public.
		void funIn() {
			x=x+1;//can access outer class attribute
			System.out.println("funIu of outer class");
		}	
	}
	public static void main(String[] args) {
		Outer1.Inner1 oi = new Outer1().new Inner1();
		oi.funIn();
		System.out.println("End of main");

	}

}
