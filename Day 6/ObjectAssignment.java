package com.Day6;

public class ObjectAssignment {
     int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Object Assignment
		ObjectAssignment ob1 = new ObjectAssignment();
		ObjectAssignment oc2 = ob1;
		oc2.a = 30;
		System.out.println(ob1.a);
		System.out.println(oc2.hashCode());
		System.out.println(ob1.hashCode());
	}

}