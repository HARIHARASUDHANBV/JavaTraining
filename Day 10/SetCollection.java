package com.Day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class SetExample {
	Set<Integer> set = new HashSet<Integer>();

	void functionsOnSet() {
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

public class SetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetExample se = new SetExample();
		se.functionsOnSet();
	}

}
