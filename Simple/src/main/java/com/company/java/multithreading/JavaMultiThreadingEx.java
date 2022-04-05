package com.company.java.multithreading;

public class JavaMultiThreadingEx {

	public static void main(String[] args) { // Single Thread
		// TODO Auto-generated method stub'

		System.out.println("Current thread is:: " + Thread.currentThread().getName());

//		ThreadEx ex = new ThreadEx();
//		ThreadEx ex1 = new ThreadEx();
//
//		ex.start();
//		ex1.start();
//		
//		for(int i=0; i<1000; i++) {
//			System.out.println("Inside main thread loop::");
//		}

		ThreadUsingRunnable exUsingRunnable1 = new ThreadUsingRunnable();
//		ThreadUsingRunnable exUsingRunnable2 = new ThreadUsingRunnable();

		Thread t1 = new Thread(exUsingRunnable1);

		t1.setName("FileReading");

		Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				System.out.println("Using annonymous inner class: DB Thread:");

			}
		};

		Thread t2 = new Thread(r); // Life cycle state: New

		t2.setName("DatabaseThread");

		Runnable r2 = () -> System.out.println("Using Lambda Expression: Inside EmailSending:");
		// Lambda expression has a relationship with functional interface

		Thread t3 = new Thread(r2);

		t3.setName("EmailSending");

		t1.start(); // Life cycle state: Runnable // Thread is running when start() calls run()
		t1.setPriority(6);
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t2.start();
//		t2.setPriority(5);

		t3.start();
//		t3.setPriority(4);

//		MyFunctionalInterface functionalInterface = () -> { System.out.println("Inside MyFunctionalInterface"); };
//		functionalInterface.functionalEx();

	}

}

class ThreadEx extends Thread {

	public void run() {
		// System.out.println("Thread name is:: " + Thread.currentThread().getName());
		for (int i = 0; i < 1000; i++) {
			System.out.println("Inside thread loop:: " + Thread.currentThread().getName());
		}
	}
}

class ThreadUsingRunnable implements Runnable { // Functional interface only has one abstract method

	public void run() { // Runnable has one abstract method
		System.out.println("Thread name is:: " + Thread.currentThread().getName());
//		for(int i=0; i<1000; i++) {
//			System.out.println("Insideq thread loop:: " + Thread.currentThread().getName());
//		}
	}
}

@FunctionalInterface
interface MyFunctionalInterface {
	public void functionalEx();
}
