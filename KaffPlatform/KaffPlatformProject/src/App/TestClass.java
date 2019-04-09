package App;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Query = "Select * from kaff.admin";
		String us = "Select fname from kaff.admin where adminID = 1";
		try {
			Database.openConnection();
			ResultSet resultSet = Database.getStatment().executeQuery(us);
			ResultSetMetaData metaData = resultSet.getMetaData();
			int num = metaData.getColumnCount();

			for (int i = 1; i < num; i++) {
				System.out.printf("%-8s\t", metaData.getColumnName(i));
			}

			while (resultSet.next()) {
				System.out.println(resultSet.getObject(1));
				for (int i = 1; i < num; i++) {
					System.out.printf("%-8s\t", resultSet.getObject(i));
				}
				System.out.println();
			}

			Database.closeConnection();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error...");
			e.printStackTrace();
		}
	}

}
