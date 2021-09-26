package com.bridgelab.logicalprograms;

import com.bridgelab.utility.Utility;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.println("Welcome to the program of Perfect number.");
		System.out.println("Enter the number to check whether the number is perfect number or not : ");
		int number = utility.getIntValue();
		utility.findPerfectNumber(number);
	}

}
