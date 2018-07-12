package com.rau.naresh.praveen.coreJava;

public class Access6 {
  private Access6() {
	
  }
  public static Access6 getAccess( ) {//factory method always should be public and static
	  return new Access6();
  }
}
