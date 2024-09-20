package In.com.collable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.CallableStatement;

public class TestProcedureIn {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		CallableStatement callstmt = conn.prepareCall("{CALL searchbyId(?) }");
		callstmt.setInt(1, 2);
		
		callstmt.execute();
		ResultSet rs = callstmt.getResultSet();
		
		while(rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print("\t"+rs.getInt(2));
			System.out.print("\t"+rs.getString(3));
			System.out.print("\t"+rs.getInt(4));
			System.out.print("\t"+rs.getInt(5));
			System.out.print("\t"+rs.getInt(6));
		}
		
	}
	
}
