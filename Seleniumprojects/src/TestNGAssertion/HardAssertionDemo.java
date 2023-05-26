package TestNGAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo {
@Test
public void assertEquals() {
	Assert.assertEquals("This assertion will pass", "This assertion will pass ");
	System.out.println("The line is executed because asserEquals"+"passed since both the Strings are same");

    Assert.assertEquals("Assertion","The assertion will fail");
    System.out.println("The line willnot be executed" + "assert equals fails both the strings are diff" +"xxx");
}

@Test
public void assertNotEquals() {
	Assert.assertNotEquals("This assertion will pass","Since the "+"Expected and actual result do not match");
	System.out.println("The line is executed because asserNotEquals"+"assertion passed for the scenario");
    }
	
@Test
	public void assertTrue() {
		Assert.assertTrue(3 < 5);
	
		System.out.println("The line is executed because asserNotEquals"+"assertion passed for the scenario");
	}
		
@Test
	public void assertFalse() {
		Assert.assertFalse(3 > 5);
		System.out.println("The line is executed as assertTrue"+" pass because the 3<5 (Which will return true) ");
		}
		
		
		@Test
		public void assertNull() {
			Assert.assertNull(null);
			System.out.println("Since we set null in the condition, the assertion"+ "assertNull will pass");
			
		}
		@Test
	 public void assertNotNull() {
		 Assert.assertNotNull("This assertion will pass because this "+ " String dotn returns a null value ");
		 	System.out.println("this line is executed becuase assertNotNull have passed");	
	 }
	

}
