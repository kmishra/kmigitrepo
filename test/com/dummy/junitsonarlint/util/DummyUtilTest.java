package com.dummy.junitsonarlint.util;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.annotation.meta.When;

import org.junit.Test;

public class DummyUtilTest {

	@Test
	public void testExceptionIsThrown() {
		assertThrows(IllegalArgumentException.class, () -> {
			DummyUtil dummyUtil = new DummyUtil();
			dummyUtil.getFinalAmount(1000, 5);
		});
	}

	@Test
	public void testGetFinalAmount() {

		DummyUtil dummyUtil = new DummyUtil();
		assertEquals(50, dummyUtil.getFinalAmount(500, 10));

	}
	
	@Test
	public void testGetCharCountForString() {
		
		String userName = "aUserName";

		DummyUtil dummyUtil = new DummyUtil();
		
		assertEquals(userName.length(), dummyUtil.getCharCountForString(userName));

	}

}
