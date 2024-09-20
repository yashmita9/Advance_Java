package In.com.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestResourceBundleApp_hi {

	public static void main(String[] args) {
		
		//ResourceBundle rb = ResourceBundle.getBundle("In.com.bundle.app");
		//ResourceBundle rb1 = ResourceBundle.getBundle("In.com.bundle.app_hi");
		
		//ResourceBundle rb = ResourceBundle.getBundle("In.com.bundle.app_sp");
		ResourceBundle rb = ResourceBundle.getBundle("In.com.bundle.app",new Locale("hi"));
		
		System.out.println(rb.getString("greeting"));
		
		//System.out.println(rb1.getString("greeting"));
		
		
	}
	
}
