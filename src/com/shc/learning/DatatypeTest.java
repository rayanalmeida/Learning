package com.shc.learning;

public class DatatypeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String amount = "79";
		Double d = Double.valueOf(amount);
		System.out.println(d);
		double d1 = d.doubleValue();
		System.out.println(d1);

	}

}
