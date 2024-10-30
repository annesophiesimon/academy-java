package com.bptn.course._27_jdbc_postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FeedAppClass {
	private static final String userName = "postgres";
	private static final String password = "pg123";
	private static final String dbName = "bptn";
	private static final String port = "5433";
	private static final String dbUrl = "localhost";

	public Connection createConnection() {
		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName, userName,
					password);
			System.out.println("Opened database successfully");

		} catch (SQLException e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}

		return conn;
	}

	public void addUser(Connection conn, String firstName, String lastName, String username, String phone,
			String emailId, String password, boolean emailVerified) {
		try {
			PreparedStatement stmt = null;
			String sql = "INSERT INTO \"user\" (\"firstName\", \"lastName\", \"username\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") VALUES (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, firstName);
			stmt.setString(2, lastName);
			stmt.setString(3, username);
			stmt.setString(4, phone);
			stmt.setString(5, emailId);
			stmt.setString(6, password);
			stmt.setBoolean(7, emailVerified);

			int resultCount = stmt.executeUpdate();
			System.out.println(resultCount + " record(s) inserted");
			stmt.close();

		} catch (SQLException ex) {
			// handle exception
			System.out.println("Exception:" + ex.getMessage());

		}

	}

	public void getAllUser(Connection conn) {
		try {
			PreparedStatement stmt = null;

			String sql = "SELECT * FROM \"user\"";
			stmt = conn.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.print("user ID: " + rs.getInt("userId"));
				System.out.print(", user first name : " + rs.getString("firstName"));
				System.out.print(", user last name: " + rs.getString("lastName"));
				System.out.print(", user Email: " + rs.getString("emailId"));
				System.out.println(", user Phone: " + rs.getString("phone"));
			}

			stmt.close();

		} catch (SQLException ex) {
			System.out.println("exception: " + ex.getMessage());

		}
	}

	public boolean closeConnection(Connection conn) {
		boolean flag = true;
		try {
			conn.close();

		} catch (SQLException ex) {
			flag = false;
			// handle exception
			System.out.println("Exception:" + ex.getMessage());
		}

		return flag;
	}

}
