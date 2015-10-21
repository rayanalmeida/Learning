package com.shc.learning;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalPrecision {

	public static void main(String[] args) {
		new BigDecimalPrecision().testPrecision();

	}
	
	private void testPrecision() {
		BigDecimal n = new BigDecimal(785.085999);
		n = n.setScale(2, RoundingMode.HALF_EVEN);
		System.out.println(n);
		System.out.println(n.intValue());
		System.out.println(n.longValue());
		System.out.println(n.floatValue());
		System.out.println(n.doubleValue());
	}

}
