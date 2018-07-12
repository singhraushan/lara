package com.rau.naresh.praveen.coreJava.mypack1;

import com.rau.naresh.praveen.coreJava.A;
import com.rau.naresh.praveen.coreJava.B;

public class X {
  public static void main(String[] args) {
	//F0 f1= new F0();//C.E.:since f0 is default class so not available outside package
	A a1= new A();//you need to import public class to use outside package. you're able to create object because access level of default constructor provided by java will be same as class i.e. public here.
	//B b1= new B();//C.E.:constructor is default.  The constructor B() is not visible
}
}
