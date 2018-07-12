package com.rau.naresh.praveen.coreJava;

import java.io.IOException;

public class A {//'extends D' Cyclic inheritence not possible in java i.e. C.E.(The hierarchy of the type A is inconsistent) 
  int i,j;
     void funA() {
	  System.out.println("FuncA of A");
  }
      void fun0A() {
   	  System.out.println("Fun0A of A");
     }
     
     static void fun0AS() {
      	  System.out.println("Fun0A of A");
        }
     
      Integer fun0AReturnType() {
     	  System.out.println("Fun0A of A");
     	  return 1;
       }
      
      Object fun0AReturnType2() {
     	  System.out.println("Fun0A of A");
     	  return new Object();
       }
      
      void fun0AExc() throws NullPointerException { 
      	  System.out.println("Fun0A of A");
        }
      
      void fun0AExc2() throws Exception { 
      	  System.out.println("Fun0A of A");
        }
}
