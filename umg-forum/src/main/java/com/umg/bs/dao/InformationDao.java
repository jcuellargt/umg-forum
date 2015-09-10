package com.umg.bs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InformationDao extends AbstractDao{
	
	public boolean existeAlumno(Long carne){
		Connection conn = connect();
		PreparedStatement createStatement = null;
		ResultSet result =null;
		try {
			createStatement = conn.prepareStatement("select alu_cod from app_alumno w where alu_carne=?");
			createStatement.setLong(1, carne);
			result = createStatement.executeQuery();
			while(result.next()){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(createStatement);
			close(result);
			disconnect(conn);
		}
		return false;
	}

}
