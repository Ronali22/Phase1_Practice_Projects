package com.practice.assignment3;

//As a developer,write a program to create an arithmetic calculator
public class ArithmeticCalculator {

	public int add(int x, int y) {
		int result = x + y;
		return result;
	}

	public int sub(int x, int y) {
		int result = x - y;
		return result;
	}

	public int mul(int x, int y) {
		int result = x * y;
		return result;
	}

	public int div(int x, int y) {
		int result = x / y;
		return result;
	}

	public int mod(int x, int y) {
		int result = x % y;
		return result;
	}

	public static void main(String args[]) {
		ArithmeticCalculator ac = new ArithmeticCalculator();

		System.out.println("Addition of two numbers = " + ac.add(5, 10));
		System.out.println("Substraction of two numbers = " + ac.sub(5, 10));
		System.out.println("Multiplication of two numbers = " + ac.mul(5, 10));
		System.out.println("Division of two numbers = " + ac.div(10, 5));
		System.out.println("Modulus of two numbers = " + ac.mod(5, 10));

	}

}