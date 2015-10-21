package com.tbd.assignments;

public final class Singleton {
	
	private static Singleton instance;
	private Singleton() {
		
	}
	
	synchronized public static final Singleton getInstance() {
		
		if(null == instance) {
			instance = new Singleton();
		}
		return instance;
	}

}
