package com.rau.lara.coreJava.collections.part1;

public class Q {

	public static void main(String[] args) {
		test(new int[] {10,20});
	}
	public static void test(int[] x) {
		System.out.println(x.length);
		for(int i:x) {
			System.out.println(i);	
		}
		
	}

}
