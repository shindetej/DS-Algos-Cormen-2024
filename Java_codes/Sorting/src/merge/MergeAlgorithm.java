package merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MergeAlgorithm {
	public static void main(String[] args) {

//		System.out.print("Enter size of list : ");
//		Scanner scanner =  new Scanner(System.in);
//		int num =scanner.nextInt();
//		List<Integer> list =  getListOfIntegers(num);
//		
//		for(int i : list) {
//			System.out.print(i+", ");
//		}
//		System.out.println("");

		List<Integer> list = Arrays.asList(6, 889, 50, 90, 110, 30, 80, 100, 150, 342, 230);
		int p = list.indexOf(50);
		int q = list.indexOf(110);
		int r = list.indexOf(150);
		System.out.println("p : " + p);
		System.out.println("q : " + q);
		System.out.println("r : " + r);
		System.out.println("UNSORTED SUBLIST::: ");

		for (int n : list.subList(p, r)) {
			System.out.print(n + ", ");
		}
		System.out.println(" ");
		list = mergeAlgorithm(list, p, q, r);
		System.out.println("SORTED SUBLIST::: ");

		for (int n : list.subList(p, r)) {
			System.out.print(n + ", ");
		}
	}

	public static List<Integer> getListOfIntegers(int size) {
		List<Integer> listOfIntegers = new ArrayList<Integer>();
		int lower = 1;
		int upper = 1000;
		Random r = new Random();
		for (int i = 0; i < size; i++) {
			listOfIntegers.add(r.nextInt(upper - lower) + lower);
		}
		return listOfIntegers;
	}

	public static List<Integer> mergeAlgorithm(List<Integer> list, int p, int q, int r) {

		int N1 = q - p + 1; // [p,q] i.e both inclusive
		int N2 = r - q;
//		0,1,2,3,4,5,6,7,8,9,10
		// p = 2 ,q = 6,r= 8
		// N1 = 5
		// N2 = 2
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
//				System.out.println("IN IF");
//				System.out.println(L1.get(k1) +" <= "+ L2.get(k2) + "==> "+ (L1.get(k1) <= L2.get(k2)) );

				int num = L1.get(k1);
//				System.out.println("At index "+(p+k)+ " Insert : "+num);

				list.set(p + k, num);
				k = k + 1;
				k1 = k1 + 1;

				if (k1 == N1) {
					while (k2 < N2) {
						list.set(p + k, L2.get(k2));
//						System.out.println("At index "+(p+k)+ " Insert : "+L2.get(k2));

						k += 1;
						k2 += 1;
					}
					break;
				}
			} else {
//				System.out.println("IN ELSE");
//				System.out.println(L1.get(k1) +" <= "+ L2.get(k2) + "==> "+ (L1.get(k1) <= L2.get(k2)) );

				int index = p + k;
				int num = L2.get(k2);
//				System.out.println("At index "+index+ " Insert : "+num);

				list.set(index, num);
				k += 1;
				k2 += 1;

				if (k2 == N2) {
					while (k1 < N1) {
						list.set(p + k, L1.get(k1));
//						System.out.println("At index "+(p+k)+ " Insert : "+ L1.get(k1));
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
