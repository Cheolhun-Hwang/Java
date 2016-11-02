package Mysql_Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			Connection con = null;
			con = DriverManager.getConnection("jdbc:mysql://localhost",
					"hch", "hch");
			java.sql.Statement st = null;
			ResultSet rs = null;
			st = con.createStatement();
			rs = st.executeQuery("SHOW DATABASES");
			if (st.execute("SHOW DATABASES")) {
				rs = st.getResultSet();
			}
			while (rs.next()) {
				String str = rs.getNString(1);
				System.out.println(str);
			}
		} catch (SQLException sqex) {
			System.out.println("SQLException: " + sqex.getMessage());
			System.out.println("SQLState: " + sqex.getSQLState());

		}
	}

}
