package com.iqenergy.model;

/**
 * @author MrDzen
 *
 */
public class LeftMenu 
{
	


private int menu_id;
private String menu_name;
private int parent_id;
private String link ;
private short m_status;


public short getM_status() 
{
	return m_status;
}

public void setM_status(short m_status) 
{
	this.m_status = m_status;
}


public LeftMenu ()
{ super();
}


public LeftMenu(int menu_id, String menu_name, int parent_id, String link, short m_status) {
	super();
	this.menu_id = menu_id;
	this.menu_name = menu_name;
	this.parent_id = parent_id;
	this.link = link;
	this.m_status = m_status;
}

public LeftMenu( String menu_name, int parent_id, String link, short m_status) {
	super();	
	this.menu_name = menu_name;
	this.parent_id = parent_id;
	this.link = link;
	this.m_status = m_status;
}


public int getMenu_id() {
	return menu_id;
}


public void setMenu_id(int menu_id) {
	this.menu_id = menu_id;
}


public String getMenu_name() {
	return menu_name;
}


public void setMenu_name(String menu_name) {
	this.menu_name = menu_name;
}


public int getParent_id() {
	return parent_id;
}


public void setParent_id(int parent_id) {
	this.parent_id = parent_id;
}


public String getLink() {
	return link;
}


public void setLink(String link) {
	this.link = link;
}




@Override
public String toString() {
	return "LeftMenu [menu_id=" + menu_id + ", menu_name=" + menu_name + ", parent_id=" + parent_id + ", link=" + link
			+ ", m_status=" + m_status + "]";
}














}
