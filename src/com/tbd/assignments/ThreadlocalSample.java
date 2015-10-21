package com.tbd.assignments;


public class ThreadlocalSample {

	ThreadLocal<MyObject> ref;

	public void testThis() {
		ref = new ThreadLocal<MyObject>() {
			@Override
			protected MyObject initialValue() {
				// TODO Auto-generated method stub
				return new MyObject();
			}
		};
		
		MyObject sdf = ref.get();
	}
	
	private class MyObject {
		String str;
	}

}
