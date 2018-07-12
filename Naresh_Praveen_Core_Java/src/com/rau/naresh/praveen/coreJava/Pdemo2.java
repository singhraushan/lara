package com.rau.naresh.praveen.coreJava;

public class Pdemo2 {
    
    public static void main(String[] args) {
        int i=6;
        float f=6;//here implicit type casting happening
		System.out.println(f);
		float k= i;
		System.out.println(k);
		
		float a =(float)6.0;//required explicitly type casting for double(8 byte) to float(4 byte) 
		System.out.println(a);
		float b =6.0f;
		System.out.println(b);
		long c = 6;
		int d = (int)c;//required explicitly type casting for long(8 byte) to int(4 byte)
	    char ch = 90;//here explicitly type casting not required because of hard coding
	    System.out.println(ch);
	    int q = ch;
	    System.out.println(q);
	    
	}
}
