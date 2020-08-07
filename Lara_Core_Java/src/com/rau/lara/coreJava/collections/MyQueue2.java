package com.rau.lara.coreJava.collections;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MyQueue2 {

	private Object[] queue;
	private int last = -1;

	public MyQueue2() {
		queue = new Object[12];
	}

	public MyQueue2(int capacity) {
		queue = new Object[capacity];
	}

	public synchronized void enQueue(Object obj) throws Exception {
		if (queue.length > last + 1) {
			queue[++last] = obj;
		} else {
			throw new Exception("Queue is already full. Can not enqueue.");
		}
	}

	public synchronized Object deQueue() throws Exception {
		if(last==-1)
			throw new Exception("Queue is empty. Can not dequeue.");
		Object obj = queue[0];
		queue[0] = null;//last=1. && len =2
		for(int i=0;i<last;i++){
			queue[i] = queue[i+1]; 
		}
		queue[last]=null;
		last--;
		return obj;
	}

	@Override
	public String toString() {
		return Arrays.asList(queue).stream().filter(e->e!=null).collect(Collectors.toList()).toString();
	}

	public static void main(String[] args) throws Exception{
		MyQueue2 queue = new MyQueue2();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		System.out.println("queue: " + queue);
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println("queue: " + queue);
	}

}
