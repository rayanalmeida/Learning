package com.tbd.assignments;

/**
 * If a method has return; statement in the finally block, it will suppress the return; statement in the try block
 * In the example below, whenever the program executes normally, the output will always be "finally".
 * Workaround is to have return; in the finally with a variable whoch value canbe set differently in try, catch and finally.
 * 
 * If you call System.exit(), jvm terminates, so finally will not get executed.
 * @author Rayan
 *
 */
public class FinallyBehavior {

	public static void main(String[] args) {

		String answer = new FinallyBehavior().testAssignment();
		System.out.println("The answer is "+answer);
		
		answer = new FinallyBehavior().testAssignmentCorrectly();
		System.out.println("The answer is "+answer);
	}

	public String testAssignment() {
		int j = 10;
		try {

			int result = j/1;

			return "try";
		} catch (Exception e) {
			return "catch";
		} finally {
			return "finally";
		}
	}
	
	public String testAssignmentCorrectly() {
		int j = 10;
		String output = null;
		try {

			int result = j/1;

			output = "try";
			output = null;
		} catch (Exception e) {
			output = "catch";
		} finally {
			return null == output ? "finally" : output;
		}
	}

}
