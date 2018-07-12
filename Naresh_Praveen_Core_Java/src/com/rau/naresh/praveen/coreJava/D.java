package com.rau.naresh.praveen.coreJava;

public class D extends B{
	/*private void  fun0A() {//Cannot reduce the visibility of the inherited method from A
	   	  System.out.println("Fun0A of A");
	     }*/
	  void  fun0A() {//Cannot reduce the visibility of the inherited method from A, 
	   	  System.out.println("Fun0A of A");
	     }
	   /*void fun0AS() {//This instance method cannot override the static method i.e. static method can't override 
      	  System.out.println("Fun0A of A");
        }*/
	  /*Object fun0AReturnType() {//The return type is incompatible with A.fun0AReturnType() or can't be wider 
     	  System.out.println("Fun0A of A");
     	 return new Object();
       }*/
	  
	  Integer fun0AReturnType2() {//return type narrower is legal 
     	  System.out.println("Fun0A of A");
     	  return 1;
       }
	  
	  /*void fun0AExc() throws Exception {//exception type can't be wider 
      	  System.out.println("Fun0A of A");
        }*/
	  
	  void fun0AExc2() throws NullPointerException { //can be narrower
      	  System.out.println("Fun0A of A");
        }
	 public static void main(String[] args){
		D d1= new D();
	    System.out.println("End");
	}
}
