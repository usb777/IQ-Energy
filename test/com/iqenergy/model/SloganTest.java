package com.iqenergy.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SloganTest {
	
	static Slogan sloganObj;
	
	private int id=500;	
	private String slogan="Hello World!";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}


	@Before
	public void setUp() throws Exception {
		sloganObj = new Slogan();
	}

	

	

	@Test
	public void testSloganSetterAnnGetter() {		
 		sloganObj.setSlogan(slogan);
		assertEquals(sloganObj.getSlogan(), slogan);	
	}

	

	@Test
	public void testIdSetterAnnGetter() {
		sloganObj.setId(id);
		assertEquals(sloganObj.getId(), id);	
	}

	

	
	@Test
	public void testEqualsObject() {
	
	}
	
	@Test
	public void testHashCode() {
		
	}

	@Test
	public void testToString() {
		
	}
	
	
	@After
	public void tearDown() throws Exception {
		sloganObj= null;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
