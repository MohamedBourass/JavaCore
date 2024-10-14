package com.mbo.ch10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SetUpDerbyDB {

	public static void main(String[] args) {
		String url = "jdbc:derby:zoo; create=true";
		try(Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement()) {
			
			stmt.executeUpdate("DROP TABLE species");
			stmt.executeUpdate("DROP TABLE animal");
			
			stmt.executeUpdate(""
					+ "CREATE TABLE species ("
					+ "id INTEGER PRIMARY KEY, "
					+ "name VARCHAR(255), "
					+ "nume_acres DECIMAL)");
			stmt.executeUpdate(""
					+ "CREATE TABLE animal ("
					+ "id INTEGER PRIMARY KEY, "
					+ "species_id INTEGER, "
					+ "name VARCHAR(255))");
			stmt.executeUpdate("INSERT INTO species VALUES (1, 'African Elephant', 7.5)");
			stmt.executeUpdate("INSERT INTO species VALUES (2, 'Zebra', 1.2)");
			
			stmt.executeUpdate("INSERT INTO animal VALUES (1, 1, 'Elsa')");
			stmt.executeUpdate("INSERT INTO animal VALUES (2, 2, 'Zelda')");
			stmt.executeUpdate("INSERT INTO animal VALUES (3, 1, 'Ester')");
			stmt.executeUpdate("INSERT INTO animal VALUES (4, 1, 'Eddie')");
			stmt.executeUpdate("INSERT INTO animal VALUES (5, 2, 'Zoe')");
			
			ResultSet rs = stmt.executeQuery(
					"SELECT a.id, a.name,  s.name "
					+ "FROM animal a "
					+ "JOIN species s ON species_id = s.id");
			
			while(rs.next())
				System.out.println(rs.getString(1) + " - " +  rs.getString(2) + " - " + rs.getString(3));
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getSQLState());
			System.out.println(e.getErrorCode());
		}

	}

}
