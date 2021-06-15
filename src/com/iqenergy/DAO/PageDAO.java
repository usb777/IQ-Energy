package com.iqenergy.DAO;

import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import com.iqenergy.model.Page;
import com.iqenergy.model.Users;


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
				row.setPage_group(rs.getString(6));
				row.setTemplate(rs.getString(7));
				
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
	
	
	public ArrayList<Page> getAllCompaniesPages() 
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
			PreparedStatement ps = conn.prepareStatement("select * from pages where template ='company.jsp' order by page_order ");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Page row = new Page();
				
				
				row.setPage_id (rs.getInt(1));
				row.setPage_name (rs.getString(2));
				row.setPage_title(rs.getString(3));
				row.setPage_info(rs.getString(4));
				row.setPage_order(rs.getInt(5));
				row.setPage_group(rs.getString(6));
				row.setTemplate(rs.getString(7));
				
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
	
	
	
	
	
	
	
	public ArrayList<Page> getAllProductsPages() 
	{
		ArrayList<Page> pages = new ArrayList<Page>();
		getConnection();
		
		/*
		 	private int page_id;   //1
			private String name;   //2 
			private String page_title;  //3
			private String page_info;  //4
			private int page_order;  //5
				private int page_group;  //6
			private String template;  //7
		 */
		
		
		
		try {
			PreparedStatement ps = conn.prepareStatement("select * from pages where template ='product.jsp' order by page_order ");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Page row = new Page();
				
				
				row.setPage_id (rs.getInt(1));
				row.setPage_name (rs.getString(2));
				row.setPage_title(rs.getString(3));
				row.setPage_info(rs.getString(4));
				row.setPage_order(rs.getInt(5));
				row.setPage_group(rs.getString(6));
				row.setTemplate(rs.getString(7));
				
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
 * return all icemix description
 * @return
 */
	public ArrayList<Page> getAllIcemixPages() 
	{
		ArrayList<Page> pages = new ArrayList<Page>();
		getConnection();
		
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM pages p WHERE p.`page_name` LIKE 'icemix_%' AND page_group='icemix' ORDER BY p.`page_order`");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Page row = new Page();
				
				
				row.setPage_id (rs.getInt(1));
				row.setPage_name (rs.getString(2));
				row.setPage_title(rs.getString(3));
				row.setPage_info(rs.getString(4));
				row.setPage_order(rs.getInt(5));
				row.setPage_group(rs.getString(6));
				row.setTemplate(rs.getString(7));
				
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
 * return all icemix description
 * @return
 */
	public ArrayList<Page> getAllEcobarrierPages() 
	{
		ArrayList<Page> pages = new ArrayList<Page>();
		getConnection();
		
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM pages p WHERE p.`page_name` LIKE 'ecobarrier_%' AND page_group='ecobarrier' ORDER BY p.`page_order`");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Page row = new Page();
				
				
				row.setPage_id (rs.getInt(1));
				row.setPage_name (rs.getString(2));
				row.setPage_title(rs.getString(3));
				row.setPage_info(rs.getString(4));
				row.setPage_order(rs.getInt(5));
				row.setPage_group(rs.getString(6));
				row.setTemplate(rs.getString(7));
				
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
	 * return all mxt description
	 * @return
	 */
		public ArrayList<Page> getAllMxtPages() 
		{
			ArrayList<Page> pages = new ArrayList<Page>();
			getConnection();
			
			
			try {
				PreparedStatement ps = conn.prepareStatement("SELECT * FROM pages p WHERE p.`page_name` LIKE 'mxt_%' AND page_group='mxt' ORDER BY p.`page_order`");
				
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					Page row = new Page();
					
					
					row.setPage_id (rs.getInt(1));
					row.setPage_name (rs.getString(2));
					row.setPage_title(rs.getString(3));
					row.setPage_info(rs.getString(4));
					row.setPage_order(rs.getInt(5));
					row.setPage_group(rs.getString(6));
					row.setTemplate(rs.getString(7));
					
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
	public List<Page> getPagesById(int id)
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
				row.setPage_group(rs.getString(6));
				row.setTemplate(rs.getString(7));
				
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
	 * This method gets  users from table by id
	 * @param id
	 * @return
	 */
	public Page getPageById(int id) 
	{
		Page page = new Page();
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("select * from pages where page_id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				Page row = new Page();
				
				
				row.setPage_id (rs.getInt(1));
				row.setPage_name (rs.getString(2));
				row.setPage_title(rs.getString(3));
				row.setPage_info(rs.getString(4));
				row.setPage_order(rs.getInt(5));
				row.setPage_group(rs.getString(6));				
				row.setTemplate(rs.getString(7));
				
				page = row;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		
		return page;
		
	}
	
	
	
	public Page getPageByName(String pageName) 
	{
		Page page = new Page();
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("select * from pages where page_name=?");
			ps.setString(1, pageName);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				Page row = new Page();
				
				
				row.setPage_id (rs.getInt(1));
				row.setPage_name (rs.getString(2));
				row.setPage_title(rs.getString(3));
				row.setPage_info(rs.getString(4));
				row.setPage_order(rs.getInt(5));
				row.setPage_group(rs.getString(6));				
				row.setTemplate(rs.getString(7));
				
				page = row;
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
	 * This method gets  users from table by id
	 * @param id
	 * @return
	 */
	public Page getCompanyPageById(int id) 
	{
		Page page = new Page();
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("select * from pages where template='company.jsp' and page_id=?  order by page_order");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				Page row = new Page();
				
				
				row.setPage_id (rs.getInt(1));
				row.setPage_name (rs.getString(2));
				row.setPage_title(rs.getString(3));
				row.setPage_info(rs.getString(4));
				row.setPage_order(rs.getInt(5));
				row.setPage_group(rs.getString(6));
				row.setTemplate(rs.getString(7));
				
				page = row;
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
 * product Page
 * @param id
 * @return
 */
	public Page getProductPageById(int id) 
	{
		Page page = new Page();
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("select * from pages where template='product.jsp' and page_id=?  order by page_order");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				Page row = new Page();
				
				
				row.setPage_id (rs.getInt(1));
				row.setPage_name (rs.getString(2));
				row.setPage_title(rs.getString(3));
				row.setPage_info(rs.getString(4));
				row.setPage_order(rs.getInt(5));
				row.setPage_group(rs.getString(6));
				
				row.setTemplate(rs.getString(7));
				
				page = row;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		
		return page;
		
	}
	
	
	
	
	public Page getPageByIdAndTemplate( int id, String template) 
	{
		Page page = new Page();
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("select * from pages where page_id=? and  template=? order by page_order");
			ps.setInt(1, id);
			ps.setString(2, template);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				Page row = new Page();
				
				
				row.setPage_id (rs.getInt(1));
				row.setPage_name (rs.getString(2));
				row.setPage_title(rs.getString(3));
				row.setPage_info(rs.getString(4));
				row.setPage_order(rs.getInt(5));
				row.setPage_group(rs.getString(6));
				row.setTemplate(rs.getString(7));
				
				page = row;
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
			PreparedStatement ps = conn.prepareStatement("insert into pages (page_name, page_title, page_info, page_order, page_group, template ) values (?,?,?,?,?,?) ");
			
			ps.setString(1, page.getPage_name()  );			
			ps.setString(2, page.getPage_title()  );
			ps.setString(3, page.getPage_info()  );
			ps.setInt(4, page.getPage_order() );
			ps.setString(5, page.getPage_group()  );
			   ps.setString(6, page.getTemplate() );
			
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
	 
		private String page_name;   //1 
		private String page_title;  //2
		private String page_info;  //3
		private int page_order;  //4
		private String template;  //5
	 	private int page_id;   //6
	 */
		
		getConnection();
		try {
			String SQL_UPDATE = "UPDATE pages SET "
					+ " page_name = ?, "  //1
					+ " page_title = ?,"      //2
					+ " page_info = ?,"     //3
					+ " page_order = ?,"   //4
					+ " page_group = ?,"   //5
					+ " template = ? "       //6				
					+ " WHERE page_id =? ";   //7
			
			PreparedStatement ps = conn.prepareStatement(SQL_UPDATE);
			
			ps.setString(1, page.getPage_name()  );			
			ps.setString(2, page.getPage_title() );
			ps.setString(3, page.getPage_info() );
			ps.setInt(4, page.getPage_order() );
			 
			 ps.setString(5, page.getPage_group() );	
			 
			ps.setString(6, page.getTemplate() );	
			  
			   
			   ps.setInt(7, page.getPage_id() );  
			
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
	public boolean deletePageById(int page_id)
	{  
		boolean isPageDeleted = false;
		getConnection();
		try {
			String SQL_INSERT = " DELETE from pages where page_id= ? ";         
			
			PreparedStatement ps = conn.prepareStatement(SQL_INSERT);
		    ps.setInt(1, page_id);
		
		
		 isPageDeleted = ps.executeUpdate() > 0 ? true : false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		
		
		return isPageDeleted;
		
	}	
	
	
	
}
