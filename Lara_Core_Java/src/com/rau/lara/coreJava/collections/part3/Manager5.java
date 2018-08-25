package com.rau.lara.coreJava.collections.part3;

import java.util.ArrayList;

public class Manager5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); 
		list.add(90);
		list.add(0);
		list.add("abc");
		System.out.println(list);
		list.add("xyz");
		System.out.println(list);
		list.add(2,"check");
		System.out.println(list);
	}
}
