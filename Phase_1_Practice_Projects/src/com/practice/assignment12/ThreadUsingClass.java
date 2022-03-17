package com.practice.assignment12;

//You are given a project to demonstrate the implementation of thread creation mechanisms

//1. Using Thread class
public class ThreadUsingClass extends Thread {

	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("Thread running !!");
	}

	public static void main(String[] args) {
		ThreadUsingClass tobj = new ThreadUsingClass();
		tobj.start();

	}
}