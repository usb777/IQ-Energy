package com.iqenergy.DAO;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import com.iqenergy.model.Slogan;


public class SloganDAO extends AbstractDAO
{
	
	/**
	 * This method gets all users from table
	 * @return
	 */
	public List<Slogan> getAllSlogans() 
	{
		List<Slogan> slogans = new ArrayList<Slogan>();
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM slogan ORDER BY id");			
			ResultSet rs = ps.executeQuery();			
			
			
				Slogan row = new Slogan();
			 
			while(rs.next()) {
			
				row.setId(rs.getInt(1));
				row.setSlogan(rs.getString(2));
				
				
				slogans .add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		
		return slogans ;
		
	}
	

	
	
	/**
	 * This method gets  menu from table by id
	 * @param id
	 * @return
	 */
	public Slogan getSloganById(int id) 
	{
		Slogan slogan = new Slogan();
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM slogan where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			Slogan row = new Slogan();
			
			while(rs.next()) 
			{
				
				
				row.setId(rs.getInt(1));
				row.setSlogan(rs.getString(2));
				
				slogan = row;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		
		return slogan;
		
	}
	
	

	/**
	 * method insert User by ID from Database
	 * @param user_id
	 * @return
	 */
	public boolean insertSlogan(Slogan slogan) 
	{		
		
		boolean itWorked = false;
		getConnection();
		try {  //row.setDate_reg(rs.getDate(7));
			PreparedStatement ps = conn.prepareStatement("insert into slogan (id, slogan ) values (? , ? )");
			
						
			ps.setInt(1, slogan.getId());			
			   ps.setString(2, slogan.getSlogan());
		
		 	 
		 	
		    
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
	public boolean updateSlogan(Slogan slogan) 
	{
		
		
		boolean isSloganUpdate = false;
		getConnection();
		try {
			String SQL_UPDATE = " UPDATE  slogan SET "
					+ " slogan = ? "     //1
					+ " WHERE id =? ";  //2
			
			PreparedStatement ps = conn.prepareStatement(SQL_UPDATE);
			
			ps.setString(1, slogan.getSlogan());			
			ps.setInt( 2, slogan.getId() );
			
			
		//	ps.executeQuery("SET NAMES 'UTF8'");
		 //   ps.executeQuery("SET CHARACTER SET 'UTF8'");
			
			isSloganUpdate = ps.executeUpdate() > 0 ? true : false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//System.out.println('SQL = ' +);
			e.printStackTrace();
		} finally 
		  {
			closeConnection();
		  }
		
		return isSloganUpdate;
	}
	
	
	
	/**
	 * method delete Menu with ID from Database
	 * @param menu_id
	 * @return
	 */
	public boolean deleteSloganById(int id)
	{  
		boolean isMenuDeleted = false;
		getConnection();
		try 
		{
			String SQL_INSERT = " DELETE from slogan where id= ? ";         
			
			PreparedStatement ps = conn.prepareStatement(SQL_INSERT);
		    ps.setInt(1, id);
		 isMenuDeleted = ps.executeUpdate() > 0 ? true : false;
		} 
		catch (SQLException e) 
		{e.printStackTrace();} 
		finally
		{	closeConnection();	}
		
		
		return isMenuDeleted;
		
	}	
	
	
	
}
