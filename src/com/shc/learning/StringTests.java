package com.shc.learning;

public class StringTests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(replace("this is won<salescheck>derful", "<salescheck>", "12345"));
		System.out.println("this is won<salescheck>derful".replaceAll("<salescheck>", "12345"));

	}
	
	public  static String replace(String source, String pattern, String replace){

		if (source!=null){

			final int len = pattern.length();
			StringBuffer sb = new StringBuffer();
			int found = -1;
			int start = 0;
			while( (found = source.indexOf(pattern, start) ) != -1) {
				sb.append(source.substring(start, found));
				sb.append(replace);
				start = found + len;
			}
			sb.append(source.substring(start));
			return sb.toString();
		}
		else return "";
	}

}
