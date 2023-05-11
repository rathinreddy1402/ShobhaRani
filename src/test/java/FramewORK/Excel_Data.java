package FramewORK;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel_Data {

	@Test
	public void excelData() throws Throwable
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Approach to Fetch Data from Common File
		
		//FileInputStream fis=new FileInputStream("C:\\Users\\Shobha\\Documents\\FileData.properties");
		FileInputStream fis=new FileInputStream("./FileData.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url1");
		driver.get(URL);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//FileInputStream fes=new FileInputStream("./ExcelData.xlsx");
		FileInputStream fes=new FileInputStream("C:\\Users\\Shobha\\Desktop\\ExcelData.xlsx");
		Workbook book = WorkbookFactory.create(fes);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cel = row.getCell(0);
		String Exceldata = cel.toString();

		//driver.findElement(By.name("q")).sendKeys(Exceldata);
//driver.findElement( By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys(Exceldata);
	WebElement data = driver.findElement(By.xpath("//input[contains(@class,'LK')]"));
	 data.sendKeys(Exceldata);
	String actData = data.getText();
	System.out.println(actData);
}}