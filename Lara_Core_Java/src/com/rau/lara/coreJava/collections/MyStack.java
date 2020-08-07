package com.rau.lara.coreJava.collections;

import java.util.LinkedList;

public class MyStack {
	LinkedList<Object> list = new LinkedList<Object>();
	
	public void push(Object obj) {
		list.add(obj);
	}
	
	public Object pop() {
		return list.removeLast();
	}
	
	@Override
	public String toString() {
		return list.toString();
	}

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
	}
}
