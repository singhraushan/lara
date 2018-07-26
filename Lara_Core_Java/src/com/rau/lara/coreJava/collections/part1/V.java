package com.rau.lara.coreJava.collections.part1;

import java.util.Arrays;

public class V {
	 public static void main(String[] args) {
		  String[] x= {"abc","aBc","ABc","123","ABC","Abc","9899","9999"};
		  
		  System.out.println(Arrays.toString(x));
		  Arrays.sort(x);
		  System.out.println(Arrays.toString(x));
	}
}
