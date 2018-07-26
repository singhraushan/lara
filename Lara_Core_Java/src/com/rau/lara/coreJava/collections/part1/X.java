package com.rau.lara.coreJava.collections.part1;

import java.util.Arrays;

public class X {

	 public static void main(String[] args) {
		  int[] x= {10,20,30,40,4,25};
		  Arrays.sort(x);
		  int i = Arrays.binarySearch(x,4);//this will properly  work if arrays will be sorted
		  System.out.println(i);
		  i = Arrays.binarySearch(x,5);
		  System.out.println(i);
		  i = Arrays.binarySearch(x,11);
		  System.out.println(i);
		  i = Arrays.binarySearch(x,24);
		  System.out.println(i);
	}

}
