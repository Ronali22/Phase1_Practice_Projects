package com.practice.assignment12;

//2. Thread creation using Runnable interface
public class ThreadUsingInterface implements Runnable {

	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("Thread running !!");
	}

	public static void main(String[] args) {
		ThreadUsingInterface threadObject = new ThreadUsingInterface();
		Thread tobj = new Thread(threadObject);
		tobj.start();
	}
}