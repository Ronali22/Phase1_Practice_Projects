package com.practice.assigment30;

import java.util.LinkedList;
import java.util.Queue;

//Write a program to demonstrate working of a queue.
public class QueueEx {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		que.add(3);
		que.add(6);
		que.add(7);
		que.add(9);
		que.add(1);
		System.out.println("The queue is: " + que);
		int num1 = que.remove();
		System.out.println("one element deleted from the head ie: " + num1);
		System.out.println("queue after deletion: " + que);
		int head = que.peek();
		System.out.println("head of the queue is: " + head);
		int size = que.size();
		System.out.println("size of the queue is: " + size);
	}

}