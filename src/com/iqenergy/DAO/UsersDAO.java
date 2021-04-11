package com.iqenergy.DAO;

import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import com.iqenergy.model.Users;


public class UsersDAO extends AbstractDAO
{
	
	/**
	 * This method gets all users from table
	 * @return
	 */
	public ArrayList<Users> getAllUsers() 
	{
		ArrayList<Users> users = new ArrayList<Users>();
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("select * from users");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Users row = new Users();
				
				
				row.setId(rs.getInt(1));
				row.setFullname(rs.getString(2));
				row.setEmail(rs.getString(3));
				row.setUsername(rs.getString(4));
				row.setPassword(rs.getString(5));
				row.setRole(rs.getInt(6));
				row.setDate_reg(rs.getDate(7));
				users.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		
		return users;
		
	}
	
	
	
	
	
	
	
	/**
	 * This method gets  users from table by id
	 * @param id
	 * @return
	 */
	public List<Users> getUsersById(int id) {
		List<Users> users = new ArrayList<Users>();
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("select * from users where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Users row = new Users();
				
				
				row.setId(rs.getInt(1));
				row.setFullname(rs.getString(2));
				row.setEmail(rs.getString(3));
				row.setUsername(rs.getString(4));
				row.setPassword(rs.getString(5));
				row.setRole(rs.getInt(6));
				row.setDate_reg(rs.getDate(7));
				users.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		
		return users;
		
	}
	
	/**
	 * This method gets  users from table by id
	 * @param id
	 * @return
	 */
	public Users getUserById(int id) 
	{
		Users user = new Users();
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("select * from users where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				Users row = new Users();
				
				
				row.setId(rs.getInt(1));
				row.setFullname(rs.getString(2));
				row.setEmail(rs.getString(3));
				row.setUsername(rs.getString(4));
				row.setPassword(rs.getString(5));
				row.setRole(rs.getInt(6));
				row.setDate_reg(rs.getDate(7));
				user = row;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		
		return user;
		
	}
	
	
	
	

	
	
	/**
	 * This method gets one user from table by login
	 * @param id
	 * @return
	 */
	public Users getUsersByUsername(String  username) 
	{
		Users user = new Users();
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("select * from users where username=?");
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				
			
				
				user.setId(rs.getInt(1));
				user.setFullname(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.setUsername(rs.getString(4));
				user.setPassword(rs.getString(5));
				user.setRole(rs.getInt(6));
				user.setDate_reg(rs.getDate(7));
				
			}
			//return user;
			
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally 
		{
			
		
			closeConnection();
		}
		
		
		return user;
		
	}
	
	
	public boolean isEmailExists(String email) 
	{ 
		int rows=0;
		getConnection();
		try
		 {
	         PreparedStatement ps = conn.prepareStatement("select * from users where email = ? ");
	         ps.setString(1, email);
				ResultSet rs = ps.executeQuery();
				rs.last(); // return to last
	         rows = rs.getRow();
	        rs.beforeFirst(); // need for result
	         
		  } catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally 
		{
				closeConnection();
		}
		
		if (rows>0)
		  {return true;}
		else 
		  {return false;}
		
		
     
	}
	
	
	public boolean isLoginExists(String login) 
	{ 
		int rows=0;
		getConnection();
		try
		 {
	         PreparedStatement ps = conn.prepareStatement("select * from users where username = ? ");
	         ps.setString(1, login);
				ResultSet rs = ps.executeQuery();
				rs.last(); // return to last
	         rows = rs.getRow();
	        rs.beforeFirst(); // need for result
	         
		  } catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally 
		{
				closeConnection();
		}
		
		if (rows>0)
		  {return true;}
		else 
		  {return false;}
		
		
     
	}
	

	/**
	 * method insert User by ID from Database
	 * @param user_id
	 * @return
	 */
	public boolean insertUser(Users users) 
	{
		boolean itWorked = false;
		getConnection();
		try {  //row.setDate_reg(rs.getDate(7));
			PreparedStatement ps = conn.prepareStatement("insert into users(fullName,Email,userName,password, role, date_reg) values (?,?,?,?,?,?)");
			
			ps.setString(1, users.getFullname());
			
			ps.setString(2, users.getEmail());
			ps.setString(3, users.getUsername());
			ps.setString(4, users.getPassword());
			//ps.setInt(5, users.getRole());
			ps.setInt(5, 4);  // always 4-user
			
			ps.setDate(6, com.iqenergy.util.DateConverter.convertFromUTILDateToSQLDate( users.getDate_reg()));
			
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
	 * method insert User by ID from Database
	 * @param user_id
	 * @return
	 */
	public boolean insertUserByAdmin(Users users) 
	{
		boolean itWorked = false;
		getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("insert into users (fullName,Email,userName,password, role, date_reg) values (?,?,?,?,?,?)");
			
			ps.setString(1, users.getFullname());
			
			ps.setString(2, users.getEmail());
			ps.setString(3, users.getUsername());
			ps.setString(4, users.getPassword());
			   ps.setInt(5, users.getRole());
			   ps.setDate(6, com.iqenergy.util.DateConverter.convertFromUTILDateToSQLDate(users.getDate_reg()) );
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
	 * method update User by ID from Database
	 * @param user_id
	 * @return
	 */
	public boolean updateUser(Users users) 
	{
		boolean isUserUpdate = false;
	
		
		getConnection();
		try {
			String SQL_UPDATE = "UPDATE  users SET "
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
			
			isUserUpdate = ps.executeUpdate() > 0 ? true : false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("SQL Error is ="+e.getMessage() ) ;
			e.printStackTrace();
		} finally 
		  {
			closeConnection();
		  }
		
		return isUserUpdate;
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
	
	
	
}
