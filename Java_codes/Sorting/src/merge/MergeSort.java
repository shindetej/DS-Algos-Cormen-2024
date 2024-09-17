package merge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {

		System.out.print("Enter size of list : ");
		try (Scanner scanner = new Scanner(System.in)) {
			int num = scanner.nextInt();
			
			List<Integer> list = getListOfIntegers(num);
			
			int p = 0;
			int r = list.size() - 1;

			System.out.println("UNSORTED LIST::: ");

			for (int n : list) {
				System.out.print(n + ", ");
			}
			
			list = mergeSort(list, p, r);
			
			System.out.println("\nSORTED SUBLIST::: ");

			for (int n : list) {
				System.out.print(n + ", ");
			}
		} catch (Exception e) {
			
			System.out.println("An error occurred: " + e.getMessage());
		}

	}

	public static List<Integer> getListOfIntegers(int size) {
		List<Integer> listOfIntegers = new ArrayList<Integer>();
		int lower = 1;
		int upper = 100;
		Random r = new Random();
		for (int i = 0; i < size; i++) {
			listOfIntegers.add(r.nextInt(upper - lower) + lower);
		}
		return listOfIntegers;
	}

	private static List<Integer> mergeSort(List<Integer> list, int p, int r) {

		if (p < r) {

			int q = (p + r) / 2;

			mergeSort(list, p, q);
			mergeSort(list, q + 1, r);
			mergeAlgorithm(list, p, q, r);
		}
		return list;
	}

	public static List<Integer> mergeAlgorithm(List<Integer> list, int p, int q, int r) {

		int N1 = q - p + 1; // [p,q] i.e both inclusive
		int N2 = r - q;
		List<Integer> L1 = new ArrayList<>();
		List<Integer> L2 = new ArrayList<>();
		for (int i = 0; i < N1; i++) {
			L1.add(list.get(p + i));
		}

		for (int i = 0; i < N2; i++) {
			L2.add(list.get(q + 1 + i));
		}

		int k = 0;
		int k1 = 0;
		int k2 = 0;

		while (true) {
			if (L1.get(k1) <= L2.get(k2)) {
				int num = L1.get(k1);
				list.set(p + k, num);
				k = k + 1;
				k1 = k1 + 1;

				if (k1 == N1) {
					while (k2 < N2) {
						list.set(p + k, L2.get(k2));
						k += 1;
						k2 += 1;
					}
					break;
				}
			} else {
				int index = p + k;
				int num = L2.get(k2);
				list.set(index, num);
				k += 1;
				k2 += 1;

				if (k2 == N2) {
					while (k1 < N1) {
						list.set(p + k, L1.get(k1));
						k += 1;
						k1 += 1;
					}
					break;
				}
			}
		}

		return list;
	}

}
