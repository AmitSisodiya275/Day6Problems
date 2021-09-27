package com.bridgelab.utility;

import java.util.Random;
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

	// Logic of Coupon number generator
	public void generateCoupon(int n) {
		int[] coupon = new int[n];
		int counter = 0;
		while (coupon[n - 1] == 0) {
			Random random = new Random();
			int couponNumber = random.nextInt(1000000) + 99999;
			for (int i = 0; i < coupon.length; i++) {
				if (couponNumber != coupon[i]) {
					coupon[counter] = couponNumber;
				}
			}
			counter++;
		}
		for (int a : coupon) {
			System.out.println(a);
		}
	}

	// Logic of Stop Watch simulator
	public long startWatch() {
		return System.currentTimeMillis();
	}

	public long stopWatch() {
		System.out.println("StopWatch Stoped.");
		return System.currentTimeMillis();
	}

	public void elapsedTime(long one, long two) {
		long elaps = two - one;
		System.out.println("Elapsed time is : " + elaps);
	}
}
