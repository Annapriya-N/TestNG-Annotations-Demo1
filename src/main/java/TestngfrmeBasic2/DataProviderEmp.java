package TestngfrmeBasic2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEmp {
   
	@DataProvider(name="testdata")
	public Object[][] testcase()
	{
		return new Object[][]
				{
			{"user","pass"},
			{"user1","pass1"}
				};
	}
	
	@Test(dataProvider="testdata")
	public void loadtest(String Username,String Password)
	{
		System.out.println("Username is : "+Username +"and  Password is : " + Password);
	}
}
