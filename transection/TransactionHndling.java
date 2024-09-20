package In.com.transection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionHndling {

	public static void main(String[] args) throws Exception {

		Connection conn = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			Statement stmt = conn.createStatement();

			conn.setAutoCommit(false);
			int i = stmt.executeUpdate("insert into marksheet values(30, 2550 , 'ankita' , 25,56,78 )");
			i = stmt.executeUpdate("insert into marksheet values(31 , 2551,'abu', 98,78,88)");
			i = stmt.executeUpdate("insert into marksheet values(31 , 2552,'abc',69,45,75)");
			conn.commit();
			System.out.println("data insert : " + i);

		} catch (Exception e) {
			conn.rollback();
			System.out.println("exception " + e.getMessage());
		} finally {
			conn.close();
		}
	}

}
