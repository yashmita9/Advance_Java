package In.com.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class read {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Student");
		while(rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.println("\t" + rs.getString(2));
		}
		
	}
	
}
