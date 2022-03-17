package com.practice.assigment27;

//Write a program to create and perform operations on the circular linked list.

public class CircularLinkedListEx {

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}

	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println(" Given list is empty");
		} else {
			System.out.println(" The number of nodes of the circular linked list are: ");
			do {
				System.out.print(" " + current.data);
				current = current.next;
			} while (current != head);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		CircularLinkedListEx cl = new CircularLinkedListEx();
		cl.add(5);
		cl.add(8);
		cl.add(9);
		cl.add(2);
		cl.display();
	}

}
