package com.iqenergy.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RoleTest {
	
	static Role role;
	
	private int id = 1;
	private String name="user";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		role = new Role();
	}

	

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testId() {
		role.setId(id);
		assertEquals(role.getId(), id);		
	}
	
	@Test
	public void testNameRole() {
		role.setName(name);
		assertEquals(role.getName(), name);	
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		role = null;
	}
	

}
