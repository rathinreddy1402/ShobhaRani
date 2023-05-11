package FramewORK;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	@Test
	public void method() throws Throwable
	{
		WebDriver driver;
		driver=WebDriverManager.edgedriver().create();
		
		//driver.get("https://demo.actitime.com/login.do");
	//	driver.findElement(By.id("username")).sendKeys("admin");
		driver.get("https://www.flipkart.com/");
	   TakesScreenshot screen=(TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		File dest = new File("Failed.png");
		FileUtils.copyFile(src, dest);
	}
}
