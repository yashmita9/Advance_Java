package In.com.rb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import In.com.util.JDBCDataSource;

public class TestJDBCDataSource {

	public static void main(String[] args) throws Exception {
		
		testGet();
		
	}

public static void testGet() throws Exception{
	
	Connection conn = JDBCDataSource.getConnection();
	
	PreparedStatement ptst = conn.prepareStatement("select * from marksheet where id = 1");
	ResultSet rs = ptst.executeQuery();
	
	while(rs.next()) {
		System.out.print(rs.getInt(1));
		System.out.print("\t"+rs.getInt(2));
		System.out.print("\t"+rs.getString(3));
		System.out.print("\t" +rs.getInt(4));
		System.out.print("\t" +rs.getInt(5));
		System.out.println("\t" +rs.getInt(6));
	}
	JDBCDataSource.closeConnection(conn);
	}
}