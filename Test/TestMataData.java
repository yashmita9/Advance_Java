package In.com.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class TestMataData {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		PreparedStatement ptst = conn.prepareStatement("select * from marksheet");
		
		ResultSet rs = ptst.executeQuery();
		ResultSetMetaData metadata = rs.getMetaData();
		
		System.out.println("Catlog Name :" +metadata.getCatalogName(1));
		
		System.out.println("Table Name : "+metadata.getTableName(1));
		
		System.out.println("Colunm Count :"+metadata.getColumnCount());
		
	}
	
}
