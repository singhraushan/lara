package com.rau.naresh.praveen.coreJava;

public class Poly5 {
    
    void fun1(int x,float y) {
    	System.out.println("fun1 parameter: int x,float y");
    }
    void fun1(float x,int y) {
    	System.out.println("fun1 parameter: float x,int y");
    }
	public static void main(String[] args) {
		Poly5 poly5 = new Poly5();
		int i=10,j=12;
		//poly5.fun1(i,j);//C.E. The method fun1(A) is ambiguous for the type Poly4
		//System.out.println(null); //C.E. The method println(char[]) is ambiguous for the type PrintStream
	}

}
