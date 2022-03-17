package com.practice.assignment10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Write a program to search a specific String from the give set of Strings using regular expressions
public class SearchString {

	public static void main(String args[]) {

		Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Java is an oops based language!!");
		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}

	}

}