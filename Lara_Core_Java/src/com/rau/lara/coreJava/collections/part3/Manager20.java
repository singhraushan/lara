package com.rau.lara.coreJava.collections.part3;

import java.util.ArrayList;
import java.util.Collections;

public class Manager20 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList(); 
		list.add("abc");
		list.add("aBC");
		list.add("ABC");
		list.add("abc");
		list.add("ABc");
		list.add("123");
		
		System.out.println(list);
		Collections.sort(list);//java.lang.ClassCastException coz all type will be same type.
		System.out.println(list);
		
	}
}
