package com.tbd.assignments;

public class BasicThread {

	public static void main(String[] args) {
		
		new BasicThread().performTest();

	}
	
	private void performTest() {
		Thread t1 = new Thread1();
		t1.start();
		
		Runnable r = new Thread2();
		r.run();
	}
	
	private class Thread1 extends Thread {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
		}

		@Override
		public synchronized void start() {
			// TODO Auto-generated method stub
			super.start();
		}
		
	}
	
	private class Thread2 implements Runnable {

		@Override
		public void run() {
			System.out.println("Thread 2 running");
			
		}
		
	}

}
