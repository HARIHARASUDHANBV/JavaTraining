package com.Day11;

import java.util.Arrays;
import java.util.List;

public class ForEachWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.forEach(number -> System.out.println(number));

	}

}
