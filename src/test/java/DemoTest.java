import org.testng.annotations.Test;


public class DemoTest {

	@Test
public void createContact()
{
	System.out.println("contact created");	
	
}
	
	@Test
	public void modifyContact()
	{
		System.out.println("contact modified");
	}
	@Test(invocationCount = 0)
	public void deleteContact()
	{
		System.out.println("contact deleted");
	}
}
