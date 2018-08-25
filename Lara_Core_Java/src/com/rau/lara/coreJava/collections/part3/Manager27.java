package com.rau.lara.coreJava.collections.part3;

import java.util.ArrayList;
import java.util.Collections;

public class Manager27 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("blue");
		list.add("yellow");
		list.add("indigo");
		list.add("red");
		Collections.sort(list);
		int i = Collections.binarySearch(list, "voilet");
		System.out.println(i);
	}
}
