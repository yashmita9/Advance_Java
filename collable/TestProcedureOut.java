package In.com.collable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.Types;

public class TestProcedureOut {

	public static void main(String[] args) throws Exception {
		try {
			
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		CallableStatement callstmt = conn.prepareCall("{CALL marksheetOut(?)}");
		callstmt.registerOutParameter(1, Types.VARCHAR);
		
		callstmt.execute();
		String resultValue = callstmt.getString(1);
		System.out.println("Result from marksheetOut stored procedure :"+resultValue);
		}
		
		catch(Exception e){
			
			e.printStackTrace();
			
		}
	}
	
}
