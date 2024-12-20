package com.Day11;

@FunctionalInterface
interface MyReference {
	void showMessage();
}

class MyClass {
	void myInstanceMethod() {
		System.out.println("Example for Instance method");

	}

	static void myStaticMethod() {
		System.out.println("Example for static method");
	}

	MyClass() {
		System.out.println("Constructor");

	}
}

public class MethodReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reference to Instance Method
		MyClass obj = new MyClass();
		MyReference ref = obj::myInstanceMethod;
		ref.showMessage();
		// Reference to Static method
		ref = MyClass::myStaticMethod;
		ref.showMessage();
		// Reference to a Constructor
		ref = MyClass::new;
		ref.showMessage();
	}

}
