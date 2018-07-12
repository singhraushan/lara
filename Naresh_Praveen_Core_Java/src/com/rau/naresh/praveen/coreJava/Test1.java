package com.rau.naresh.praveen.coreJava;

public class Test1 {

	public static void main(String[] args) {
		M m1= new N();
		//m1.fun1();//C.E.:because fun1 is not available for class M. The method fun1() is undefined for the type M
	    m1.i=6;//this will got to i of M.
	    m1.funM();
	    m1.funN();//this will execute in sub most class(since available for M) i.e. N
	}

}
