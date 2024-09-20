package In.com.collable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.sql.CallableStatement;
public class TestStoreFunction {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		CallableStatement callstmt = conn.prepareCall("{? = CALL square(?)}");
		callstmt.setInt(2, 20);
		callstmt.registerOutParameter(1, Types.INTEGER);
		callstmt.execute();
		
		System.out.println("square "+ callstmt.getInt(1));
		
	}
	
}
