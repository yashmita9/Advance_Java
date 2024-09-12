package In.com.Dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert {

	public static void main(String[] args) throws Exception {
		
		//testinsert1();
		//testinsert2();
		//testinsert3(18, 2531, "harsh", 53, 35, 72);
		
		MarksheetBean bean = new MarksheetBean();
		bean.setId(20);
		bean.setRoll_no(2532);
		bean.setName("khush");
		bean.setPhysics(10);
		bean.setChemistry(20);
		bean.setMaths(30);
		
		testinsert4(bean);

		
	}
	
	public static void testinsert1() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		PreparedStatement ptst = conn.prepareStatement("insert into marksheet values(16,2530,'pihu',56,78,44)");
		
		int i = ptst.executeUpdate();
		System.out.println("insert data ->" +i);
		
	}
	
	public static void testinsert2() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		PreparedStatement ptst = conn.prepareStatement("insert into marksheet values (?,?,?,?,?,?)");
		
		ptst.setInt(1, 17);
		ptst.setInt(2, 2531);
		ptst.setString(3, "tina");
		ptst.setInt(4, 52);
		ptst.setInt(5, 65);
		ptst.setInt(6, 82);
		
		int i = ptst.executeUpdate();
		System.out.println("insert data :" +i);
	}
	
	public static void testinsert3(int id, int roll_no, String name , int physics , int chem , int maths ) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		PreparedStatement ptst = conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
		ptst.setInt(1, id);
		ptst.setInt(2, roll_no);
		ptst.setString(3, name);
		ptst.setInt(4, physics);
		ptst.setInt(5, chem);
		ptst.setInt(6, maths);
		
		int i = ptst.executeUpdate();
		System.out.println("insert data -> "+i);
	}
	
	public static void testinsert4(MarksheetBean bean) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		PreparedStatement ptst = conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
		ptst.setInt(1, bean.getId());
		ptst.setInt(2, bean.getRoll_no());
		ptst.setString(3, bean.getName());
		ptst.setInt(4, bean.getPhysics());
		ptst.setInt(5, bean.getChemistry());
		ptst.setInt(6, bean.getMaths());
		
		int i = ptst.executeUpdate();
		System.out.println("insert data : "+i);
		

	}
	
}
