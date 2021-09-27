package com.bridgelab.logicalprograms;

import com.bridgelab.utility.Utility;

public class StopWatch {

	public static void main(String[] args) {

		Utility utility = new Utility();
		System.out.println("Welcome to stop watch.");
		long start = utility.startWatch();
		System.out.println("StopWatch has Started, press 1 to stop : ");
		int num = utility.getIntValue();
		if (num == 1) {
			long stop = utility.stopWatch();
			utility.elapsedTime(start, stop);
		} else
			System.out.println("Enter only 1 to stop the Watch.");
		num = utility.getIntValue();
	}
}
