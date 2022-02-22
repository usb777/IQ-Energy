package com.iqenergy.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MenuTest {
	
	static Menu menu;
	 private int menu_id ;
	 private String menu_name;
	 private int page_id;
	 private int  parent_id;
	 private int menu_status;
	 private int menu_level;
	 private String menu_group;
	 private int menu_head;
     private String page_group;
    

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	

	@Before
	public void setUp() throws Exception {
		menu = new Menu();
	}

	

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@After
	public void tearDown() throws Exception {
		menu = null;
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

}
