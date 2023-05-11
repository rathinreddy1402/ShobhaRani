package FramewORK;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {

	@Test
	public void scroll() throws Throwable {


		WebDriver driver;
		driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<5;i++)
		{
			js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(1000);
		}
		for(int i=0;i<3;i++)
		{
			js.executeScript("window.scrollBy(0,-200)");
			Thread.sleep(1000);
		}
	}

}
