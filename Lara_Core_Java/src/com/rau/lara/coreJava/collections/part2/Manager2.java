package com.rau.lara.coreJava.collections.part2;

import java.util.Arrays;

class B {
	int i;
	B(int i) {
		this.i=i;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i;
	}
}
public class Manager2 {
  public static void main(String[] args) {
	B[] x = new B[2];
	x[0]=new B(2);
	x[1]=new B(90);
	B[] y = {new B(9),new B(80)};
	System.out.println(Arrays.toString(x));
	System.out.println(Arrays.toString(y));
}
}
