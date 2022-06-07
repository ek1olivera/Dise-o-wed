package com.erikakth.demoMaven1.app.data;

import java.sql.Connection;

//import java.sql.DriverManager;
import java.sql.SQLException;


import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
public class Conexion {
	//Atributos para establecer la conexion
	public static BasicDataSource dataSource=null;
	
	
	private static DataSource getDataSource() {
		if(dataSource==null) {
			dataSource= new BasicDataSource();
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			dataSource.setUsername("root");
			dataSource.setPassword("JOP1122522110");
			dataSource.setUrl("jdbc:mysql://localhost:3306/bd_administrar");
		}
		return dataSource;
		
	}
	
	public static Connection getConnection() throws SQLException {
		return getDataSource().getConnection();
		
	}
	

}
