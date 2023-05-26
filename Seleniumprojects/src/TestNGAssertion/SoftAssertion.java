package TestNGAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
SoftAssert softAssert = new SoftAssert();

@Test
public void hardAssertion() {
	Assert.assertEquals("pass", "Pass");
	System.out.println("This line is Executed because assertEquals "+ "passed as both the strings are same");
	Assert.assertNull("assertion");
	System.out.println("Since the obj under assertion ");
	
}
@Test
public void softAssertion() {
	softAssert.assertNull("assertion");
	System.out.println();
	
	
}
	

	
}
