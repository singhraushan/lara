package com.rau.naresh.praveen.coreJava;

public class Fdemo2 /*extends F0*/{//C.E.: final class can't get inherited. The type Fdemo2 cannot subclass the final class F0

	//final int k;//CE. can't initialize final variable. The blank final field k may not have been initialized
	final int k=1;
	static final int l=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fdemo2 d1= new Fdemo2();
		//d1.k=k+1;//Cannot make a static reference to the non-static field k
		F0 f1= new F0();
		//f1.i=1;//C.E.:can't access private value outside class The field F0.i is not visible
	}

}
final  class F0 {//'protected' C.E.: outer class can be either public or default only
	private int i; 
	
}