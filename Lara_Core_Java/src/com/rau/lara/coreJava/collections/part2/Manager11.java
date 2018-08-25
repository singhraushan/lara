package com.rau.lara.coreJava.collections.part2;

public class Manager11 {
	public static void main(String[] args) {
		int[][] x = new int[3][2];
		//System.out.println(x[0][2]);//java.lang.ArrayIndexOutOfBoundsException
	    int y[][] = new int[3][];
		System.out.println(y[1][0]);//there is no array inside x[0].So, NullPointerException

	}
}
