package com.practice.assignment7;

// Write a program to demonstrate the working of inner class
class OuterClass {
	int oc = 2324;

	class InnerClass {
		int ic = 87873;

	}
}

public class OuterInnerClass {

	public static void main(String[] arg) {
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		System.out.println(inner.ic + "\n" + outer.oc);

	}
}
