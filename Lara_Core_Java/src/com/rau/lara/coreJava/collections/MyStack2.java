package com.rau.lara.coreJava.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class MyStack2 {
	private Object[] array;
	private int currentPonter = -1;

	public MyStack2() {
		array = new Object[12];
	}

	public MyStack2(int capacity) {
		array = new Object[capacity];
	}

	public void push(Object obj)  throws Exception{
		if(array.length>currentPonter+1){
			array[++currentPonter]= obj;
		}else
		throw new Exception("Stack is alredy full.Can not pus.");
	}

	public Object pop() throws Exception {
		if(currentPonter == -1){
			throw new Exception("Stack is empty.Can not pop.");
		}else{
			Object res =  array[currentPonter];
			array[currentPonter]=null;
			currentPonter--;
			return res;
		}	
	}

	@Override
	public String toString() {
		return Arrays.asList(array).stream().filter(e->e!=null).collect(Collectors.toList()).toString();
	}

	public static void main(String[] args) throws Exception{
		MyStack2 stack = new MyStack2(116);
		stack.push(1);
		stack.push(2);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);

	}
}
