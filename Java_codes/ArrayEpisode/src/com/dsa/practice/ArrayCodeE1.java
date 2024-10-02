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
		int[] reversed = null;

		if (input != null) {
			reversed = new int[input.length];
			for (int k = 0; k <= input.length / 2; k++) {
				reversed[k] = input[input.length - 1 - k];
				reversed[input.length - 1 - k] = input[k];
			}
		}
		return reversed;
	}
}
