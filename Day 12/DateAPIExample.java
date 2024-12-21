package com.Day12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAPIExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		System.out.println(currentDate.getYear());
		System.out.println(currentDate.getClass().getName());
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println();
		System.out.println(currentDateTime);
	}

}
