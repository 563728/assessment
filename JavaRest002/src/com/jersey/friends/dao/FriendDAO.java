package com.jersey.friends.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class FriendDAO {
	
	
		Connection connection=null;
		Statement statement=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultset=null;
				
	
	
	public void connectToDatabase() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		DriverManager.registerDriver(new Driver());
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/friends","root","");
		statement=connection.createStatement();
		
	}
	
	public void deleteFriend(Integer id) throws SQLException
	{
		resultset=statement.executeQuery("delete from friends");
	}
	
}
