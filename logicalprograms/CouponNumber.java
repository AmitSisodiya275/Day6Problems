package com.bridgelab.logicalprograms;

import com.bridgelab.utility.Utility;

public class CouponNumber {

	public static void main(String[] args) {

		Utility utility = new Utility();
		System.out.println("Welcome to Coupon Number generator.");
		System.out.println("Enter how many coupons you want : ");
		int coupon = utility.getIntValue();
		utility.generateCoupon(coupon);
	}

}
