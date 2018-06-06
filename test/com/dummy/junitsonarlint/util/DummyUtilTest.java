package com.dummy.junitsonarlint.util;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

}
