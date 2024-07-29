package com.luv2code.junitdemo.tdd;

public class FizzBuzz {

	public static String computer(int number) {
		if (number % 3 == 0) {
			return "Fizz";
		} else if (number % 5 == 0) {
			return "Buzz";
		}

		return null;
	}
}
