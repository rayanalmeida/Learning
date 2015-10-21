package com.shc.learning;

import java.util.Random;

public class RandomTests {

	public static void main(String[] args) {
		new RandomTests().testRandom();

	}
	
	private void testRandom() {
		Random r = new Random();
		for(int i=0; i<=99; i++) {
			System.out.println(r.nextInt(100));
		}
	}

}
