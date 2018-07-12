package com.rau.naresh.praveen.coreJava;

public class DynamicPolyTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer i = Integer.parseInt(args[0].trim());
        Integer x = Integer.parseInt(args[1].trim());
        
        P0 p1= null;
        if(i>0&& i<=10)
        	p1= new P0();
        if(i>10&& i<=20)
        	p1= new Q0();
        if(i>20)
        	p1= new R0();
        p1.funP(i);
        
	}

}
