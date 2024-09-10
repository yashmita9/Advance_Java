package In.com.ptmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class updateQuarry {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test" , "root","root");
		PreparedStatement prt = conn.prepareStatement("update emp set name = 'reema' where id = 7");
		
		int i = prt.executeUpdate();
		System.out.println("update => "+i);
		
	}
	
}
