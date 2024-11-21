package com.dass.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*problem asked in company to find doll type which not present in pairs*/
public class DollsProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while (T > 0) {
			int N = sc.nextInt();
			int i = 0;

			Map<Integer, Integer> map = new HashMap<>();
			while (i < N) {
				int num = sc.nextInt();
				map.put(num, map.getOrDefault(num, 0) + 1);
				i++;
			}

			for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
				if (entry.getValue() % 2 != 0) {
					System.out.println(entry.getKey());
				}
			}
			T--;
		}
	}
}

/*
 * 1 3 1 2 1
 * 
 * output : 2
 */
