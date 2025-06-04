package sdetInterviewQuestions;

import org.testng.annotations.Test;

public class Group_Test_Concepts {
	
	@Test(groups= {"smoke"})
	public void group01()
	{
		System.out.println("smoke testing");
	}
	@Test(groups={"smoke","system"})
	public void group02()
	{
		System.out.println("System testing, smoke testing");
	}
	@Test(groups="retesting")
	public void group03()
	{
		System.out.println("Reteting testing,System testing");
	}
	@Test(groups ="integration")
	public void group04()
	{
		System.out.println("Integration testing, components testing");
	}
	@Test(groups="sanity")
	public void group05()
	{
		System.out.println("sanity testing, integration testing");
	}

}
