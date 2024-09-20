package In.com.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeModel {

	public static void create() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		PreparedStatement ptst = conn.prepareStatement("create table employee (emp_id int, emp_name varchar(50), emp_salary int , dept_name varchar(50))");
		int i = ptst.executeUpdate();
		
		System.out.println("table created : " +i);
		
		
	}
	
	public static void alter() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		PreparedStatement ptst = conn.prepareStatement("alter table employee add primary key(emp_id)");
		int i = ptst.executeUpdate();
		
		System.out.println("table updated : "+i);
	}
	
	public static void insert(EmployeeBean bean) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		EmployeeBean exist = findbypk(bean.getEmpid());
		
		if(exist != null) {
			throw new RuntimeException("ID...Alreay exist");
		}
		PreparedStatement ptst = conn.prepareStatement("insert into employee values(?,?,?,?)");
		ptst.setInt(1, bean.getEmpid());
		ptst.setString(2, bean.getName());
		ptst.setInt(3, bean.getSalary());
		ptst.setString(4, bean.getDeptname());
		
		int i = ptst.executeUpdate();
		System.out.println("data inserted " +i);
	}
	
	//Type of method is employeebean because it is the best option to access one record in database
	
	public static EmployeeBean findbypk(int id) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		PreparedStatement ptst = conn.prepareStatement("select * from employee where emp_id = ?");
		ptst.setInt(1, id);
		
		ResultSet rs = ptst.executeQuery();
		
		EmployeeBean bean = null;
		while(rs.next()) {
			
			bean = new EmployeeBean();
			bean.getEmpid();
			bean.getName();
			bean.getSalary();
			bean.getDeptname();
		}
		
		return bean;
		
	}
	
	public List readAll() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		PreparedStatement ptst = conn.prepareStatement("select * from employee");
		ResultSet rs = ptst.executeQuery();
		
		List list = new ArrayList();
		while(rs.next()) {
			EmployeeBean bean = new EmployeeBean();
			bean.setEmpid(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setSalary(rs.getInt(3));
			bean.setDeptname(rs.getString(4));
			
			list.add(bean);
		}
		 
		return list;
		
	}
}
