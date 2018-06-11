package com.dummy.junitsonarlint.util;

public class DummyUtil {

	public int getFinalAmount(int amount, int factor) {
		Long amountForBroker = null;
		Integer finalAmount = null;
		 
		try {

		} catch (Exception e) {

		}
		
		//TODO: Remove this as this is added to increase SQ issue count
		Integer.valueOf(factor).intValue();

		if (amount < 0) {
			amountForBroker = 0L;
			throw new IllegalArgumentException("Amount should not be less than 0");
		} else if (amount > 999) {
			amountForBroker = 0L;
			throw new IllegalArgumentException("Amount should be less than 1000");
		} else {			
			finalAmount = amount / factor;
		}
		finalAmount.intValue();
		
		return finalAmount;

	}

}
