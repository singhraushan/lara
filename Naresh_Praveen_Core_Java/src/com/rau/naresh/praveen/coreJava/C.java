package com.rau.naresh.praveen.coreJava;

public class C extends B{
	int i,j;
	
	void funA() {
		  System.out.println("FunA of C");
	 } 
	 void funC() {
		  i=6;
		  super.i=3;//this will point i of B i.e. just super(lowest super).
		  j=1;
		  super.j=7;
		  funA();
		  super.funA();
		  System.out.println("FunC of C");
	 }
	 
	  public static void main(String[] args) {
		C c1= new C();
		c1.funC();
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c1.k);
		//System.out.println(super.k);//C.E.: Cannot use super in a static context
	  }
}
