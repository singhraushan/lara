package com.rau.lara.coreJava.collections.part1;

import java.util.Arrays;

public class Y {


	 public static void main(String[] args) {
		 String[] x= {"hello","blue","yello","white","pink","lara","java"};
		  Arrays.sort(x);
		  System.out.println(Arrays.toString(x));
		  
		  int i = Arrays.binarySearch(x,"abc");//this will properly  work if arrays will be sorted
		  System.out.println("abc: "+i);
		  i = Arrays.binarySearch(x,"orange");
		  System.out.println("orange: "+i);
		  i = Arrays.binarySearch(x,"red");
		  System.out.println("red: "+i);
	}


}
