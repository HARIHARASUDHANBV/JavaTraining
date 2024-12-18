package com.Day9;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Linked {
	List<Integer> ll = new LinkedList<Integer>();

	void displayLinked() {
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		List<Integer> ll2 = new LinkedList<Integer>();
		ll2.add(60);
		ll2.add(70);
		ll2.add(80);
		ll2.addAll(ll);
		ListIterator<Integer> li = ll2.listIterator();
		while (li.hasPrevious()) {
			System.out.println(" " + li.previous());
		}
	}
}

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked l = new Linked();
		l.displayLinked();
	}

}
