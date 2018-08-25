package com.rau.lara.coreJava.collections.part3;

import java.util.ArrayList;
import java.util.Collections;

class D implements Comparable{
	int i;

	D(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "i:" + i;
	}
	@Override
	public int compareTo(Object obj) {
		return i-((D)obj).i;
	}
	
}

public class Manager24 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new D(9));
		list.add(new D(4));
		list.add(new D(5));
		list.add(new D(2));

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}
}
