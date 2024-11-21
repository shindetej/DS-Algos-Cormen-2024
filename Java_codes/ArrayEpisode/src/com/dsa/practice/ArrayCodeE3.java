/**
 * 1. Maximum Sum Subarray of Size K
 * 2. Remove duplicates from array
 * 3. Longest Substring Without Repeating Characters

 * 
 * */
package com.dsa.practice;

import java.util.Arrays;

public class ArrayCodeE3 {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 5, 1, 3, 2, 7, 1, 0 };
		int k = 3;
		System.out.println("MAX SUM OF SUB ARRAY  : " + maxSumOfSubArrayOfSizeK(arr, k));
		System.out.println("Unique element array  : " + Arrays.toString(removeDuplicatesFromArray(arr)));

	}

	public static int maxSumOfSubArrayOfSizeK(int[] arr, int k) {
		int sum = 0;
		// get first sum of k elements in array
		for (int i = 0; i < k; ++i) {
			sum += arr[i];
		}
		int maxSumOfKElements = sum;
//		for (int i = 0; i < arr.length-k+1; ++i) {
//			// get sum of next k elements window
//			sum = sum-arr[i]+arr[i+k];
//			if(sum > maxSumOfKElements) {
//				maxSumOfKElements = sum;
//			}
//		}
		// other approach to slide window
		for (int i = k; i < arr.length; ++i) {
			sum = sum - arr[i - k] + arr[i]; // Slide the window by 1 element
			maxSumOfKElements = Math.max(maxSumOfKElements, sum);
		}
		return maxSumOfKElements;
	}

	public static int[] removeDuplicatesFromArray(int[] in) {
		int[] out = new int[in.length];
		int j = 0;
		for (int i = 0; i < in.length; i++) {
			boolean isDuplicate = false;
			int k = 0; // initialization
			while(k<j) { // condition
				if(in[k] == in[i])
					isDuplicate =  true;
				k++; // increment
			}
			if(!isDuplicate) {
				out[j++] = in[i];
			}
		}
		
		int[] finalOut = new int[j];
		System.arraycopy(out, 0, finalOut, 0, j);
		return finalOut;
	}
}
