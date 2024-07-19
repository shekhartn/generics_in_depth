package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GerericsRuntimeChecks {

	public static void main(String[] args) {

		List<String> namesList =new ArrayList<>();
		addToNames(namesList,"name1");
		addToNames(namesList,"name2");
		System.out.println(namesList);
		incorrectAddtoNames(namesList,100);
		System.out.println(namesList);
		String name3=namesList.get(2);
		System.out.println(name3);
		
		
		
		
	}
	private static void incorrectAddtoNames(List names, int i) {
		names.add(i);
	}

	private static void addToNames(List<String> names, String name) {

		names.add(name);
	}

}
