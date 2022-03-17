package com.practice.assignment19;

//wap to demonstrate the uses of classes, objects, and the object-oriented pillars in Java.

class Parent {

	public void m1() {
		System.out.println("inside parent class method");
	}
}

public class OopsConceptsEx extends Parent {

	// method overriding
	public int m1(int x, int y) {
		return x + y;
	}

	// method overloading
	public long m1(long x, long y, long z) {
		return x + y + z;
	}

	@Override
	public void m1() {
		System.out.println("inside child class methods.");
	}

	public static void main(String[] args) {
		OopsConceptsEx object = new OopsConceptsEx();
		object.m1();

	}

}
