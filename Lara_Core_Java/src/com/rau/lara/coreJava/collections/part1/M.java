package com.rau.lara.coreJava.collections.part1;

public class M {

	public static void main(String[] args) {	
		int[] x = new int[2];//'int[]' is a class
		int[] y = x;
		Object obj= y;
		int[] z= (int[])obj;
		System.out.println("Done!");

	}

}
