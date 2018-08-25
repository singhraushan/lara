package com.rau.lara.coreJava.collections.part3;

import java.util.ArrayList;

public class Manager2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); 
		list.add(90);
		list.add(true);
		int i = (int) list.get(0);
		boolean flag = (boolean) list.get(1);
		System.out.println(i);
		System.out.println(flag);
	}
}
