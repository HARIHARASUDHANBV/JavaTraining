package com.Day4;

class Package {
	void noOFPackage() {
		System.out.println("The package count is 1");
	}
}

class Cargo extends Package {
	@Override
	void noOFPackage() {
		System.out.println("Count is 2");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Package p = new Package();
		Cargo c = new Cargo();
		Package ref;
		if (p instanceof Cargo) {
			Cargo c1 = (Cargo) p;
			c1.noOFPackage();
		}
		p.noOFPackage();
		ref = c;
		ref.noOFPackage();
	}

}
