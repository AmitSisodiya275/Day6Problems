package com.bridgelab.logicalprograms;

import com.bridgelab.utility.Utility;

public class PrimeNumber {

	public static void main(String[] args) {

		Utility utility = new Utility();
		System.out.println("Welcome to the program of Prime Number.");
		System.out.println("Enter any number to check whether it is prime or not : ");
		int number = utility.getIntValue();
		boolean prime = utility.isPrime(number);
		if (prime) {
			System.out.println("Number "+number+ " is Prime Number.");
		} else 
			System.out.println("Number "+number+ " is not a Prime Number ");

	}

}
