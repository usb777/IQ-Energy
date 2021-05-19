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
	 page.setPage_id(page_id);
	 assertEquals(page.getPage_id(), page_id);		
	}
	
	
	//private String page_name="test page_name";
	@Test
	public void testPage_name() {
	 page.setPage_name(page_name);
	 assertEquals(page.getPage_name(), page_name);		
	}
	
	
	//private String page_title="test page_title";
	@Test
	public void testPage_title() {
		 page.setPage_title(page_title);
		 assertEquals(page.getPage_title(), page_title);		
		}
	
	
	//private String page_info="test page_info";
	@Test
	public void testPage_info() {
		 page.setPage_info(page_info);
		 assertEquals(page.getPage_info(), page_info);		
		}
	
	//private int page_order=3;
	@Test
	public void testPage_order() {
		 page.setPage_order(page_order);
		 assertEquals(page.getPage_order(), page_order);		
		}
	
	
	//private String page_group="test page_group";	
	@Test
	public void testPage_group() {
		 page.setPage_group(page_group);
		 assertEquals(page.getPage_group(), page_group);		
		}
	
	
	
	//private String template="test template";
	@Test
	public void testTemplate() {
		 page.setTemplate(template);
		 assertEquals(page.getTemplate(), template);		
		}
	
	
	
	
	
	@After
	public void tearDown() throws Exception {
		page = null;
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
}
