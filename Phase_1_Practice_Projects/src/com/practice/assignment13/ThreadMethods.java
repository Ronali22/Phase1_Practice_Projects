package com.practice.assignment13;

//write a program to demonstrate the execution of sleep(), wait(),
//and its uses in the threading concept.
public class ThreadMethods {

	private static Object obj = new Object();

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName() + " Thread has called after two second");
		synchronized (obj) {
			obj.wait(2000);
			System.out.println(obj + ": Object was in waiting state and called after 2 seconds");
		}
	}

}

