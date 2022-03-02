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
    private String link = "Test link";
    private short m_status = 0;

    @Before
    public void setUp() throws Exception {
        leftMenu = new LeftMenu();
    }

    @Test
    public void testGetterAndSetter() {

        leftMenu.setMenu_id(menu_id);
        assertEquals(menu_id, leftMenu.getMenu_id());
        leftMenu.setMenu_name(menu_name);
        Assert.assertEquals(menu_name, leftMenu.getMenu_name());
        leftMenu.setParent_id(100);
        assertEquals(100, leftMenu.getParent_id());

        leftMenu.setLink("Link");
        assertEquals("Link", leftMenu.getLink());
        leftMenu.setM_status(m_status);
        assertEquals(m_status, leftMenu.getM_status());

    }

    @Test
    public void testConstructors()
    {
        leftMenu = new   LeftMenu( 5, "menu 5", 5,  "link 5",  m_status);

        assertEquals(5, leftMenu.getMenu_id());
        assertEquals("menu 5", leftMenu.getMenu_name());
        assertEquals(5, leftMenu.getParent_id());
        assertEquals("link 5", leftMenu.getLink());
        assertEquals(m_status, leftMenu.getM_status());

        leftMenu = new   LeftMenu(  "menu 6", 6,  "link 6",  m_status);
        assertEquals("menu 6", leftMenu.getMenu_name());
        assertEquals(6, leftMenu.getParent_id());
        assertEquals("link 6", leftMenu.getLink());
        assertEquals(m_status, leftMenu.getM_status());
    }

    @Test
    public void testToString()
    {  leftMenu = new   LeftMenu( 5, "menu 5", 5,  "link 5",  m_status);
        assertEquals("LeftMenu [menu_id=5, menu_name=menu 5, parent_id=5, link=link 5, m_status=0]", leftMenu.toString());
    }



    @After
    public void tearDown() throws Exception {
        leftMenu = null;
    }
}