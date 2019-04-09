package App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.RowSet;

public abstract class Database {

	private static Connection connection;
	private static Statement statement;
	ResultSet resultSet;
	RowSet rowSet;

	String[] queries = {};

	public Database() throws SQLException {

	}

	public static Connection getConnection() {
		return connection;
	}

	public static Statement getStatment() {
		return statement;
	}

	public static void openConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/kaff";
		connection = DriverManager.getConnection(url, "root", "root123");
		statement = connection.createStatement();
	}

	public static void closeConnection() throws SQLException {
		// close connection
		connection.close();
	}

	public String toString() {
		return "successful";
	}

}
