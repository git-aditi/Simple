package com.company.java.multithreading;

public class DaemonExample {
	public static void main(String[] args) {
		WorkerThread t1 = new WorkerThread("file1");
		WorkerThread t2 = new WorkerThread("file2");

		ServiceThread t3 = new ServiceThread("file1");

		t1.start();
		t2.start();
		t3.setDaemon(true);
		t3.start();
	}
}

class WorkerThread extends Thread { // ALWAYS use runnable // This is only example

	private String fileName;

	public WorkerThread(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void run() {
		System.out.println("Writing contents to file::" + this.getFileName() + "::" + Thread.currentThread().getName());
	}
}

class ServiceThread extends Thread {
	// Daemon Thread is a service thread
	// Life of Daemon thread is on the mercy of user thread.
	// If user thread does not exist, Daemon does not exist

	private String fileName;

	public ServiceThread(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void run() {

		System.out.println("Converting the written file into another format::");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}