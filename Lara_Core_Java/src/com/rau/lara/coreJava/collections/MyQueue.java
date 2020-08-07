package com.rau.lara.coreJava.collections;

import java.util.LinkedList;

public class MyQueue {

	LinkedList<Object> queue = new LinkedList<Object>();

	public void enQueue(Object obj) {
		queue.add(obj);
	}
	
	public Object deQueue() {
		return queue.removeFirst();
	}
	
	@Override
	public String toString() {
		return queue.toString();
	}
	
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enQueue(1);
		queue.enQueue(2);
		System.out.println("queue: "+queue);
		System.out.println(queue.deQueue());
		System.out.println("queue: "+queue);
	}

}
