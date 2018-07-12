package com.rau.naresh.praveen.coreJava;


public class R {
	void funR() {
		System.out.println("funR of R");
	}
	
	public static void main(String[] args) {
		P p1 = new P();
		System.out.println(p1.i);
		Q q1 = new Q();
		q1.funQ();
		R r1 = new R();
		r1.funR();
		System.out.println("Main of R!");
	}
}

class P {
 int i,j;
}
class Q {
	void funQ() {
		System.out.println("funQ of Q");
	}
}
