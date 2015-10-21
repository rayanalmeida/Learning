package com.shc.learning.string;

import java.util.LinkedList;
import java.util.List;

public class StringTests {
	
	public static void main(String[] args) {
		//new StringTests().testEqauls();
		//new StringTests().testConcat();;
		new StringTests().testReplace();
	}
	
	private void testEqauls() {
		String x = "123";
		String y = "123";

		StringBuffer sb = new StringBuffer();
		sb.append("1").append("2").append("3");
		
		String z = sb.toString();
		
		System.out.println("x = "+x);
		System.out.println(x.hashCode());
		System.out.println("y = "+y);
		System.out.println(y.hashCode());
		System.out.println("z = "+z);
		System.out.println(z.hashCode());

		System.out.println("x==y = "+(x==y));
		System.out.println("x.equalsIgnoreCase(y) = "+x.equalsIgnoreCase(y));
		System.out.println("y==z = "+(y==z));
		System.out.println("y.equalsIgnoreCase(z) = "+y.equalsIgnoreCase(z));
		System.out.println("x==z = "+(x==z));
		System.out.println("x.equalsIgnoreCase(z) = "+x.equalsIgnoreCase(z));

	}
	
	private void testConcat() {
		String orderItemIdString = "";
		List<Integer> l = new LinkedList<Integer>();
		l.add(99926665);
		l.add(99926668);
		for (Integer item : l) {
			if ("".equals(orderItemIdString)) {
				orderItemIdString = String.valueOf(item);
			} else {
				orderItemIdString = orderItemIdString + " , " + item;
			}
		}
		
		System.out.println(orderItemIdString);
	}
	
	private void testReplace() {
		String orderIdList = "99926665 , 99926668";
		String PD_SYWR_EARN_DETAILS = "SELECT SUM(EARN_POINTS) AS EARN_POINTS, SUM(EARN_DOLLAR_VALUE) AS EARN_DOLLAR FROM PARTS_DIRECT_ORD_ITEM WHERE ORDER_ITEM_ID IN(undefined)";
		String updatedQuery = PD_SYWR_EARN_DETAILS.replace("undefined",orderIdList);
		System.out.println(updatedQuery);
	}
}
