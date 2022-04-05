package com.company.java.multithreading;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutorMain {

	public static void main(String args[]) throws InterruptedException, ExecutionException {

		// CALLABLE VS RUNNABLE : Callable returns something runnable doesnt

		/*
		 * FetchDataFromFile ft = new
		 * FetchDataFromFile("C:\\UsingRunnableSimpleThread"); Thread t = new
		 * Thread(ft); t.start();
		 *
		 * DECORATOR DESIGN PATTERN: FetchDataFromFileUsingCallale fc = new
		 * FetchDataFromFileUsingCallale("C:\\UsingCallableSimpleThread"); FutureTask
		 * futureTask = new FutureTask(fc); Thread t1 = new Thread(futureTask);
		 * t1.start();
		 *
		 * if (!futureTask.isDone()) { System.out.println("FutureTask1 output=" +
		 * futureTask.get()); }
		 */

		List<Future<String>> listOfRsults = new ArrayList<Future<String>>();
		
		ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
		FetchDataFromFile fdff = new FetchDataFromFile("File Runnable");
		
		Future<String> result1 = (Future<String>) threadPoolExecutor.submit(fdff);
		
		for (int i = 0; i < 10; i++) { //
			FetchDataFromFileUsingCallale dataFromFileCall = new FetchDataFromFileUsingCallale("File " + i);
			System.out.println("A new file has been added to read : " + dataFromFileCall.getFileName()); // threadPoolExecutor.submit(fdff);
			Future<String> result = threadPoolExecutor.submit(dataFromFileCall);
			listOfRsults.add(result);
		}

		/*
		 * List<Future<Integer>> listOfIntRsults = new ArrayList<Future<Integer>>();
		 *
		 * FetchDataFromFileUsingCallaleI dataFromFileCall = new
		 * FetchDataFromFileUsingCallaleI("File ");
		 * System.out.println("A new file has been added to read : " +
		 * dataFromFileCall.getFileName()); // threadPoolExecutor.submit(fdff);
		 * Future<Integer> result = threadPoolExecutor.submit(dataFromFileCall);
		 * listOfIntRsults.add(result);
		 */
//		for (Iterator iterator = listOfRsults.iterator(); iterator.hasNext();) {
//			Future<String> future = (Future<String>) iterator.next();
//			System.out.println("Result is ::" + future.get());
//
//		}

		/*
		 * for (Iterator iterator = listOfIntRsults.iterator(); iterator.hasNext();) {
		 * Future<Integer> future = (Future<Integer>) iterator.next();
		 * System.out.println("Result Integer is ::" + future.get());
		 *
		 * }
		 */
		// threadPoolExecutor.shutdown();

	}

}

class FetchDataFromFile implements Runnable {

	private final String fileName;

	public FetchDataFromFile(String fileName) {
		super();
		this.fileName = fileName;
	}

	public void run() {
		try {
			System.out.println("Fetching data from " + fileName + " by " + Thread.currentThread().getName());
			Thread.sleep(5000); // Reading file
			System.out.println("Read file successfully: " + fileName + " by " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getFileName() {
		return fileName;
	}
}

class FetchDataFromFileUsingCallale implements Callable {

	private final String fileName;

	public FetchDataFromFileUsingCallale(String fileName) {
		super();
		this.fileName = fileName;
	}

	public String call() {
		try {
			System.out.println("Fetching data from " + fileName + " by " + Thread.currentThread().getName());
			Thread.sleep(5000); // Reading file
			System.out.println("Read file successfully: " + fileName + " by " + Thread.currentThread().getName());

		} catch (InterruptedException e) {
			e.printStackTrace();
			return "Failure" + Thread.currentThread().getName() + ":" + this.fileName;
		}
		return "Success::" + Thread.currentThread().getName() + ":" + this.fileName;
	}

	public String getFileName() {
		return fileName;
	}
}

class FetchDataFromFileUsingCallaleI implements Callable {

	private final String fileName;

	public FetchDataFromFileUsingCallaleI(String fileName) {
		super();
		this.fileName = fileName;
	}

	public Integer call() {
		try {
			System.out.println("Fetching data from " + fileName + " by " + Thread.currentThread().getName());
			Thread.sleep(5000); // Reading file
			System.out.println("Read file successfully: " + fileName + " by " + Thread.currentThread().getName());

		} catch (InterruptedException e) {
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	public String getFileName() {
		return fileName;
	}
}