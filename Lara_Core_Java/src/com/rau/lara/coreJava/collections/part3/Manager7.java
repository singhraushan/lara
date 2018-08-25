package com.rau.lara.coreJava.collections.part3;

import java.util.ArrayList;

public class Manager7 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); 
		list.add(9);
		list.add(0);
		list.add(90);
		list.add(19);
		
		ArrayList list2 = new ArrayList(); 
		list2.add(100);
		list2.add(50);
		list2.add("abc");
		list2.addAll(1, list);
		System.out.println(list);
		System.out.println(list2);
	}

}
