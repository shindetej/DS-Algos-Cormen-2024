package tejas.practice.recursion;

import java.util.ArrayList;

public class uniqueNumberListExample {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 4, 6, 8, 1, 2, 9 };
		
		System.out.println("\nWITH WHILE LOOP : ");
		duplicatesInArray(arr);
		
		System.out.println("\nWITH FOR EACH LOOP : ");
		duplicatesInArrayWithForEach(arr);
	}

	private static void duplicatesInArrayWithForEach(int[] arr) {

		ArrayList<Integer> uniqueOutput = new ArrayList<>();

//		int len = 0; // unique output array length
		for(int i :  arr) {
			int flag = 0; // this flag is 1 when duplicate found in arr
			// ALTERNATE TO WHILE LOOP
			for (int k : uniqueOutput) {
				if (k == i) {
					flag = 1;
					break;
				}
			}
			if (flag != 1) {
				uniqueOutput.add(i);
//				System.out.println("AT "+len+" added " + arr[i]+ "  : "+uniqueOutput.get(len));
//				len += 1;
			}
		}
			
	

		System.out.print("UNIQUE ELEMENTS  : ");

		for (int a : uniqueOutput) {
			System.out.print(" " + a);
		}
		System.out.println();
		System.out.println("UNIQUE ELEMENTS COUNT : " + uniqueOutput.size());
	}

	public static void duplicatesInArray(int arr[]) {
		ArrayList<Integer> uniqueOutput = new ArrayList<>();

		int len = 0; // unique output array length
		int i = 0;
		while (i < arr.length) {

			int j = 0;
			int flag = 0; // this flag is 1 when duplicate found in arr
			while (j < len) {
				// check if uniqueOutput array has element as in arr[i]
				if (uniqueOutput.get(j) == arr[i]) {
					flag = 1;
					break;
				}
				j += 1;
			}

			/*
			 * // ALTERNATE TO WHILE LOOP for(int k : uniqueOutput) { if(k == arr[i] ) {
			 * flag = 1; break; } }
			 */

			if (flag != 1) {
				uniqueOutput.add(arr[i]);
//				System.out.println("AT "+len+" added " + arr[i]+ "  : "+uniqueOutput.get(len));
				len += 1;
			}
			i += 1;
		}

		System.out.print("UNIQUE ELEMENTS  : ");

		for (int a : uniqueOutput) {
			System.out.print(" " + a);
		}
		System.out.println();
		System.out.println("UNIQUE ELEMENTS COUNT : " + uniqueOutput.size());
	}
}
