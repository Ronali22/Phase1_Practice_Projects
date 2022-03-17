package com.practice.assignment17;

//You are given a project to demonstrate a program implementing the concept of exception
//handling available in Java and the custom exception handlers.
public class ExceptionHandlingEX {

	String getString(String s) {
		return s.concat("test");
	}

	public static void main(String args[]) {
		ExceptionHandlingEX obj = new ExceptionHandlingEX();
		try {
			obj.getString(null);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("inside finally block !!");
		}

	}
}
