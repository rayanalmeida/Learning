package com.shc.learning.euler;

import java.util.LinkedList;
import java.util.List;

public class ConsecutivePrimeSum {

	private static List<Integer> primesUnderMillion = new LinkedList<Integer>();
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		fetchAllPrimes();
		long end = System.currentTimeMillis();
		System.out.println("# of prime numbers "+primesUnderMillion.size());
		System.out.println("Time take is "+(end-start));
	}
	
	private static void fetchAllPrimes() {
		primesUnderMillion.add(2);
		
		for(int i=3; i <= 10; i++) {
			Double limit = Math.sqrt(Double.valueOf(i));
			limit = limit + 1;
			System.out.println("Limit "+limit);
			for(int j=2; j <= limit.intValue(); j++) {
				if(i % j == 0) {
					break;
				}
				System.out.println("I "+i);
				primesUnderMillion.add(i);
			}
		}
	}
}
