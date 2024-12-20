package com.Day11;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
		Optional<String> nameOptional = Optional.ofNullable(name);
		if (nameOptional.isPresent()) {
			String value = nameOptional.get();
			System.out.println(value);
		} else {
			System.out.println("The object is null");
		}
	}

}
