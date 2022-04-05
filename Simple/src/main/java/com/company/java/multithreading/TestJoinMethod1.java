package com.company.java.multithreading;

public class TestJoinMethod1 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		TestJoinMethod1 t1 = new TestJoinMethod1(); // what to do
		TestJoinMethod1 t2 = new TestJoinMethod1(); // works on data collected by thread 1
		TestJoinMethod1 t3 = new TestJoinMethod1(); // create dependencies as t2 and t3 
		// cannot function simply half without t1's info
		// DONT start t2 and t3 before t1 completes.
		t1.start();
		try {
			t1.join(); // t1 is joined to the  main thread.
			// Will not reach t2.start() until t1 completes. Main thread is also 
			// halted.
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();
	}
}