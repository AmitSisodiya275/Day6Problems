package com.bridgelab.utility;

import java.util.Scanner;

public class Utility {
	Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);
	}

	public int getIntValue() {
		return scanner.nextInt();
	}

	// Logic of the Fibonacci series
	public void getFibonacciSeries(int number) {
		int t1 = 0, t2 = 1, t3;
		System.out.print(t1 + " ");
		System.out.print(t2 + " ");
		for (int i = 0; i < number; i++) {
			t3 = t1 + t2;
			System.out.print(t3 + " ");
			t1 = t2;
			t2 = t3;
		}
	}

	// Logic of the Perfect number
	// perfect number are 6,28,496,8128.
	public void findPerfectNumber(int number) {
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		if (sum == number) {
			System.out.println(number + " is the perfect number.");
		} else
			System.out.println(number + " is not the perfect number.");
	}

	// Logic of the Prime Number
	public boolean isPrime(int n) {

		if (n <= 1)
			return false;
		else if (n == 2)
			return true;
		else if (n % 2 == 0)
			return false;

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	// Logic of Reverse a number
	public int doReverse(int n) {
		int temp = n, rev = 0, remainder;
		while (n != 0) {

			remainder = n % 10;
			n = n / 10;
			rev *= 10;
			rev += remainder;
		}

		return rev;
	}
}
