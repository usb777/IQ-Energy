package com.iqenergy.DAO;

import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import com.iqenergy.model.Page;


public class PageDAO extends AbstractDAO
{
	
	/**
	 * This method gets all users from table
	 * @return
	 */
	public ArrayList<Page> getAllPages() 
	{
		ArrayList<Page> pages = new ArrayList<Page>();
		getConnection();
		
		/*
		 	private int page_id;   //1
			private String name;   //2 
			private String page_title;  //3
			private String page_info;  //4
			private int page_order;  //5
			private String template;  //6
		 */
		
		
		
		try {
			PreparedStatement ps = conn.prepareStatement("select * from pages");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Page row = new Page();
				
				
				row.setPage_id (rs.getInt(1));
				row.setPage_name (rs.getString(2));
				row.setPage_title(rs.getString(3));
				row.setPage_info(rs.getString(4));
				row.setPage_order(rs.getInt(5));
				row.setTemplate(rs.getString(6));
				
				pages.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		
		return pages;
		
	}
	
	
	
	
	
	
	
	/**
	 * This method gets  users from table by id
	 * @param id
	 * @return
	 */
	public List<Page> getPageById(int id)
	{
		List<Page> page = new ArrayList<Page>();
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("select * from pages where page_id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Page row = new Page();
				
				row.setPage_id (rs.getInt(1));
				row.setPage_name (rs.getString(2));
				row.setPage_title(rs.getString(3));
				row.setPage_info(rs.getString(4));
				row.setPage_order(rs.getInt(5));
				row.setTemplate(rs.getString(6));
				
				page.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		
		return page;
		
	}
	
	
	


	

	
	
	/**
	 * method insert Page by ID from Database
	 * @param user_id
	 * @return
	 */
	public boolean insertPageByAdmin(Page page) 
	{
		/*
	 
		private String name;   //1 
		private String page_title;  //2
		private String page_info;  //3
		private int page_order;  //4
		private String template;  //5
	 */
		
		boolean itWorked = false;
		getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("insert into pages (page_name, page_title, page_info, page_order, template ) values (?,?,?,?,?) ");
			
			ps.setString(1, page.getPage_name()  );			
			ps.setString(2, page.getPage_title()  );
			ps.setString(3, page.getPage_info()  );
			ps.setInt(4, page.getPage_order() );
			   ps.setString(5, page.getTemplate() );
			
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
	 * method update Page by ID from Database
	 * @param page_id
	 * @return
	 */
	public boolean updatePage(Page page) 
	{
		boolean isPageUpdate = false;
		/*
	 	private int page_id;   //1
		private String name;   //2 
		private String page_title;  //3
		private String page_info;  //4
		private int page_order;  //5
		private String template;  //6
	 */
		
		getConnection();
		try {
			String SQL_UPDATE = "UPDATE  pages SET "
					+ " fullName = ?, "  //1
					+ " email = ?,"      //2
					+ " userName = ?,"     //3
					+ " password = ?,"   //4
					+ " role = ?, "       //5
					+ " date_reg = ? "       //6
					+ " WHERE id =? ";   //7
			
			PreparedStatement ps = conn.prepareStatement(SQL_UPDATE);
			
			ps.setString(1, users.getFullname());			
			ps.setString(2, users.getEmail());
			ps.setString(3, users.getUsername());
			ps.setString(4, users.getPassword());
			   ps.setInt(5, users.getRole());
			  ps.setDate(6, com.iqenergy.util.DateConverter.convertFromUTILDateToSQLDate( users.getDate_reg()) );
			   
			   ps.setInt(7, users.getId() );  
			
			isPageUpdate = ps.executeUpdate() > 0 ? true : false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("SQL Error is ="+e.getMessage() ) ;
			e.printStackTrace();
		} finally 
		  {
			closeConnection();
		  }
		
		return isPageUpdate;
	}
	
	
	
	/**
	 * method delete User with ID from Database
	 * @param user_id
	 * @return
	 */
	public boolean deleteUserById(int user_id)
	{  
		boolean isUserDeleted = false;
		getConnection();
		try {
			String SQL_INSERT = " DELETE from users where id= ? ";         
			
			PreparedStatement ps = conn.prepareStatement(SQL_INSERT);
		    ps.setInt(1, user_id);
		
		
		 isUserDeleted = ps.executeUpdate() > 0 ? true : false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		
		
		return isUserDeleted;
		
	}	
	
	*/
	
}
