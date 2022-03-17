package com.practice.assignment1;

import java.util.Scanner;

//Write a program which will take a string as value and will convert it into other primitive data types.
public class TypeConversion {
	public static void main(String[] arg) {
		Scanner src = new Scanner(System.in);
		System.out.println("please enter your number");
		String value = src.next();
		int num1 = Integer.valueOf(value);
		double num2 = Double.valueOf(value);
		float num3 = Float.valueOf(value);
		long num4 = Long.valueOf(value);
		System.out.println("Integer value = " + num1);
		System.out.println("Double value = " + num2);
		System.out.println("Float value = " + num3);
		System.out.println("Long value = " + num4);

	}
}
