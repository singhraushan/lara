package com.rau.naresh.praveen.coreJava;

public class Edemo04 {

	void fun1() throws ArithmeticException{
		System.out.println("Runtime exception ie. unchecked exception");
	}
	void fun2() throws ClassNotFoundException{
		System.out.println("Not Runtime exception ie. checked exception");
	}
	void fun3() throws Exception{
		System.out.println("Not Runtime exception ie. checked exception");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Edemo04 e1 = new Edemo04();
      e1.fun1();
      //e1.fun2();//CE: since checked exception. Unhandled exception type ClassNotFoundException
      try {
    	  e1.fun2();
    	  e1.fun3();
	}/*finally {
	   //finally can't be before catch	
	}*/  catch (Exception e) {
		// TODO: handle exception
	}finally {
		
	}/*finally {
	//one try can't have more than 1 finally block	
	}*/
     
      
      
      try {
		
	} finally {//using finally can avoid the catch block
		// TODO: handle finally clause
	}
      
	}

}
