package com.rau.naresh.praveen.coreJava;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class AssertDemo1 {

	void fun1(boolean flag) {
		System.out.println("Start of fun1");
		try {
			assert flag;//if false then raise essertError object	
		} catch (Error e) {
			e.printStackTrace();
		}
		System.out.println("End of fun1");
	}
	
	public static void main(String[] args) {
		AssertDemo1 assertDemo1 = new AssertDemo1();
		assertDemo1.fun1(true);
		assertDemo1.fun1(false);
		
		//Enumeration<String> e = 
	}

}
