package com.shc.learning;

public class Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Assignment1 obj = new Assignment1();
		obj.doSomething(10);
		obj.doSomething(1L,new Integer(2));
		Object str = new String("ABC");
		System.out.println(str.toString());
		obj.doSomething(str);
	}

	public void doSomething(int i) {
		System.out.println("Do something int" +i);
	}
	
	public void doSomething(Integer i) {
		System.out.println("Do something Integer" +i);
	}
	
	public void doSomething(long l) {
		System.out.println("Do something long" +l);
	}
	
	public void doSomething(Long l) {
		System.out.println("Do something Long" +l);
	}

	public void doSomething(Object o) {
		System.out.println("Do something object" +o);
	}
	
	public void doSomething(String s) {
		System.out.println("Do something String" +s);
	}

//	public void doSomething(int i, int j) {
//		System.out.println("Do something int int");
//	}
//
//	public void doSomething(long l, int i) {
//		System.out.println("Do something long int");
//	}
//
//	public void doSomething(int i, long l) {
//		System.out.println("Do something int long");
//	}
//
//	public void doSomething(long i, long l) {
//		System.out.println("Do something long long");
//	}

	public void doSomething(Integer i, long l) {
		System.out.println("Do something Integer long");
	}
	
	public void doSomething(Long i, Long l) {
		System.out.println("Do something LL long");
	}

	public void doSomething(long l, Integer i) {
		System.out.println("Do something long Integer");
	}

	public void doSomething(Long l, Integer i) {
		System.out.println("Do something Long Integer");
	}
}
