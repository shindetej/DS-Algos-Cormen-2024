package quicksort;

import java.util.Arrays;
import java.util.List;

public class PartitionAlgorithm {

	public static void main(String[] args) {
		int[] arr = { 5,67,7,8,3,12};

		int p = 0;
		int q = arr.length - 1;

		int index = pa1(arr, p, q);
		for (int i : arr) {
			System.out.print(i + "  ,");
		}
		System.out.println("INDEX : " + index);

	}

	private static int partitionAlgorithm(int[] arr, int p, int q) {
		System.out.println("P : " + p);
		System.out.println("q : " + q);
		int pivot = arr[q];
		System.out.println("pivot : " + pivot);

		int i = p - 1;
		int j = p;
		while (j < q) {
			System.out.println("arr[" + j + "](" + arr[j] + ")" + " <= " + pivot);
			if (arr[j] <= pivot) {
				i++;
				// SWAP
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			j++;
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[q];
		arr[q] = temp;
		return i + 1;
	}

	private static int quickSort(int[] arr, int low, int high) {
		while(low<high) {
			int pivotIndex = partitionAlgo1(arr, low, high);
//			low to new index -1 
			quickSort(arr, low, pivotIndex-1);
//			index+1 to high
			quickSort(arr, low, pivotIndex-1);
				
		}
	}

	private static int pa1(int[] a, int left, int right) {
		/*
		 * create two pointer to travel i and j respectively j pointer points to p j = p
		 * lower bound of array index i = p-1
		 * 
		 * iterate until jth less than q that is second last element in array as last
		 * element is pivot at each iteration check jth iteration
		 */
		int j = left;
		int i = left - 1;
		int pivot = a[right];

		// this loop runs until j traverse till q i.e right most element
		while (j < right) {
			if (a[j] <= pivot) {
				i++;

				// SWAP
			System.out.println("a["+i+"] :"+a[i]+" swapped with a["+j+"] : "+a[j]);
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			j++;
		}
		int index = i+1;
		int temp = a[index];
		a[index] = a[right];
		a[right] = temp;
		return index;
	}
	
	private static int partitionAlgo1( int[]a , int left, int right) {
		int i = left-1;
		
		int pivot =  a[right];
		
		for(int j = left; j < right;j++) {
			if(a[j] <= pivot)
			{
				i++;
				int temp= a[i];
				a[i] = a[j];
				a[j] =  temp;
			}
		}
		
		int indexAtPivotShift =  i+1;
		int temp = a[indexAtPivotShift];
		a[indexAtPivotShift] = pivot;
		a[right] =  temp;
		
		return indexAtPivotShift;
	}

}
