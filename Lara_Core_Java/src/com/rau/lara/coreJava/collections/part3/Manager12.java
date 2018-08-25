package com.rau.lara.coreJava.collections.part3;

import java.util.ArrayList;

public class Manager12 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); 
		list.add(9);
		list.add(0);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(2);
		list.add(1);
		list.add(3);
		
		ArrayList list2 = new ArrayList(); 
		list2.add(5);
		list2.add(4);
		list2.add(2);
		list2.add(8);
		
		System.out.println(list);
		System.out.println(list2);
		System.out.println("--------");
		list.removeAll(list2);
		System.out.println(list);
		System.out.println(list2);
		
	}

}
