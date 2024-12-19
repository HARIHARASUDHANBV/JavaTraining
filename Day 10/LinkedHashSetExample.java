package com.Day10;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

class LinkedHash {
	Set<Integer> set = new LinkedHashSet<Integer>();

	void displayFunctionsLinked() {
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(null);
		set.add(null);

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

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHash lh = new LinkedHash();
		lh.displayFunctionsLinked();
	}

}
