package com.rau.lara.coreJava.collections.part1;

public class R {

	public static void main(String[] args) {
		int i=10;
		test1(i);
		test1(10);
		int[] x = new int[2];
		x[0]=10;
		x[1]=20;
		test2(x);
		test2(new int[] {90,30,50});
		
	}
	public static void test1(int x) {
		System.out.println(x);
	}
	public static void test2(int[] x) {
		System.out.println(x.length);
	}


}
