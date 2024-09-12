package In.com.Dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class update {

	public static void main(String[] args) throws Exception {
		
		//testupdate1();
		//testupdate2();
		//testupdate3(2541, "shweta", 25, 3);
		MarksheetBean bean = new MarksheetBean();
		bean.setRoll_no(2545);
		bean.setName("ruhi");
		bean.setMaths(61);
		bean.setId(18);
		testupdate4(bean);
	}
	
	
	public static void testupdate1() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
		
		PreparedStatement ptst = conn.prepareStatement("update marksheet set roll_no = 2540 where id = 20");
		
		int i = ptst.executeUpdate();
		System.out.println("updated data : "+i);
	}
	
	public static void testupdate2() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		PreparedStatement ptst = conn.prepareStatement("update marksheet set name = ? where id = ?");
		ptst.setString(1, "rajiv");
		ptst.setInt(2, 20);
		
		int i = ptst.executeUpdate();
		System.out.println("update data : " +i);
	}
	
	public static void testupdate3(int roll_no , String name , int maths , int id) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		PreparedStatement ptst = conn.prepareStatement("update marksheet set roll_no = ?, name = ?, maths = ? where id = ? ");
		ptst.setInt(1, roll_no);
		ptst.setString(2, name);
		ptst.setInt(3, maths);
		ptst.setInt(4, id);
		
		int i = ptst.executeUpdate();
		System.out.println("update data : " +i);
		
	}
	
	public static void testupdate4(MarksheetBean bean) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test" , "root" ,"root");
		
		PreparedStatement ptst = conn.prepareStatement("update marksheet set roll_no = ?, name = ?, maths = ? where id = ?");
		ptst.setInt(1, bean.getRoll_no());
		ptst.setString(2, bean.getName());
		ptst.setInt(3, bean.getMaths());
		ptst.setInt(4, bean.getId());
		
		int i = ptst.executeUpdate();
		System.out.println("update data : "+i);
	}
}
