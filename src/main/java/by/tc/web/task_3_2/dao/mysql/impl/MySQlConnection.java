package by.tc.web.task_3_2.dao.mysql.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class MySQlConnection {
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/task_3_2_db";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "root";

	private MySQlConnection() {

	}

	public static Connection getConnection() throws MySQLDAOConnectionException {
		Connection con = null;
		try {
			Class.forName(DB_DRIVER);
			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		} catch (ClassNotFoundException e) {
			throw new MySQLDAOConnectionException(e);
		} catch (SQLException e) {
			throw new MySQLDAOConnectionException(e);
		}
		return con;
	}
}
