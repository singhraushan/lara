package com.rau.lara.coreJava.collections.part2;

import java.util.Arrays;
import java.util.Comparator;

class F{
	int i,j;
	F(int i,int j) {
		this.i=i;
		this.j=j;
	}
	@Override
	public String toString() {
		return "(i:"+i+","+"j:"+j+")";
	}
}
class G implements Comparator{
	
	@Override
	public int compare(Object o1,Object o2) {
		return ((F)o1).i-((F)o2).i;
	}
}
class H implements Comparator{
	
	@Override
	public int compare(Object o1,Object o2) {
		return ((F)o1).j-((F)o2).j;
	}
}
public class Manager7 {
  public static void main(String[] args) {
	F[] x = {
			 new F(1,9),
	         new F(5,1),
	         new F(2,3),
	         new F(9,5),
	         new F(3,8),
	         new F(7,4)
	         };
	
	System.out.println(Arrays.toString(x));
	//Arrays.sort(x);//here ClassCastException  coz, class F not Comparable type not comparator type
	Arrays.sort(x,new G());
	System.out.println(Arrays.toString(x));
	Arrays.sort(x,new H());//2nd argument should be comparator type
	System.out.println(Arrays.toString(x));
}
}
