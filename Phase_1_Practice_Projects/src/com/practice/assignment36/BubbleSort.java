package com.practice.assignment36;

//You are given a project to demonstrate the workflow of a bubble sort algorithm.
public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 5, 6, 2, 3, 1, 0, 9, 6 };
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}
	}

	public static void bubbleSort(int[] arr) {
		int len = arr.length;
		int temp = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 1; j < (len); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;

				}

			}
		}
	}
}
