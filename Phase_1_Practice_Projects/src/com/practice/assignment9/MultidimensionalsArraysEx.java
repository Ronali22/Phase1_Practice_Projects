package com.practice.assignment9;

//Write a program to create Single-Dimensional and Multidimensional arrays
public class MultidimensionalsArraysEx {

	public static void main(String[] args) {

		int[] arr1 = { 12, 343, 5454, 4343 };// Single-Dimensional array
		int[][] arr2 = { { 10, 12, 13 }, { 20, 25, 27 } };// Multidimensional array

		for (int a : arr1) {
			System.out.println(a);
		}

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
	}
}
