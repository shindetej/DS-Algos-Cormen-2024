package com.dsa.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCodeE2 {
	public static void main(String[] args) {

		int[] sortedArr1 = { 2, 5, 12, 90, 211 };
		int[] sortedArr2 = { 9, 10, 111, 190, 196 };

		// merge two sorted array
		System.out.println(Arrays.toString(mergeSortedArray(sortedArr1, sortedArr2)));
		System.out.println(Arrays.toString(mergeSortedArraySimplified(sortedArr1, sortedArr2)));
	}

	public static int[] mergeSortedArray(int[] a1, int[] a2) {
		int[] mergedSortedArr = new int[a1.length + a2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (true) {
			if (a1[i] <= a2[j]) {
				mergedSortedArr[k] = a1[i];
				i++;
				k++;
				if (i == a1.length) { // if all a1 element added
					while (j < a2.length) {
						mergedSortedArr[k] = a2[j];
						j++;
						k++;
					}
					break;
				}
			} else {
				mergedSortedArr[k] = a2[j];
				j++;
				k++;
				if (j == a2.length) {
					while (i < a1.length) {
						mergedSortedArr[k] = a1[i];
						k++;
						i++;
					}
					break;
				}
			}

		}
		return mergedSortedArr;
	}

	public static int[] mergeSortedArraySimplified(int[] a1, int[] a2) {
		int[] mergedSortedArr = new int[a1.length + a2.length];

		int i = 0, j = 0, k = 0;

		while (i < a1.length && j < a2.length) {
			if (a1[i] <= a2[j]) {
				mergedSortedArr[k++] = a1[i++];
			} else {
				mergedSortedArr[k++] = a2[j++];
			}
		}
		
		while(i<a1.length) {
			mergedSortedArr[k++]=a1[i++];
		}
		
		while(j<a2.length) {
			mergedSortedArr[k++]=a2[j++];
		}
		
		return mergedSortedArr;
	}
}
