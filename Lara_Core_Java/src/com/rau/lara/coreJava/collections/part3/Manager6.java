package com.rau.lara.coreJava.collections.part3;

import java.util.ArrayList;

public class Manager6 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); 
		list.add(9);
		list.add(0);
		list.add(90);
		list.add(19);
		System.out.println(list);
		ArrayList list2 = new ArrayList(); 
		list2.add(100);
		list2.add(50);
		list2.addAll(list);
		System.out.println(list);
		System.out.println(list2);
	}

}
