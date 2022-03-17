package com.practice.assignment14;

//You are given a project to demonstrate the multithreading with and without synchronization.
public class MultiThreadEx implements Runnable {

	public static void main(String[] args) {
		MultiThreadEx object = new MultiThreadEx();
		Thread tobj = new Thread(object);
		// without synchronization
		tobj.start();
		// with synchronization
		object.m1();

	}

	public void run() {
		System.out.println("Greetings for the day..");
		System.out.println("hello..");
		System.out.println("hi..");
	}

	public void m1() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}

		}
	}

}
