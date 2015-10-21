package com.tbd.assignments;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Write code to find the First non repeated character in the String. 
 * If String is “hello”, the output is ‘h’. If the string is “how i met your mother”, the the output should be ‘w’.
 * @author Rayan
 *
 */
public class NonRepeatedCharacter {

	private final static String str = "How I met your mother";
	public static void main(String[] args) {
		char result = new NonRepeatedCharacter().getResult();
		System.out.println("The answer is: "+result);
	}
	
	private char getResult() {
		
		char result = ' ';
		int count = 0;
		char[] characters = str.toCharArray();
		int length = characters.length;
		char[] temp = new char[length];
		
		Map<Character, String> mapping = new HashMap<Character, String>();
		
		for(int i=0; i<length; i++) {
			Character ch = characters[i];
			System.out.println(ch);
			
			String s = mapping.put(ch, "Y");
			if(null == s) {
				temp[count] = ch;
				count++;
			} else {
				mapping.put(ch, "N");
			}
		}
		
		for(int i=0; i<temp.length; i++){
			String val = mapping.get(temp[i]);
			if("Y".equals(val)){
				result = temp[i];
				break;
			}
		}
		return result;
	}

}
