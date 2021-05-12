package com.iqenergy.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class BcryptingTest {

	static Bcrypting bcrypting;
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		bcrypting = new Bcrypting();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}



	@Test
	public void testBcrypting() {
	//	fail("Not yet implemented");
	}

	@Test
	public void testHash() {
		
	//	String password = "xxx";		
	//	assertEquals( "$2a$10$rqvGGwbXQ14gLS0GdhgJm.9G0vTydbPAs3rB2hswT3Djo.DrMfMmu" , bcrypting.hash(password) );
	}

	@Test
	public void testVerifyHash()
	
	{
		
		String password = "xxx";
		assertTrue(bcrypting.verifyHash(password, "$2a$10$LhDyF4soHOQsjFubwsYtgOxlZ3xU81ln3t5kFnh7mxOD0AAk7j2TO"));
	//	assertEquals( password , bcrypting.verifyHash(password, "$2a$10$UUBhgjsl30y/GOJs0FTzOePf7hyAUPuiGf2M3ytJtOro1/Mq1jbq6") );
		
		
	}
	
	
	@After
	public void tearDown() throws Exception {
	}
	
	
	
	

}
