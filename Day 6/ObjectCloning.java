package com.Day6;

public class ObjectCloning implements Cloneable {
	int a = 10;

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		// Object Cloning
		ObjectCloning oc = new ObjectCloning();
		ObjectCloning obj1 = (ObjectCloning) oc.clone();
		oc.a = 20;
		System.out.println(obj1.a);
		System.out.println(oc.hashCode());
		System.out.println(obj1.hashCode());

	}

}
