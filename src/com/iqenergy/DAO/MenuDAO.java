package com.iqenergy.DAO;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import com.iqenergy.model.Menu;


public class MenuDAO extends AbstractDAO
{
	
	/**
	 * This method gets all users from table
	 * @return
	 */
	public List<Menu> getAllMenus() 
	{
		List<Menu> menus = new ArrayList<Menu>();
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM menu ORDER BY menu_id");			
			ResultSet rs = ps.executeQuery();			
			/*
				private int menu_id ;            //1
	 			private String menu_name;        //2
	 			private int page_id;             //3 
	 			private int  parent_id;          //4
	 			private int menu_status;         //5
	 			private int menu_level;          //6
	 			private int menu_group;          //7
	 			private int menu_head;           //8
			 */
			
			while(rs.next()) {
				Menu row = new Menu();
				
				row.setMenu_id(rs.getInt(1));
				row.setMenu_name(rs.getString(2));
				row.setPage_id(rs.getInt(3));					
				row.setParent_id(rs.getInt(4));
				row.setMenu_status(rs.getInt(5));
				row.setMenu_level(rs.getInt(6));
				row.setMenu_group(rs.getString(7));
				row.setMenu_head(rs.getInt(8));
				
				menus.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return menus;
	}
	
	
	
	/**
	 * This method gets all users from table
	 * @return
	 */
	public List<Menu> getMenuByGroup(String menu_group) 
	{
		List<Menu> menus = new ArrayList<Menu>();
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement(" SELECT * FROM menu where menu_group=? ORDER BY menu_id ");			
			ps.setString(1, menu_group); // parameter before execution
			
			ResultSet rs = ps.executeQuery();	
		
		
			
			while(rs.next()) {
				Menu row = new Menu();
				
				row.setMenu_id(rs.getInt(1));
				row.setMenu_name(rs.getString(2));
				row.setPage_id(rs.getInt(3));					
				row.setParent_id(rs.getInt(4));
				row.setMenu_status(rs.getInt(5));
				row.setMenu_level(rs.getInt(6));
				row.setMenu_group(rs.getString(7));
				row.setMenu_head(rs.getInt(8));
				
				menus.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return menus;
	}
	
	
	public List<Menu> getMenuByGroup1(String menu_group) 
	{
		List<Menu> menus = new ArrayList<Menu>();
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT m.`menu_id`, m.`menu_name`,m.`page_id`, p.`page_group` AS page_group FROM menu m "  
+" JOIN pages p  ON m.`page_id` = p.`page_id`  WHERE m.menu_group=? AND m.`menu_status`=1 ORDER BY m.menu_id ");			
			ps.setString(1, menu_group); // parameter before execution
			
			ResultSet rs = ps.executeQuery();	
		
		
			
			while(rs.next()) {
				Menu row = new Menu();
				
				row.setMenu_id(rs.getInt(1));
				row.setMenu_name(rs.getString(2));
				row.setPage_id(rs.getInt(3));
				row.setPage_group(rs.getString(4));
				/*
				row.setParent_id(rs.getInt(4));
				row.setMenu_status(rs.getInt(5));
				row.setMenu_level(rs.getInt(6));
				row.setMenu_group(rs.getString(7));
				row.setMenu_head(rs.getInt(8));
				*/
				
				
				menus.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return menus;
	}
	
	
	

	
	
	/**
	 * This method gets  menu from table by id
	 * @param id
	 * @return
	 */
	public Menu getMenuById(int id) 
	{
		Menu menu = new Menu();
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM menu where menu_id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				Menu row = new Menu();
				
				
				row.setMenu_id(rs.getInt(1));
				row.setMenu_name(rs.getString(2));
				row.setPage_id(rs.getInt(3));					
				row.setParent_id(rs.getInt(4));
				row.setMenu_status(rs.getInt(5));
				row.setMenu_level(rs.getInt(6));
				row.setMenu_group(rs.getString(7));
				row.setMenu_head(rs.getInt(8));
				
				menu= row;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		
		return menu;
		
	}
	
	

	/**
	 * method insert User by ID from Database
	 * @param user_id
	 * @return
	 */
	public boolean insertMenuItem(Menu menu) 
	{		
		
		/*
		
			private String menu_name;        //1
			private int page_id;             //2 
			private int  parent_id;          //3
			private int menu_status;         //4
			private int menu_level;          //5
			private int menu_group;          //6
			private int menu_head;           //7
	 */
	
		
		boolean itWorked = false;
		getConnection();
		try {  //row.setDate_reg(rs.getDate(7));
			PreparedStatement ps = conn.prepareStatement("insert into menu_left (menu_name, page_id, parent_id, menu_status,  menu_level, menu_group, menu_head ) "
					+ " values (?,?,?,?,?,?,?) ");
			
						
	  	 ps.setString(1, menu.getMenu_name());	
			ps.setInt(2, menu.getPage_id());
			ps.setInt(3, menu.getParent_id());
			ps.setInt(4, menu.getMenu_status() );
		 	ps.setInt (5, menu.getMenu_level() );
		 	ps.setString(6,menu.getMenu_group() );
		 	ps.setInt(7, menu.getMenu_head() );
		 	 
		 	
		    
			itWorked = ps.executeUpdate() > 0 ? true : false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally 
		  {
			closeConnection();
		  }
		
		return itWorked;
	}
	
	

	
	/**
	 * method update Menu Item by ID from Database
	 * @param user_id
	 * @return
	 */
	public boolean updateMenu(Menu menu) 
	{
		/*
		
			private String menu_name;        //1
			private int page_id;             //2 
			private int  parent_id;          //3			
			private int menu_status;         //4
			private int menu_level;          //5
			private int menu_group;          //6
			private int menu_head;           //7
			private int menu_id ;            //8
	 */
	
		
		boolean isMenuUpdate = false;
		getConnection();
		try {
			String SQL_UPDATE = " UPDATE  menu_left SET "
					+ " menu_name = ?, "         //1
					+ " page_id = ?, "           //2
					+ " parent_id = ?,"          //3
					+ " menu_status = ?, "       //4
					+ " menu_level = ?, "        //5	
					+ " menu_group = ?, "        //6	
					+ " menu_head = ? "          //7	
					+ " WHERE menu_id =? ";      //8
			
			PreparedStatement ps = conn.prepareStatement(SQL_UPDATE);
			
			ps.setString(1, menu.getMenu_name());	  //1
			ps.setInt(2, menu.getPage_id() );         //2
			ps.setInt(3, menu.getParent_id());        //3
			ps.setInt(4, menu.getMenu_status() );     //4
			ps.setInt(5, menu.getMenu_level() );      //5
			ps.setString(6, menu.getMenu_group() );      //6
			ps.setInt(7, menu.getMenu_head() );       //7
			ps.setInt(8, menu.getMenu_id());          //8
			
		//	ps.executeQuery("SET NAMES 'UTF8'");
		 //   ps.executeQuery("SET CHARACTER SET 'UTF8'");
			
			isMenuUpdate = ps.executeUpdate() > 0 ? true : false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//System.out.println('SQL = ' +);
			e.printStackTrace();
		} finally 
		  {
			closeConnection();
		  }
		
		return isMenuUpdate;
	}
	
	
	
	/**
	 * method delete Menu with ID from Database
	 * @param menu_id
	 * @return
	 */
	public boolean deleteMenuItemById(int menu_id)
	{  
		boolean isMenuDeleted = false;
		getConnection();
		try 
		{
			String SQL_INSERT = " DELETE from menu where menu_id= ? ";         
			
			PreparedStatement ps = conn.prepareStatement(SQL_INSERT);
		    ps.setInt(1, menu_id);
		 isMenuDeleted = ps.executeUpdate() > 0 ? true : false;
		} 
		catch (SQLException e) 
		{e.printStackTrace();} 
		finally
		{	closeConnection();	}
		
		
		return isMenuDeleted;
		
	}	
	
	
	
}
