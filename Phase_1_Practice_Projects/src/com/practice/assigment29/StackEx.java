package com.practice.assigment29;

//Write a program to perform operations on a stack.

import java.util.Stack;

public class StackEx {
	public static void main(String argvs[]) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(3);
		stack.push(1);
		stack.push(8);
		stack.push(7);
		stack.push(9);
		stack.push(0);
		stack.push(3);
		int size = stack.size();
		System.out.println("size of the stack is: " + size);
		System.out.println("stack contains: " + stack);
	}

}

