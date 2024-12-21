package com.Day12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Java8Additional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Given a list of integers, find out all the even numbers that exist in the
		// list using Stream functions?

		List<Integer> number = Arrays.asList(10, 10, 11, 12, 13, 14, 15, 22, 31, 11, 44);
		List<Integer> evenList = number.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList);

		// 2.Given a list of integers, find out all the numbers starting with 1 using
		// Stream functions?

		List<Integer> one = number.stream().filter(x -> String.valueOf(x).startsWith("1")).collect(Collectors.toList());
		System.out.println(one);

		// 3.How to find duplicate elements in a given integers list in java using
		// Stream functions?

		List<Integer> duplicate = number.stream().filter(x -> number.indexOf(x) != number.lastIndexOf(x))
				.collect(Collectors.toList());
		System.out.println(duplicate);
		Set<Integer> duplicateSet = number.stream().filter(x -> number.indexOf(x) != number.lastIndexOf(x))
				.collect(Collectors.toSet());
		System.out.println(duplicateSet);
		Set<Integer> tempSet = new HashSet<Integer>();
		long duplicateCount = number.stream().filter(x -> tempSet.add(x) == false).count();
		System.out.println(duplicateCount);

		// 4.Given the list of integers, find the first element of the list using Stream
		// functions?

		int firstElement = number.stream().findFirst().get();
		System.out.println(firstElement);

		// 5.Given a list of integers, find the total number of elements present in the
		// list using Stream functions?

		long count = number.stream().count();
		System.out.println(count);

		// 6.Given a list of integers, find the maximum value element present in it
		// using Stream functions?

		int max = number.stream().max((x, y) -> x - y).get();
		System.out.println(max);

		// 7.Sort the Employee object using salary

		List<Employee> empList = Arrays.asList(new Employee(101, "Hari", 30000), new Employee(102, "Lakshmi", 20000),
				new Employee(103, "Priya", 40000));
		List<Employee> sortList = empList.stream().sorted((e1, e2) -> e1.salary - e2.salary)
				.collect(Collectors.toList());
		System.out.println(sortList);

		// 8. Given a list of integers, sort all the values present in it using Stream
		// functions?

		List<Integer> sortList1 = number.stream().sorted().collect(Collectors.toList());
		System.out.println(sortList1);

		// 9.Given a list of integers, sort all the values present in it in descending
		// order using Stream functions?

		List<Integer> ascSort = number.stream().sorted((x, y) -> y - x).collect(Collectors.toList());
		System.out.println(ascSort);

		// 10.Given an integer array numbers, return true if any value appears at least
		// twice in the array,and return false if every element is distinct.

		tempSet.clear();
		boolean flag = number.stream().filter(x -> tempSet.add(x) == false).count() > 0 ? true : false;
		System.out.println(flag);

		// 11.Java 8 program to find factorial of given list of integer values
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> factList = list1.stream().map(x -> {
			int fact = 1;
			for (int i = 1; i <= x; i++)
				fact = fact * i;
			return fact;
		}).collect(Collectors.toList());
		System.out.println(factList);

		// 12.Write a Java 8 program to sort an array and then convert the sorted array
		// into Stream?

		int arr[] = { 3, 5, 2, 1, 7 };
		Arrays.sort(arr);
		Arrays.stream(arr).forEach(System.out::println);

		// 13.Convert a List of String into upper case using stream

		List<String> strList = Arrays.asList("Apple", "Orange", "Grape");
		List<String> upperList = strList.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperList);

		// 14.Convert a List of String into a Map key and it's length as Map Value using
		// Java 8 Stream

		Map<String, Integer> map = strList.stream().collect(Collectors.toMap(x -> x, x -> x.length()));
		System.out.println(map);

		// 15.flatMap() vs Map()

		List<Integer> even = Arrays.asList(2, 4, 6, 8);
		List<Integer> odd = Arrays.asList(1, 3, 5, 7, 9);
		List<List<Integer>> evenOdd = Arrays.asList(even, odd);
		System.out.println("Before Flattening");
		System.out.println(evenOdd);
		List<Integer> result = evenOdd.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println("After Flattening");
		System.out.println(result);

		// 16.Java 8 : Consumer

		Consumer<String> consumer = str -> System.out.println(str);
		strList.forEach(consumer);

		Consumer<Integer> evenConsumer = n -> {
			if (n % 2 == 0)
				System.out.println(n);
		};
		number.forEach(evenConsumer);

		// 17.Java 8 : Predicate

		Predicate<Integer> evenPredicate = n -> n % 2 == 0;
		number.stream().filter(evenPredicate).forEach(System.out::println);

		// 18.Java 8 : Function

		Function<String, Character> function = str -> str.charAt(0);
		strList.stream().map(function).forEach(System.out::println);

		Function<Integer, String> function1 = n -> {
			if (n % 2 == 0)
				return "Even";
			else
				return "ODD";
		};
		number.stream().map(function1).forEach(System.out::println);

		// 19.Java 8 : Supplier

		Supplier<String[]> supplier = () -> new String[] { "One", "Two", "Three" };
		Arrays.asList(supplier.get()).forEach(System.out::println);

		Predicate<String> myPredicate = str -> str.contains("o") || str.contains("O");
		Consumer<Character> myConsumer = c -> System.out.println(c);
		Function<String, Character> myFunction = str -> str.charAt(0);
		Arrays.asList(supplier.get()).stream().filter(myPredicate).map(myFunction).forEach(myConsumer);
	}

}
