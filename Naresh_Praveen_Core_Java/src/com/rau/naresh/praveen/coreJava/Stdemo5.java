package com.rau.naresh.praveen.coreJava;

public class Stdemo5 {
  static int x=5;
  static A a1= new A();
  //Stdemo5 d1 = new Stdemo5();//this calling constructor every time so StackOverflowException occur
  static Stdemo5 d1 = new Stdemo5();//this calling constructor only once
  
  Stdemo5() {
	System.out.println("Stdemo5 constructor");  
  }
}
