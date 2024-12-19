package com.Day10;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		SortedSet<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);

		System.out.println(set);
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		System.out.println(set.contains(10));
		for (Integer i : set) {
			System.out.println(i);
		}
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}