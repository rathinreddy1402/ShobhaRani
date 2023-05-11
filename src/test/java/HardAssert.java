import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert {
@Test
	
	public void method()
	{
		System.out.println("Step-1");
		System.out.println("Step-2");
		System.out.println("Step-3");
		//Assert.assertEquals(false, true);
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(false, true);
		System.out.println("Step-4");
		System.out.println("Step-5");
		soft.assertAll();
	}
/*	@Test
	public void method2()
	{
		String ExpData = "Qspiders";
		String actData = "Qspiders";
		Assert.assertEquals(actData, ExpData);
	}*/
}

	
	