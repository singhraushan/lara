package com.rau.lara.coreJava.collections.part2;

import java.util.Arrays;

class E implements Comparable{
	int i,j;
	E(int i,int j) {
		this.i=i;
		this.j=j;
	}
	@Override
	public String toString() {
		return "(i:"+i+","+"j:"+j+")";
	}
	
	@Override
	public int compareTo(Object o) {
		return j-((E)o).j;
		//return i-((E)o).i;
	}
}
public class Manager6 {
  public static void main(String[] args) {
	E[] x = new E[5];
	x[0]=new E(1,2);
	x[1]=new E(2,0);
	x[2]=new E(0,1);
	x[3]=new E(5,9);
	x[4]=new E(3,4);
	
	System.out.println(Arrays.toString(x));
	Arrays.sort(x);//here ClassCastException  coz, class C not Comparable type not comparator type
	System.out.println(Arrays.toString(x));
}
}
