package com.rau.lara.coreJava.collections.part2;

public class Manager9 {
	public static void main(String[] args) {
         int[][] x= new int[3][2];
         x[0][0]=10;
         x[0][1]=10;
         x[1][0]=10;
         x[1][1]=10;
         x[2][0]=10;
         x[2][1]=10;
         for(int i=0;i<x.length;i++) {//lenght = 3
        	 for(int j=0;j<x[i].length;j++) { //x[i]=2
        		 System.out.println(x[i][j]);
        	 }
         }
         
         
 	}
}
