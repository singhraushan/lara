package com.rau.naresh.praveen.coreJava;

public class Annony1 extends A implements Xyz{

	static Xyz getXyz() {
		Xyz x1 = new Xyz() {

			@Override
			public void funX() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void funY() {
				// TODO Auto-generated method stub
				
			}
			
		};
		return x1;
	} 
	public static void main(String[] args) {
		Xyz x1= getXyz();
		System.out.println("this will give address of annonymous class: "+x1);//Annony1$1@135fbaa4
		Xyz x2=null;
		System.out.println(x2.i);
		Abs1.gAbs1();
	}
	@Override
	public void funX() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void funY() {
		// TODO Auto-generated method stub
		
	}

}
interface Xyz {
	 int i=1;
	void funX();
	void funY();
}

abstract class Abs1 {
	static void gAbs1(int ...i) {
		
	}
}