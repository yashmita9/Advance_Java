package In.com.users;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import In.com.collable.TestStoreFunction;

public class TestUserModel {
	
	public static void main(String[] args) throws Exception {
		//testAdd();
		//testUpdate();
		//testDelete();
		//testFindByPk();
		testSearch();
	}
	
	public static void testAdd() throws Exception {
	
		UserModel model = new UserModel();
		Userbean bean = new Userbean();
		
		bean.setFirstName("abc");
		bean.setLastName("hjk");
		bean.setLoginId("hsdj@gmail.com");
		bean.setPassward("ejn");
		 // Manually setting the date of birth (e.g., January 1, 2000)
	    Calendar cal = Calendar.getInstance();
	    cal.set(2004, Calendar.FEBRUARY, 29); // Year, Month (0-based), Day
	    Date dob = cal.getTime(); // Get java.util.Date
	    bean.setDob(dob);
		bean.setAddress("pune");
		
		model.add(bean);
		
		}
	
	public static void testUpdate() throws Exception {
		UserModel model = new UserModel();
		Userbean bean = model.findByPk(6);
		
		bean.setFirstName("khkdfhk");
		bean.setAddress("mumbai");
		
		model.update(bean);
	}

	public static void testDelete() throws Exception {
		
		UserModel model = new UserModel();
		model.delete(7);
		
	}
	
	public static void testFindByPk() throws Exception {
		
		UserModel model = new UserModel();
		Userbean bean = model.findByPk(3);
			
			if(bean != null) {
				System.out.print(bean.getId());
				System.out.print("\t" +bean.getFirstName());
				System.out.print("\t" +bean.getLastName());
				System.out.print("\t"+bean.getLoginId());
				System.out.print("\t"+bean.getPassward());
				System.out.print("\t"+bean.getDob());
				System.out.println("\t"+bean.getAddress());
			}
			else {
				System.out.println("id not found");
			}
	}
	
	public static void testSearch() throws Exception {
		
		Userbean bean = new Userbean();
		bean.setFirstName("a");
		
		UserModel model = new UserModel();
		List list = model.search(bean, 1, 5);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			
			bean = (Userbean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" +bean.getFirstName());
			System.out.print("\t" +bean.getLastName());
			System.out.print("\t" +bean.getLoginId());
			System.out.print("\t" +bean.getPassward());
			System.out.print("\t"+bean.getDob());
			System.out.println("\t" +bean.getAddress());
			
		}
	}
}




