package com.iqenergy.model;

public class Menu
{
	 private int menu_id ;   //1
	 private String menu_name; //2
	 private int page_id;  //3
	 private int  parent_id; //4
	 private int menu_status;  //5
	 private int menu_level;  //6
	 private String menu_group;  //7
	 private int menu_head;  //8
    private String page_group;  //9
     
	 
    
    
   

	public Menu()
	{
		super();
	}


	/*
	 * Constructor
	 */
	public Menu(int menu_id, String menu_name, int page_id, int parent_id, int menu_status, int menu_level,	String menu_group, int menu_head,String page_group) 
	{
		super();
		this.menu_id = menu_id;
		this.menu_name = menu_name;
		this.page_id = page_id;
		this.parent_id = parent_id;
		this.menu_status = menu_status;
		this.menu_level = menu_level;
		this.menu_group = menu_group;
		this.menu_head = menu_head;
		this.page_group = page_group;
	}
	
	/*
	 * Constructor
	 */
	public Menu( String menu_name, int page_id, int parent_id, int menu_status, int menu_level,	String menu_group, int menu_head,String page_group)
	{
		super();
		
		this.menu_name = menu_name;
		this.page_id = page_id;
		this.parent_id = parent_id;
		this.menu_status = menu_status;
		this.menu_level = menu_level;
		this.menu_group = menu_group;
		this.menu_head = menu_head;
		this.page_group = page_group;
	}

	
	public Menu( String menu_name, int page_id, int parent_id, int menu_status, int menu_level,	String menu_group, int menu_head)
	{
		super();
		
		this.menu_name = menu_name;
		this.page_id = page_id;
		this.parent_id = parent_id;
		this.menu_status = menu_status;
		this.menu_level = menu_level;
		this.menu_group = menu_group;
		this.menu_head = menu_head;
	
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


	public int getPage_id() {
		return page_id;
	}


	public void setPage_id(int page_id) {
		this.page_id = page_id;
	}


	public int getParent_id() {
		return parent_id;
	}


	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}


	public int getMenu_status() {
		return menu_status;
	}


	public void setMenu_status(int menu_status) {
		this.menu_status = menu_status;
	}


	public int getMenu_level() {
		return menu_level;
	}


	public void setMenu_level(int menu_level) {
		this.menu_level = menu_level;
	}


	public String getMenu_group() 
	{
		return menu_group;
	}


	public void setMenu_group(String menu_group) {
		this.menu_group = menu_group;
	}


	public int getMenu_head() {
		return menu_head;
	}


	public void setMenu_head(int menu_head) {
		this.menu_head = menu_head;
	}


	 
		public String getPage_group() {
			return page_group;
		}


		public void setPage_group(String page_group) {
			this.page_group = page_group;
		}

	
	
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((menu_group == null) ? 0 : menu_group.hashCode());
		result = prime * result + menu_head;
		result = prime * result + menu_id;
		result = prime * result + menu_level;
		result = prime * result + ((menu_name == null) ? 0 : menu_name.hashCode());
		result = prime * result + menu_status;
		result = prime * result + page_id;
		result = prime * result + parent_id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		if (menu_group == null) {
			if (other.menu_group != null)
				return false;
		} else if (!menu_group.equals(other.menu_group))
			return false;
		if (menu_head != other.menu_head)
			return false;
		if (menu_id != other.menu_id)
			return false;
		if (menu_level != other.menu_level)
			return false;
		if (menu_name == null) {
			if (other.menu_name != null)
				return false;
		} else if (!menu_name.equals(other.menu_name))
			return false;
		if (menu_status != other.menu_status)
			return false;
		if (page_id != other.page_id)
			return false;
		if (parent_id != other.parent_id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Menu [menu_id=" + menu_id + ", menu_name=" + menu_name + ", page_id=" + page_id + ", parent_id="
				+ parent_id + ", menu_status=" + menu_status + ", menu_level=" + menu_level + ", menu_group="
				+ menu_group + ", menu_head=" + menu_head + "]";
	}
	
	
	
	
	
	 
	 
	 
	 
     
}
