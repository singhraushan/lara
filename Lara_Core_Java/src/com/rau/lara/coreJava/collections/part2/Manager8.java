package com.rau.lara.coreJava.collections.part2;

import java.util.Arrays;
import java.util.Comparator;

class Person {
	String name;
	int age;
	double weight;

	public Person(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "(name:" + name + ",age:" + age + ",weight:" + weight + ")";
	}

	static class SortBasedOnName implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			return ((Person) o1).name.compareTo(((Person) o2).name);
		}
	}

	static class SortBasedOnAge implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			return ((Person) o1).age - ((Person) o2).age;
		}
	}

	static class SortBasedOnWeight implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			return (int) (((Person) o1).weight - ((Person) o2).weight);
		}
	}

}

public class Manager8 {
	public static void main(String[] args) {
		Person[] x = { new Person("ramu", 22, 55.09), 
						new Person("kiran",32, 65.09),
						new Person("pavan",23,45.09),
				        new Person("vijay",27,50.09)
		};

		System.out.println(Arrays.toString(x));
		Arrays.sort(x, new Person.SortBasedOnName());
		System.out.println(Arrays.toString(x));
		Arrays.sort(x, new Person.SortBasedOnAge());
		System.out.println(Arrays.toString(x));
		Arrays.sort(x, new Person.SortBasedOnWeight());
		System.out.println(Arrays.toString(x));
	}
}
