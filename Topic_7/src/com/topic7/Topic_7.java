package com.topic7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author dominic
 *
 */

class Worker implements Runnable {
	private String message;

	public Worker(String a) {
		this.message = a;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
		processmessage();
		System.out.println(Thread.currentThread().getName() + " (End)");
	}

	private void processmessage() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

//the thread with join() method

class ShutdownTest extends Thread {
	// Runnable Interface Method
	public void run() {
		System.out.println("Goodbye");
	}
}

class MyThread implements Runnable {
	public void run() {
		System.out.println("Concurrent thread started running..");
	}
}

public class Topic_7 extends Thread {
	
	
	
	Topic_7(String str){
    	super(str);
    }

    public void run()
    {
            System.out.println(Thread.currentThread().getName());
    }
    
    

	public static void main(String[] args) throws Exception {

		ExecutorService executor = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 10; i++) {
			Runnable object = new Worker("" + i);
			executor.execute(object);
		}

		executor.shutdown();
		while (!executor.isTerminated()) {

		}

		System.out.println("********All threads are Finished********");

		MyThread mythread = new MyThread();
		Thread thread = new Thread(mythread);
		thread.start();
		
		Topic_7 t1 = new Topic_7("First thread");
		Topic_7 t2 = new Topic_7("Second thread");
		t1.start();
		
		try {
			t1.join(5500); //Waiting for t1 to finish
		} catch (InterruptedException ie) {
			System.out.println(ie);
		}
		
		t2.start();
		
		try{
            t2.join(4500);      //Waiting for t2 to finish
        }catch(InterruptedException ie){
        	System.out.println(ie);
        }
		

		Runtime obj = Runtime.getRuntime();
		obj.addShutdownHook(new ShutdownTest());
		System.out.println("Program will now sleep after 4 seconds");

		try {
			Thread.sleep(4000);
		} catch (Exception e) {

		}

	}

}
