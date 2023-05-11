package FramewORK;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotScroll {

	@Test
	public void robotscroll() throws Throwable {

	WebDriver driver;
		driver=WebDriverManager.chromedriver().create();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();

	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_PAGE_UP);
	r.keyRelease(KeyEvent.VK_PAGE_UP);
	
	Thread.sleep(1000);	
	r.keyPress(KeyEvent.VK_PAGE_UP);
	r.keyRelease(KeyEvent.VK_PAGE_UP);
	
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_PAGE_UP);
	r.keyRelease(KeyEvent.VK_PAGE_UP);
	
	}

}
