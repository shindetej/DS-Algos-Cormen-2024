package tejas.practice.recursion;

import java.util.Scanner;

public class sumOfDigitsUsingRecursion {
	public static void main(String[] args) {
		System.out.println("ENTER NUMBER (POSITIVE):");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("SUM OF DIGIT ::::>  " + num + " :::::> " + sumOfDigitsInNumber(num));
		System.out.println("SUM OF DIGIT ITERATIVE ::::>  " + num + " :::::> " + sumOfDigitsInNumberIterative(num));
	}

	private static int sumOfDigitsInNumber(int num) {
		if (num == 0)
			return 0;

		return num % 10 + sumOfDigitsInNumber(num / 10);
	}

	private static int sumOfDigitsInNumberIterative(int num) {
		int sum = 0;
		while(num != 0) {
			sum+=num%10;
			num = num/10;
		}
	// for loop conversion	
//		for (; num != 0; num = num / 10) {
//	    sum += num % 10;
//	}
		return sum;
		
		
	}

}
