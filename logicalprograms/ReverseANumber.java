package com.bridgelab.logicalprograms;

import com.bridgelab.utility.Utility;

public class ReverseANumber {

	public static void main(String[] args) {

		Utility utility = new Utility();
		System.out.println("Welcome to the Program of Reverse A Number.");
		System.out.println("Enter any number to reverse : ");
		int number = utility.getIntValue();
		int revNumber = utility.doReverse(number);
		System.out.println("Entered Number : "+ number +" & Reverse Number : "+revNumber);
	}

}
