package com.rau.naresh.praveen.coreJava;

 class UserDefinedException extends Exception{
	String message;
	UserDefinedException(String exceptionMessage) {
		message = exceptionMessage;
	}
	@Override
	public String toString() {
		return "Exception: "+message;
	}
}

 public class TestExc{
	public static void main(String[] args) {
		try {
			throw new UserDefinedException("creating my exception and throwing");
		} catch (UserDefinedException e) {
			e.printStackTrace();
		}
	}
}
