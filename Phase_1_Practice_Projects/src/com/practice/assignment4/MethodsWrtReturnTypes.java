package com.practice.assignment4;

//write a program to demonstrate different methods of different return types.
public class MethodsWrtReturnTypes {

	public void m1(String name) {
		System.out.println("In upperCase the string will be look lyk: " + name.toUpperCase());
	}

	public int m2(int x, int y) {
		return x + y;
	}

	public double m3(double x, double y) {
		return x + y;
	}

	public String m4(String s1, String s2) {
		return s1 + s2;
	}

	public static void main(String args[]) {

		MethodsWrtReturnTypes obj = new MethodsWrtReturnTypes();

		obj.m1("radheshhyam");
		System.out.println(obj.m2(2, 6));
		System.out.println(obj.m3(4, 6));
		System.out.println(obj.m4("519", "543"));

	}

}
