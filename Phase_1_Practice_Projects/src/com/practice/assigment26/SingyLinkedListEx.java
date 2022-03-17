package com.practice.assigment26;

//Write a program to create and perform operations on the singly linked list.
public class SingyLinkedListEx {
	public Node head = null;
	public Node tail = null;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addNode(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void display() {
		Node current = head;

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Number of the nodes singly linked list are: ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		SingyLinkedListEx sList = new SingyLinkedListEx();

		sList.addNode(5);
		sList.addNode(6);
		sList.addNode(7);
		sList.addNode(2);
		sList.addNode(1);
		sList.addNode(3);
		sList.addNode(7);
		sList.addNode(8);
		sList.display();
	}

}

