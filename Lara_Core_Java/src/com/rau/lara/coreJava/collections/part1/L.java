package com.rau.lara.coreJava.collections.part1;

public class L {
	public static void main(String[] args) {	
		int[] x = new int[2];
		int[] y = new int[3];
		x=y;
		y=x;
		System.out.println("Done!");
		
		System.out.println(x.length);
		System.out.println(y.length);
	}
}
