import java.io.FileInputStream;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	@Test
	public void sample()throws Throwable
	{
	
		WebDriver driver;
	driver=	WebDriverManager.chromedriver().create();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	
	 driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	 Thread.sleep(2000);
 driver.findElement(By.cssSelector("div.popup_menu_button_settings")).click();
 Thread.sleep(1000);
 driver.findElement(By.linkText("Types of Work")).click();
	 driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
	 
	 FileInputStream fes=new FileInputStream("C:\\Users\\Shobha\\Desktop\\ExcelData.xlsx");
		Workbook book = WorkbookFactory.create(fes);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cel = row.getCell(0);
		String Exceldata = cel.getStringCellValue();
  WebElement data = driver.findElement(By.name("name"));
 data.sendKeys(Exceldata);
 Thread.sleep(1000);
 String actdata = data.getText();
 System.out.println(actdata);
 
 Assert.assertEquals(actdata, Exceldata);
}
}