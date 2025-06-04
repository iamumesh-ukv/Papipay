package sdetInterviewQuestions;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Annotation {
	
	
	@DataProvider(name="testData")
	public Object[][] supplyTestData()
	{
		Object[][] data ={{"test1"},{"test2"},{"test2"}};
		return data;
	} 
	
	@Test(dataProvider="testData")
	public void dataProviderMethod(String input)
	{
		System.out.println(input);
	}
}
