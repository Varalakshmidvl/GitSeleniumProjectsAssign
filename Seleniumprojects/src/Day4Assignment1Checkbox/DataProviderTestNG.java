package Day4Assignment1Checkbox;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNG {

	    @DataProvider(name = "data-provider")
	    public Object[][] data()
	    {
	        Object[][] data = new Object[3][3];
	         
	        data[0][0] = "FName1";
	        data[0][1] = "LName1";
	        data[0][2] = "Email1";
	         
	        data[1][0] = "FName2";
	        data[1][1] = "LName2";
	        data[1][2] = "Email2";
	         
	        data[2][0] = "FName3";
	        data[2][1] = "LName3";
	        data[2][2] = "Email3";
	         
	        return data;
	    }
	     
	    @Test(dataProvider="data-provider")
	    public void readDataProviderData(String fName, String lName, String email)
	    {
	        System.out.println("First Name is: "+ fName);
	        System.out.println("Last Name is: "+ lName);
	        System.out.println("Email id is: "+ email);
	        System.out.println("*********************");
	    }
	}
	
	
