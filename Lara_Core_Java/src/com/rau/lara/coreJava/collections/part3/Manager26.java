package com.rau.lara.coreJava.collections.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class F {
	int i, j;

	F(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		return "(i:" + i + "," + "j:" + j + ")";
	}
}

class G implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return ((F) o1).i - ((F) o2).i;
	}
}

class H implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return ((F) o1).j - ((F) o2).j;
	}
}

public class Manager26 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new F(1, 9));
		list.add(new F(5, 1));
		list.add(new F(2, 3));
		list.add(new F(9, 5));
		list.add(new F(3, 8));
		list.add(new F(7, 4));

		System.out.println(list);
		// Arrays.sort(x);//here ClassCastException coz, class F not Comparable type not
		// comparator type
		Collections.sort(list, new G());
		System.out.println(list);
		Collections.sort(list, new H());// 2nd argument should be comparator type
		System.out.println(list);
	}
}
