package com.rau.naresh.praveen.coreJava;

public class Odemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A a1 = new A();
       a1.i=13;
       A a2= a1;
       System.out.println(a2.i);
       if(a1 == a2)
    	   System.out.println("a1 is equal to a2");
       else
    	   System.out.println("a1 is not equal to a2");
       System.out.println("a1:"+a1);
       System.out.println("a2:"+a2);
	}

}
