package In.com.collable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.sql.CallableStatement;

public class TestProcedureInOut {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		CallableStatement callstmt = conn.prepareCall("{CALL marksheetInOut(?)}");
		callstmt.setInt(1, 15);
		
		callstmt.registerOutParameter(1, Types.INTEGER);
		callstmt.execute();
		System.out.println(callstmt.getInt(1));
		
	}
	
}
