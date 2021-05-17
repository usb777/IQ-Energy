package com.iqenergy.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PageTest {
	
	static Page page;
	
	private int page_id=1;
	private String page_name="test page_name";
	private String page_title="test page_title";
	private String page_info="test page_info";
	private int page_order=3;
	private String page_group="test page_group";	
	private String template="test template";
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		page = new Page();
	}

	
	@Test
	public void testPage_id() {
	 page.setPage_id(1);
	 assertEquals(page.getPage_id(), page_id);		
	}
	
	/*
	private String page_name="test page_name";
	private String page_title="test page_title";
	private String page_info="test page_info";
	private int page_order=3;
	private String page_group="test page_group";	
	private String template="test template";
*/
	
	
	
	
	@After
	public void tearDown() throws Exception {
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
}
