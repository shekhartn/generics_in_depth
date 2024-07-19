package com.generics;

import java.util.Arrays;
import java.util.List;

public class AutoBoxingDemo {

	public static void main(String[] args) {

		List<Integer> numbers= Arrays.asList(10,20,30);
		int i=numbers.get(0);
		System.out.println(i);
		
	}

}
