package com.Day8;

import java.util.Date;

public class DateExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getDay());

		System.out.println(date.getDate());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());

	}

}