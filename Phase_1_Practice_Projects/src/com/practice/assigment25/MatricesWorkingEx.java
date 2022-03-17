package com.practice.assigment25;

//Write a program to demonstrate working of matrices.
public class MatricesWorkingEx {

	public static void main(String args[]) {
		int a[][] = { { 2, 6, 8 }, { 3, 8, 9 }, { 1, 5, 7 } };
		int b[][] = { { 2, 6, 8 }, { 3, 8, 9 }, { 1, 5, 7 } };
		int c[][] = new int[3][3]; // 3 rows and 3 columns
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j]; // Matrices elements added
				System.out.print(c[i][j] + " ");
			}
			System.out.println();// for new line
		}
	}

}