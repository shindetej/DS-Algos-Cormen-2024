package tejas.practice.other;

import java.util.Scanner;

public class PrimeNumberChecking {
	public static void main(String[] args) {
		System.out.println("::::::::::  PRIME NUMBER CODE ::::::::");

		System.out.println("Enter positive number : ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();

			System.out.println("WITHOUT BRUTEFORCE CHECKS TILL number :::>"
					+ (isPrimeCheck(num) ? "ENTERED NUMBER IS PRIME" : "ENTERED NUMBER NOT PRIME"));
			System.out.println("WITHOUT BRUTEFORCE CHECKS  :::> "
					+ (isPrimeCheckUpdated(num) ? "ENTERED NUMBER IS PRIME" : "ENTERED NUMBER NOT PRIME"));
			int i = 0;

			System.out.println("\n::::::::::  FIBONACCI CODE ::::::::");
			System.out.println(fibonacci(num) + " IS FIBONACCI VALUE OF " + num + " AND SEQUENCE IS BELOW: ");
			while (i <= num) {
				System.out.print(fibonacci(i) + " ,");
				i++;
			}
		}

	}

	public static boolean isPrimeCheckUpdated(int num) {

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				System.out.println("DIVISIBLE BY :" + i);
				return false;
			}
		}
		return true;
	}

	public static boolean isPrimeCheck(int num) {

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("DIVISIBLE BY :" + i);
				return false;
			}
		}
		return true;
	}

	public static int fibonacci(int num) {
		if (num == 0)
			return 0;
		if (num == 1) {
			return 1;
		}

		return fibonacci(num - 2) + fibonacci(num - 1);

	}
}
