package In.com.ptmt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteQurry {
	
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","root");
		
		PreparedStatement pstmt = conn.prepareCall("delete from emp where id = 10");
		int i = pstmt.executeUpdate();
		System.out.println("data delete => "+i);
		
	}

}
