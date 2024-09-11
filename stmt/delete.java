package In.com.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class delete {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test" ,"root","root" );
		
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("delete from student where s_id = 15 ");
		System.out.println("data deleted -> "+i);
		
	}

}
