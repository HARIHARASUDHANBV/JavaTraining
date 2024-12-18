package com.Day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCollection {

	@SuppressWarnings({ "unlikely-arg-type", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		list.add(40);
		list.add(50);
		list.add(65);
		System.out.println(list.get(2));
		System.out.println(list.remove(3));
		System.out.println(list.set(2, 40));
		System.out.println(list.contains(20)); // true
		System.out.println(list.size()); // 3
		System.out.println(list.isEmpty()); // false

//		Way-1
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
//		Way-2
		for (Integer i : list) {
			System.out.println(list);
		}
//		Way-3
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		Iterator<Integer> i = list.iterator();
		while (i.hasNext()) {
			Integer t = i.next();
			if (t % 2 == 1) {
				i.remove();
			}
			System.out.println(list);
		}

	}

}
