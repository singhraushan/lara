package com.rau.naresh.praveen.coreJava;
//StringBuilder is faster than StringBuffer because of thread safe concept.
public class StringBufferDemo1 {

	public static void main(String[] args) {
		//StringBuffer s1= "abc";// can't assign string object to StringBuffer.
		StringBuffer s1= new StringBuffer("abc");
		System.out.println(s1);
		//s1=s1+'x';// concatenation is only for String & arithmetic
		//s1=s1+"x";// concatenation is only for String & arithmetic
		s1.append('x');
		s1.append(true);
		StringBuffer s2=s1.append("x");
		if(s1==s2)
			System.out.println("s1&s2 are same");
		else
			System.out.println("s1&s2 are not same");
		
		String s3="example";
		StringBuffer b1= new StringBuffer(s3);
		b1.reverse();//it reverse same object means mutable class.args but String is immutable class 
		String s4=new String(b1);
		System.out.println(s4);
		System.out.println(b1);
	}

}
