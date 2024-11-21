package com.flextrade.practice;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		  try {
	            // Code that may throw an exception
	            int[] numbers = {1, 2, 3};
	            System.out.println("Accessing element at index 3: " + numbers[3]); // This will throw an exception
	        } catch (ArrayIndexOutOfBoundsException e) {
	            // Handle the exception
	            System.out.println("Exception caught: " + e.getMessage());
	        } finally {
	            // Code that will always execute
	            System.out.println("This block always executes, exception or not.");
	        }

	        System.out.println("Program continues...");
	}
}
