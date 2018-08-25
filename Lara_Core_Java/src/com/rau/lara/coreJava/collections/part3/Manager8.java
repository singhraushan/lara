package com.rau.lara.coreJava.collections.part3;

import java.util.ArrayList;

public class Manager8 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); 
		list.add(90);
		list.add(0);
		list.add(9);
		list.add(4);
		System.out.println(list);
		ArrayList list2 = new ArrayList(list); 
		list2.add("abc");
		System.out.println(list2);
	}

}
