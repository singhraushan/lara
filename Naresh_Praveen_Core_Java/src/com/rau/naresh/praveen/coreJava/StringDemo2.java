package com.rau.naresh.praveen.coreJava;

public class StringDemo2 {

	public static void main(String[] args) {
		String s1="abc";
		String s2="xyz";
		if(s1==s2)
			System.out.println("s1&s2 are same");
		else
			System.out.println("s1&s2 are not same");
		
		String s3= new String("abc");
		if(s1==s3)
			System.out.println("s1&s3 are same");
		else
			System.out.println("s1&s3 are not same");
		
		String s4="abc";
		if(s1==s4)
			System.out.println("s1&s4 are same");//op
		else
			System.out.println("s1&s4 are not same");
	
		System.out.println(4+"");
	}

}
