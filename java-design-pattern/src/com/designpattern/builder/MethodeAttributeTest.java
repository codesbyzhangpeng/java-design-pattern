package com.designpattern.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MethodeAttributeTest {
	
	@Test
	public void roofNullableTest() {
		House house = new House();
		house.setRoofOfHouse("root eecute...");
		
		String roofValue = house.getRoofOfHouse();
		String expectedValue = "root eecute...";
		assertEquals(expectedValue, roofValue);		
	}

}
