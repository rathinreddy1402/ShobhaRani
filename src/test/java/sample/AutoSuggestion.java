package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) throws Throwable {

	WebDriver driver;
	driver=WebDriverManager.edgedriver().create();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("bluetooth");
		
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.tagName("li"));
		
		for(WebElement wb:list)
		{
			if(wb.getText().contains(" headset boat"))
			{
				System.out.println(wb.getText());
				Thread.sleep(1000);
				wb.click();
				break;
			}
		}

	}

}
