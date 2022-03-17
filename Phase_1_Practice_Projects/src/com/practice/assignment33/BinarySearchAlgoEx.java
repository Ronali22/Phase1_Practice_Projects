package com.practice.assignment33;

import java.util.Arrays;

//You are given a project to demonstrate the workflow of a binary search algorithm.
public class BinarySearchAlgoEx {
	public static void main(String args[]) {
		int numArray[] = { 1, 4, 3, 2, 9 };
		System.out.println("Input array is:: " + Arrays.toString(numArray));
		int key = 3;
		System.out.println("\nSearch the key number=" + key);
		int first = 0;
		int last = numArray.length - 1;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (numArray[mid] < key) {
				first = mid + 1;
			} else if (numArray[mid] == key) {
				System.out.println("Find the Index of the Element: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Searching Element is not Found");
		}
	}

}
