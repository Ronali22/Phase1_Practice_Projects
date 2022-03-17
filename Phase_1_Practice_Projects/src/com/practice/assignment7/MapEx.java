package com.practice.assignment7;

import java.util.HashMap;
import java.util.Map;

// write a program to demonstrate the uses of map.
public class MapEx {
	public static void main(String[] args) {

		// Map stores data in key: value pairs
		Map<Integer, String> map = new HashMap();
		map.put(1, "shruti");
		map.put(2, "praveen");
		map.put(3, "shyam");
		map.put(4, "seema");
		map.put(5, "reena");
		System.out.println(map);
	}

}
