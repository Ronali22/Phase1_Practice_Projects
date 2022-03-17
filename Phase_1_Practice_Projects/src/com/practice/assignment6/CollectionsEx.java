package com.practice.assignment6;

//write a program to demonstrate the uses of collections and its types.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionsEx {

	public static void main(String args[]) {

		// Array list is used to add the elements in the Insertion order
		List<String> list = new ArrayList<String>();
		list.add("raju");
		list.add("shyam");
		list.add("shruti");
		System.out.println(list);

		// Linked list will display According to the numbers in the list
		List<Integer> li = new LinkedList<Integer>();
		li.add(34435);
		li.add(33433);
		li.add(1234);
		System.out.println(li);

		// Hash set is used to Eliminate the duplicate Elements
		Set<String> set = new HashSet<String>();
		set.add("radhe");
		set.add("reetu");
		set.add("seema");
		System.out.println(set);

		Set<Integer> s1 = new LinkedHashSet<Integer>();
		s1.add(335);
		s1.add(788);
		s1.add(577);
		System.out.println(s1);

	}

}

