package In.com.Marksheet;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	
	public static void main(String[] args) throws Exception {
	
//		testinsert();
//		testupdate();
//		testdelete();
//		testread();
		
//		testfindbypk();

//		testreadAll();
//		testSearch();
		testsearch2();
	}
	
	public static void testinsert() throws Exception {
		
		Marksheetbean bean = new Marksheetbean();
		bean.setId(26);
		bean.setRoll_no(2544);
		bean.setName("sapna");
		bean.setPhysics(45);
		bean.setChemistry(98);
		bean.setMaths(65);
		
		MarksheetModel m = new MarksheetModel();
		
		m.insert(bean);
	}
	
	public static void testupdate() throws Exception{
		
		Marksheetbean bean = new Marksheetbean();
		bean.setRoll_no(2541);
		bean.setName("pooja");
		bean.setId(2);
		
		MarksheetModel m = new MarksheetModel();
		m.update(bean);
	}
	
	public static void testdelete() throws Exception {
		
		MarksheetModel m = new MarksheetModel();
		m.delete(20);
		
	}
	
	public static void testread() throws Exception{
		
		MarksheetModel m = new MarksheetModel();
		m.read();
	}
	
	public static void testfindbypk () throws Exception {
		
		
		MarksheetModel m = new MarksheetModel();
		Marksheetbean bean = m.findbypk(100);
		
		if(bean != null) {
		
			System.out.print(bean.getId());
			System.out.print("\t"+bean.getRoll_no());
			System.out.print("\t"+bean.getName());
			System.out.print("\t"+bean.getPhysics());
			System.out.print("\t"+bean.getChemistry());
			System.out.println("\t"+bean.getMaths());
			
		}else {
			System.out.println("id not found");
		}
		
	}
	
	public static void testreadAll() throws Exception {
		
		MarksheetModel m = new MarksheetModel();
		
		List list = m.readAll();
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Marksheetbean bean = (Marksheetbean) it.next();
			
			System.out.print(bean.getId());
			System.out.print("\t"+bean.getRoll_no());
			System.out.print("\t"+bean.getName());
			System.out.print("\t "+bean.getPhysics());
			System.out.print("\t"+bean.getChemistry());
			System.out.println("\t"+bean.getMaths());
		}
	}
	
	public static void testSearch() throws Exception {
		
		Marksheetbean bean = new Marksheetbean();
		
		//bean.setName("y");
		bean.setRoll_no(2500);
		MarksheetModel model = new MarksheetModel();
		
		List list = model.search(bean);
		Iterator it = list.iterator();
		 
		while(it.hasNext()) {
			
			bean = (Marksheetbean) it.next();
			
			System.out.print(bean.getId());
			System.out.print("\t"+bean.getRoll_no());
			System.out.print("\t" +bean.getName());
			System.out.print("\t"+bean.getPhysics());
			System.out.print("\t"+bean.getChemistry());
			System.out.println("\t"+bean.getMaths());
			
		}
	}
	
	public static void testsearch1() throws Exception {
		Marksheetbean bean = new Marksheetbean();
		
		MarksheetModel model = new MarksheetModel();
		//bean.setName("yashmita");
		bean.setRoll_no(2531);
		
		List list = model.search1(bean);
		
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			bean = (Marksheetbean) it.next();
			System.out.print("\t" + bean.getId());
			System.out.print("\t" +bean.getRoll_no());
			System.out.print("\t" +bean.getName());
			System.out.print("\t" +bean.getPhysics());
			System.out.print("\t" +bean.getChemistry());
			System.out.println("\t" +bean.getMaths());
		}
	}
	
	public static void testsearch2() throws Exception {
		Marksheetbean bean = new Marksheetbean();
		
		MarksheetModel model = new MarksheetModel();
		bean.setName("yashmita");
		//bean.setRoll_no(2531);
		
		List list = model.search2(bean, 1, 3);
		
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			bean = (Marksheetbean) it.next();
			
			System.out.print("\t" + bean.getId());
			System.out.print("\t" +bean.getRoll_no());
			System.out.print("\t" +bean.getName());
			System.out.print("\t" +bean.getPhysics());
			System.out.print("\t" +bean.getChemistry());
			System.out.println("\t" +bean.getMaths());
		}
	}
}
