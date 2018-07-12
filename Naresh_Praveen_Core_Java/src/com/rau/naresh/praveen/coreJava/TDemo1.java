package com.rau.naresh.praveen.coreJava;

public class TDemo1 {
 int i,j;
 
 TDemo1() {
	 this(5);
  	 System.out.println(this);
  	//this(5);//Constructor call must be the first statement in a constructor
 }
 TDemo1(int i) {
  	 System.out.println(this);
 }
 void funT(int i) {
	 //this(5);//Constructor call must be the first statement in a constructor
	 i = i+1;
	 j = i+1;
	 this.i = i+1;
	 System.out.println(this);
	 System.out.println(TDemo1.this);
	 TDemo1 t2 = new TDemo1();
	 
 }
 public static void main(String[] args) {
	 TDemo1 t1 = new TDemo1();
	 t1.funT(3);
	 System.out.println(t1.i);
	 System.out.println(t1.j);
	 //System.out.println(this.i); // this is for non-static method/block/constructor beacuse 'this'is for current object. but in static no object.
 }
 
}
