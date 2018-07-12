package com.rau.naresh.praveen.coreJava;

public class Cdemo2 {
	public static void main(String[] args) {
		try {
			
		} catch (Throwable e/*Object e*/) {//CE: No exception of type Object can be thrown; an exception type must be a subclass of Throwable
			// TODO: handle exception
		}
		
        try {
			
		} catch (Throwable e) {
			
		}/*catch (NullPointerException e) {//CE: Unreachable catch block for NullPointerException. It is already handled by the catch block for Throwable
			
		}*/
   }
	
	static void test1() {
		int x=0;
		boolean flag=true;
		 while(flag) {
			 x=x+1;
			 System.out.println(x);
		 }
		 System.out.println("unreachable compile time error");//No error beacuse flag is variable can change
   }
	static void test2() {
		int x=0;
		 while(true) {
			 x=x+1;
			 System.out.println(x);
		 }
		// System.out.println("unreachable compile time error");//CE: Unreachable code
   }
}
