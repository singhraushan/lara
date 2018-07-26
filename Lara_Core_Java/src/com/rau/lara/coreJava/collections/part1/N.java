package com.rau.lara.coreJava.collections.part1;

public class N {
	public static void main(String[] args) {	
		int[] x = new int[2];//'int[]' is a class
		x[0] = 10;
		Object obj= x;
		//obj[1]=20;//C.E.: The type of the expression must be an array type but it resolved to Object
		int[] z= (int[])obj;
		z[1]=30;
		System.out.println("Done!");


	}
}
