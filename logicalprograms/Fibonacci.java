package com.bridgelab.logicalprograms;

import com.bridgelab.utility.Utility;

public class Fibonacci {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.println("Welcome to the program of Fibonacci series.");
		System.out.println("Enter how many numbers you want in the above series : ");
		int number = utility.getIntValue();
		utility.getFibonacciSeries(number);
	}

}
