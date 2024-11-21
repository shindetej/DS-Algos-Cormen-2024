package tejas.practice.recursion;

import java.util.Scanner;

public class fibonacciExample {

	public static void main(String[] args) {
		System.out.println("Enter fibonacci sequence number :" );
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println("START : ");
		for(int i = 0;i<=n;i++)
			System.out.print(fibonacci(i)+ ", " );
		System.out.println("");
		System.out.println("END :");
	}

	public static int fibonacci(int data) {
		if(data == 0)
			return 0;
		if(data == 1)
			return 1;
		
		return fibonacci(data-1) + fibonacci(data-2) ;
	}
	
}

/*
 * 
 * If n is 0, return 0. If n is 1, return 1. Otherwise, calculate the Fibonacci
 * number by recursively finding the Fibonacci values of (n - 1) and (n - 2) and
 * summing them.
 */
