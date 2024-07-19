package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInheritance {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("name1");
		names.add("name2");
		printList(names);
		
		List<Integer> numbers=new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		printList(numbers);
	}

	private static void printList(List<Object> names) {
		//names.add("name3"); //It will break type safety
		names.forEach(System.out::println);
	}
}
