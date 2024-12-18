package com.Day9;

import java.util.Enumeration;
import java.util.Vector;

public class VectorCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vec = new Vector<Integer>(3, 2); // Vector(InitialCapacity,CapacityIncrement)
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		vec.add(60);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		Enumeration<Integer> e = vec.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
