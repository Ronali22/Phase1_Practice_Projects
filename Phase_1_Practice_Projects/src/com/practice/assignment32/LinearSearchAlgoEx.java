package com.practice.assignment32;

//You are given a project to demonstrate the workflow of a linear search algorithm.
public class LinearSearchAlgoEx {

	private static void LinearSearch(int[] arr, int item) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				System.out.println(item + " => Found this number at index: " + i);
				return;
			}
		}
		System.out.println("Number is not found");

	}

	public static void main(String args[]) {
		int[] arr = { 5, 6, 2, 3 };

		int item = 2;
		LinearSearch(arr, item);
	}

}