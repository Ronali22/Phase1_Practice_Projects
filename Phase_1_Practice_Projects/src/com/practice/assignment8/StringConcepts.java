package com.practice.assignment8;

//Write a program to create Strings and display the conversion of String to StringBuffer and StringBuilder
public class StringConcepts {

	public static void main(String args[]) {

		String s = "Raju";
		StringBuffer sb = new StringBuffer(s);
		sb.append("Yadav");
		System.out.println(sb);

		String s1 = "Simran";
		StringBuilder sb1 = new StringBuilder(s1);
		System.out.println(sb1);
	}

}