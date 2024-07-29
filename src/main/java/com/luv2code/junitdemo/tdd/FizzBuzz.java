package com.luv2code.junitdemo.tdd;

public class FizzBuzz {

	public static String computer(int number) {
		if (number % 3 == 0 && number % 5 == 0) {
			return "FizzBuzz";
		} else if (number % 3 == 0) {
			return "Fizz";
		} else if (number % 5 == 0) {
			return "Buzz";
		}

		return Integer.toString(number);
	}
}
