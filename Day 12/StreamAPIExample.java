package com.Day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// forEach is the termination operation
		// filer is an intermediate operation
		// count and collect are termination operations as well
		List<Integer> numbers = Arrays.asList(1, 2, 5, 7, 8, 3, 9, 4, 6);
		numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
		long count = numbers.stream().filter(x -> x % 2 == 0).count();
		System.out.println(count);
		List<Integer> numbers1 = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(numbers1);

		List<Integer> numbers2 = numbers.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());
		System.out.println(numbers2);
		List<Integer> numbers3 = numbers.stream().limit(3).skip(1).collect(Collectors.toList());
		System.out.println(numbers3);
		List<Integer> numbers4 = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(numbers4);

	}

}
