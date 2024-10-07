package com.dsa.practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayCodeE1 {
	public static void main(String[] args) {
		System.out.println("Enter size of array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] intArray = getIntegerArray(size);

		System.out.println("Array Input : ");
		System.out.println(Arrays.toString(intArray));
		System.out.println("Array Reversed : ");
		System.out.println(Arrays.toString(getReverseArray(intArray)));
		
		System.out.println("MAX Number In Array : "+ getMax(intArray));
		System.out.println("MIN Number In Array : "+ getMin(intArray));
		System.out.println("Sum Of Numbers In Array : "+ sumOfArray(intArray));
	}

	private static int[] getIntegerArray(int size) {
		Random r = new Random();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = r.nextInt(100) + 1;
		}
		return arr;
	}

	private static int[] getReverseArray(int[] input) {
		if (input == null) {
			return null;
		}
		int[] reversed = new int[input.length];
		for (int k = 0; k < input.length / 2; k++) {
			reversed[k] = input[input.length - 1 - k];
			reversed[input.length - 1 - k] = input[k];
		}
		// If the array has an odd length
		if (input.length % 2 != 0) {
			reversed[input.length / 2] = input[input.length / 2];
		}

		return reversed;
	}

	private static int sumOfArray(int[] input) {
		int sum = 0;
		for (int i : input) {
			sum += i;
		}
		return sum;
	}

	private static int getMax(int[] input) {
		int max = 0;
		for (int i : input) {
			if (i > max)
				max = i;
		}
		return max;
	}
	private static int getMin(int[] input) {
		int min = Integer.MAX_VALUE;
		for (int i : input) {
			if (i < min)
				min = i;
		}
		return min;
	}
}
