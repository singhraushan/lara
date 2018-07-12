package com.rau.naresh.praveen.coreJava;

public class Pdemo4 {
	
    void fun1(byte b) {
    	System.out.println(b);
    }
	
    public static void main(String[] args) {
    	Pdemo4 p1 = new Pdemo4();
    	//p1.fun1(6);//Error, here can't apply hard-coding beacuse b defined already
    	p1.fun1((byte)6);//No error
	}
}
