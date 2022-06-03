package com.erikakth.demoMaven1.app.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	//Atributos para establecer la conexion
	private String db="bd_administrar";
	private Connection cnx= null;
	private String usuario="root";
	private String password="JOP1122522110";
	private String url = "jdbc:mysql://localhost:3306/"+db;
	//constructor por defecto
	public Conexion() {
		
	}
	// contructor sobre cargado
	
	public Connection getConnection () throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		cnx= DriverManager.getConnection(url, usuario, password);
		return cnx;
	}
	public Conexion(String db, Connection cnx, String usuario, String password, String url) {
		super();
		this.db = db;
		this.cnx = cnx;
		this.usuario = usuario;
		this.password = password;
		this.url = url;
	}
	
	

}
