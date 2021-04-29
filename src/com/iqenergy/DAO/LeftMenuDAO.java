package com.iqenergy.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.iqenergy.model.LeftMenu;

public class LeftMenuDAO extends AbstractDAO
{
	
	/**
	 * This method gets all users from table
	 * @return
	 */
	public ArrayList<LeftMenu> getAllMenus() 
	{
		ArrayList<LeftMenu> menus = new ArrayList<LeftMenu>();
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM menu_left ORDER BY menu_id");			
			ResultSet rs = ps.executeQuery();			
			/*
				private int menu_id;               //1
				private String menu_name;          //2
				private int parent_id;             //3
				private String link ;              //4
				private short status;              //5
			 */
			
			while(rs.next()) {
				LeftMenu row = new LeftMenu();
				
				
				row.setMenu_id(rs.getInt(1));
				row.setMenu_name(rs.getString(2));
				row.setParent_id(rs.getInt(3));							
				row.setLink(rs.getString(4));
				row.setM_status (rs.getShort(5));	
				
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
	public LeftMenu getMenuById(int id) 
	{
		LeftMenu menu = new LeftMenu();
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM menu_left where menu_id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				LeftMenu row = new LeftMenu();
				
				row.setMenu_id(rs.getInt(1));
				row.setMenu_name(rs.getString(2));
				row.setParent_id(rs.getInt(3));							
				row.setLink(rs.getString(4));
				row.setM_status(rs.getShort(5));	
				
				
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
	public boolean insertMenuItem(LeftMenu menu) 
	{		
		
		boolean itWorked = false;
		getConnection();
		try {  //row.setDate_reg(rs.getDate(7));
			PreparedStatement ps = conn.prepareStatement("insert into menu_left (menu_name, parent_id, link, m_status ) values (?,?,?,?)");
			
						
			ps.setString(1, menu.getMenu_name());			
			   ps.setInt(2, menu.getParent_id());
			ps.setString(3, menu.getLink() );
		 	 ps.setShort(4, menu.getM_status() );
		 	 
		 	
		    
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
	public boolean updateMenu(LeftMenu menu) 
	{
		
		
		boolean isMenuUpdate = false;
		getConnection();
		try {
			String SQL_UPDATE = " UPDATE  menu_left SET "
					+ " menu_name = ?, "     //1
					+ " parent_id = ?,"      //2
					+ " link = ?,"           //3
					+ " m_status = ?"         //4							
					+ " WHERE menu_id =? ";  //5
			
			PreparedStatement ps = conn.prepareStatement(SQL_UPDATE);
			
			ps.setString(1, menu.getMenu_name());			
			ps.setInt(2, menu.getParent_id());
			ps.setString(3, menu.getLink());
			ps.setShort(4, menu.getM_status() );
			ps.setInt(5, menu.getMenu_id() );  
			
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
			String SQL_INSERT = " DELETE from menu_left where menu_id= ? ";         
			
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
