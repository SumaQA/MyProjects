package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {

    @BeforeTest
	public void beforeTestM()
	{
	System.out.println("In the method Before Test");
	}
    @BeforeMethod
    public void beforemethod()
    {
    	System.out.println("In Before Method Day1");
    }
    @AfterMethod
    public void aftermethod()
    {
    	System.out.println("In After Method Day1");
    }
    @Test
    public void personalLoan()
    {
    	System.out.println("In personalLoan page Day1");
    }
    
}
