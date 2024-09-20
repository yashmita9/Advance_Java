package In.com.Test;

import java.util.ResourceBundle;

public class TestResourceBundleApp {

	
	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("In.com.bundle.app");
		
		System.out.println(rb.getString("greeting"));
		System.out.println(rb.getString("hello"));
		
	}
}
