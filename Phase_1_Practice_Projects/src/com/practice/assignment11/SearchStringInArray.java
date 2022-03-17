package com.practice.assignment11;

import java.util.Arrays;
import java.util.Scanner;

// Write a program to search String entered by a user from the Array of Strings
public class SearchStringInArray {

	public static void main(String agrs[]) {

		String[] arr = { "srikant", "raju", "shyam", "simran" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your string:");
		String in = sc.next();
		if (Arrays.asList(arr).contains(in)) {

			System.out.println("true");

		} else {
			System.out.println("false");
		}

	}

}
