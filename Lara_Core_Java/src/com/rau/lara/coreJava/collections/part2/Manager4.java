package com.rau.lara.coreJava.collections.part2;

import java.util.Arrays;

class D implements Comparable{
	int i;
	D(int i) {
		this.i=i;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i;
	}
	
	@Override
	public int compareTo(Object o) {
		return i-((D)o).i;
	}
}
public class Manager4 {
  public static void main(String[] args) {
	D[] x = new D[4];
	x[0]=new D(9);
	x[1]=new D(5);
	x[2]=new D(7);
	x[3]=new D(4);
	System.out.println(Arrays.toString(x));
	Arrays.sort(x);//here ClassCastException  coz, class C not Comparable type not comparator type
	System.out.println(Arrays.toString(x));
}
}
