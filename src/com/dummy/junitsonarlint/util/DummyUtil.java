package com.dummy.junitsonarlint.util;

/**
 * 
 * Util class
 *
 */
public class DummyUtil {

	/**
	 * 
	 * @param amount
	 * @param factor
	 * @return finalAmount
	 */
	public int getFinalAmount(int amount, int factor) {
		Integer finalAmount = null;

		//Validate amount
		if (amount < 0) {
			throw new IllegalArgumentException("Amount should not be less than 0");
		} else if (amount > 999) {
			throw new IllegalArgumentException("Amount should be less than 1000");
		} else {			
			finalAmount = amount / factor;
		}
		
		return finalAmount;

	}
	
	/**
	 * get ID with input param UserName
	 * @param userName
	 * @return Long type 
	 */
	public Long getIdbyUserName(String userName) {
		return Long.valueOf(userName);
	}

}
