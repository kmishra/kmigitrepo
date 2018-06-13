package com.dummy.junitsonarlint.util;

public class DummyUtil {

	public int getFinalAmount(int amount, int factor) {
		Integer finalAmount = null;

		if (amount < 0) {
			throw new IllegalArgumentException("Amount should not be less than 0");
		} else if (amount > 999) {
			throw new IllegalArgumentException("Amount should be less than 1000");
		} else {			
			finalAmount = amount / factor;
		}
		
		return finalAmount;

	}

}
