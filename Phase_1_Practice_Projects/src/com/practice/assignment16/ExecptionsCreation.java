package com.practice.assignment16;

//You are given a project to demonstrate the uses of the throws, throw, finally,
//and custom exceptions in Java.

class InvalidAgeException extends Exception {
	String s1;

	InvalidAgeException(String s) {
		s1 = s;
	}

	@Override
	public String toString() {
		return ("Output String = " + s1);
	}
}

public class ExecptionsCreation {

	private static final String checkAge = null;

	public int m1(int x, int y) {
		return x / y;
	}

	public String m2(String s1) throws NullPointerException {// throws used
		return s1.concat("reddy");
	}

	public void checkEligibilityToVote(int age) {
		if (age >= 18) {
			System.out.println("Eligible for vote");
		} else if (age < 18) {
			try {
				throw new InvalidAgeException("Please enter valid age");// throw used
			} catch (InvalidAgeException exception) {
				System.out.println(exception);
			}
		}
	}

	public static void main(String[] args) {
		ExecptionsCreation object = new ExecptionsCreation();
		try {
			System.out.println(object.m1(2, 0));
			System.out.println(object.m2(null));
			object.checkEligibilityToVote(16);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Try Catch has Completed");
		}

	}
}

