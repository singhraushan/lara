package com.rau.naresh.praveen.coreJava;

import java.util.ArrayList;
import java.util.Collection;

public class Etest2 extends Etest1{
	/*Etest2() {//CE:since super class throwing exception Unhandled exception type Exception
		
	}*/
    /*Etest2() {
    	try {
		super();//CE: try is also a stament. Constructor call must be the first statement in a constructor
    	}catch (Exception e) {
			// TODO: handle exception
		}
	}*/
	
	Etest2() throws Exception{// mandatory to throw exception here.
    	
	}
	static void test() {
		 
	 }
	public static void main(String[] args) {
		Collection<String> s= new ArrayList<String>();
	}
}
 class Etest1 {
	 Etest1() throws Exception{
		 System.out.println("Etest1() throws exc");
	 }
	 
	static  void test() {
		 
	 }
 }
 
 
 interface E1 {
	  void e1();
 }
 class C1 implements E1 {
	public void e1() {//interface method by default public and abstract
		 
	 }
 }