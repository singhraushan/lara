package com.rau.lara.coreJava.collections.part2;

import java.util.Arrays;

class C {
	int i;
	C(int i) {
		this.i=i;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i;
	}
}
public class Manager3 {
  public static void main(String[] args) {
	C[] x = new C[4];
	x[0]=new C(9);
	x[1]=new C(5);
	x[2]=new C(7);
	x[3]=new C(4);
	System.out.println(Arrays.toString(x));
	Arrays.sort(x);//here ClassCastException  coz, class C not Comparable type
	System.out.println(Arrays.toString(x));
}
}
