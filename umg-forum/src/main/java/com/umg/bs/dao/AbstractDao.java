package com.umg.bs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class AbstractDao {

	protected java.sql.Connection connect(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sis_recepcion","root", "root");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	protected void disconnect(Connection conn){
		try {
			if(conn!=null){
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void close(java.sql.PreparedStatement preparedStatement){
		try {
			if(preparedStatement!=null){
				preparedStatement.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void close(ResultSet resultSet){
		try {
			if(resultSet!=null){
				resultSet.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
