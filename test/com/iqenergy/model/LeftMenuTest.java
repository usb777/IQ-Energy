package com.iqenergy.model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeftMenuTest {

    private LeftMenu leftMenu = null;

    private int menu_id = 5;
    private String menu_name = "Test menu name";
    private int parent_id = 6;
    private String link ="Test link";
    private short m_status = 0;

    @Before
    public void setUp() throws Exception {
        leftMenu = new LeftMenu();
    }

    @Test
    public void testGetterAndSetter()
    {
        leftMenu.setM_status(m_status);
        Assert.assertEquals(m_status, leftMenu.getM_status());

    }


    @After
    public void tearDown() throws Exception {
        leftMenu = null;
    }
}