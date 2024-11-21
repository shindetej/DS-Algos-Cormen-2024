package com.tejas.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Given an unsorted array arr[]. 
 * Rotate the array to the left (counter-clockwise direction) by d steps, 
 * where d is a positive integer. 
 * Do the mentioned change in the array in place.
 */
public class RotateArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int d = 2;

		rotateArr(arr, d);

	}

	private static void rotateArrBrute(int arr[], int d) {
		System.out.println("d = " + d);
		d = d % arr.length; // because d can be greater than length but rotating n  is gives you current array
		System.out.println("d = " + d);
		int n = arr.length;
		System.out.println(Arrays.toString(arr));

		// code
		// create temp list and add it first d element
		List<Integer> tempList = new ArrayList<>();
		for (int i = 0; i < d; i++) {
			tempList.add(arr[i]);
		}

		for (int j = d; j < n; j++) {
			arr[j - d] = arr[j];
		}

//		int t = 0;
		for (int k = n - d; k < n; k++) {
			arr[k] = tempList.get(k-(n-d)); // without using t variable
//			arr[k] = tempList.get(t++);
		}

		System.out.println(Arrays.toString(arr));
	}
	
	
	private static void rotateArrOptimal(int arr[],int d) {
		
		d = d % arr.length; // because d can be greater than length but rotating n  is gives you current array
		reverse(arr, 0, d-1);	
		reverse(arr, d, arr.length-1);
		reverse(arr, 0, arr.length-1);
		
	}
	
	private static void reverse(int arr[],int start ,int end) {
		
		while(start < end) {
			int temp =  arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
	}
	
}
