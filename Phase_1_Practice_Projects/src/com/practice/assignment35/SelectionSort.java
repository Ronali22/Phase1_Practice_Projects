package com.practice.assignment35;

import java.util.Arrays;

//You are given a project to demonstrate the workflow of a selection sort algorithm.
public class SelectionSort {

	static void sel_sort(int numArray[]) {
		int n = numArray.length;

		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (numArray[j] < numArray[min_idx])
					min_idx = j;

			int temp = numArray[min_idx];
			numArray[min_idx] = numArray[i];
			numArray[i] = temp;
		}
	}

	public static void main(String args[]) {
		int numArray[] = { 5, 3, 6, 7, 8, 9, 2, 1, 0 };
		System.out.println("Given Array Elements Are: " + Arrays.toString(numArray));
		sel_sort(numArray);
		System.out.println("Elements obtained after Sorting are:" + Arrays.toString(numArray));
	}

}

