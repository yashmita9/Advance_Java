package In.com.employee;

import java.util.Iterator;
import java.util.List;

public class TestEmp {

	public static void main(String[] args) throws Exception {
		
//		testcreate();
//		testalter();
//		testinsert();
		testread();
		
	}
	
	public static void testcreate() throws Exception {
		EmployeeModel emp = new EmployeeModel();
		emp.create();
	}
	
	public static void testalter() throws Exception {
		EmployeeModel emp =new EmployeeModel();
		emp.alter();
	}
	
	public static void testinsert() throws Exception {
		
		EmployeeModel model = new EmployeeModel();
		EmployeeBean bean = new EmployeeBean();
		
		bean.setEmpid(7);
		bean.setName("priya");
		bean.setSalary(54000);
		bean.setDeptname("sales");
		
		model.insert(bean);
	}
	
	public static void testread() throws Exception {
		
		EmployeeModel model = new EmployeeModel();
		
		List list = model.readAll();
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			EmployeeBean bean = (EmployeeBean) it.next();
			
			System.out.print(bean.getEmpid());
			System.out.print("\t"+bean.getName());
			System.out.print("\t"+bean.getSalary());
			System.out.println("\t"+bean.getDeptname());
			
		}
		
	}
}
