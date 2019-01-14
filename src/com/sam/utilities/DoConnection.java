package com.sam.utilities;

import java.sql.Connection;
import java.sql.DriverManager;

public class DoConnection {
	private static final String USER = "root";
	private static final String PASS = "toormysql";
	private static final String URL = "jdbc:mysql://localhost:3306/sakila";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	//private static final String DRIVER = "com.mysql.jdbc.Driver"; // Deprecado en MySQL 8.x

	
	private static Connection connection;
	
	public static Connection doConnection() {
		if (connection == null) {
			try {
				Class.forName(DRIVER);				
				connection = DriverManager.getConnection(URL, USER, PASS);
			} catch (Exception e) {
				System.err.println("Error al obtener conexión");
				e.printStackTrace();
			}
		} 
		
		return connection;
	}
}
