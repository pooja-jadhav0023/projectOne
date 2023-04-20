package poojajadhav.selenium_framework_design;
import org.testng.annotations.Test;
public class TestNG {

	@Test (priority = 0)
	public void testOne() {
	 System.out.println("test One ");	
	}
	
	
	@Test (priority = -500)
	public void testTwo() {
	 System.out.println("test Two ");	
	}
	
	
	@Test (priority = -600)
	public void testThree() {
	 System.out.println("test Three ");	
	}
	
	@Test (priority = 0)
	public void testFour() {
	 System.out.println("test Four ");	
	}
	
	@Test 
	public void testFive() {
	 System.out.println("test Five ");	
	}


}



