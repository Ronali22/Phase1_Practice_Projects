package com.practice.assignment5;

//Write a program to demonstrate the use of Constructors and its types
public class TypesOfConstructor {
	String name;
	int rollno;

	public TypesOfConstructor() {// default constructor
	}

	TypesOfConstructor(String name, int rollno) {// parameterized constructor
		this.name = name;
		this.rollno = rollno;

	}

	public static void main(String[] args) {

		TypesOfConstructor emp1 = new TypesOfConstructor("shyam", 242);// calling parameterized constructor
		System.out.println("Name of emp1 is=" + emp1.name);
		System.out.println("Name of emp2 is=" + emp1.rollno);

		TypesOfConstructor emp2 = new TypesOfConstructor("raju", 243);
		System.out.println("Roll number of emp1 is=" + emp2.name);
		System.out.println("Roll number of emp2 is=" + emp2.rollno);

	}

}
