package com.rau.naresh.praveen.coreJava;

public class Stdemo3 {
    int i,j;
	static int x;
	
	public static void main(String[] args) {
		x=3;
		Stdemo3 d1 = new Stdemo3();
		System.out.println(d1.i);
		Stdemo3 d2 = null;
		System.out.println(d2.x);//no error, because context already loaded in RAM, so even assigning null also can use ref for static.
		System.out.println(d1);
		Stdemo3 d3 = new Stdemo3();
		d3.i=13;
		Stdemo3 d4 = new Stdemo3();
		d4.i=113;
		System.out.println(d3.i);
		System.out.println(d4.i);
		x=x+1;
		System.out.println(d2.x);
		System.out.println(d3.x);
		System.out.println(d4.x);
	}
}
