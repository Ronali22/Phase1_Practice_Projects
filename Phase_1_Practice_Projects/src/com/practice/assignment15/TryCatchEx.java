package com.practice.assignment15;

//You are given a project to demonstrate the uses of try-catch blocks in Java.
//try..catch is used to catch the exceptions
public class TryCatchEx {
	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.concat("test"));
			int val = 10 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

}