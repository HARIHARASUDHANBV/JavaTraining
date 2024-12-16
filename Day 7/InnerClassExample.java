package com.Day7;

interface Anonymous {
	void eat();
}

class Example {
	int a = 10;
	int b = 20;

	class Inner { // Non-static Inner class
		int c = 30;

		void displayInner() {
			System.out.println(a + " " + b + " " + c);
		}
	}

	static class Inner2 {
		int d = 40;
		Example e1 = new Example();
		Example.Inner i1 = e1.new Inner();

		void displayStaticInner() {
			System.out.println(e1.a + " " + e1.b + " " + i1.c + " " + d);
		}
	}

	void message() {
		class Local {
			int e = 50;

			void msg() {
				System.out.println(e);
			}

		}
		Local l = new Local();
		l.msg();

	}

}

public class InnerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example e = new Example();
		Example.Inner i = e.new Inner();
		i.displayInner();
		Example.Inner2 i1 = new Example.Inner2();
		i1.displayStaticInner();
		e.message();
		Anonymous a = new Anonymous() {
			public void eat() {
				System.out.println("Fruits");
			}
		};
		a.eat();

	}

}
