package FramewORK;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert {

	public static void main(String[] args) {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.flipkart.com");
		FileInputStream fes=new FileInputStream("C:\\Users\\Shobha\\Desktop\\ExcelData.xlsx");
		Workbook book = WorkbookFactory.create(fes);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cel = row.getCell(0);
		String Exceldata = cel.toString();
		driver.findElement(By.xpath("//button[.='✕']")).click();
		WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
		ele.sendKeys(Exceldata);
Object actualData;

		//		String actualData = ele.getAttribute("value");
//Object Exceldata1;
		//		if (actualData.equals(expectedData)) {
//			System.out.println("pass = " + actualData);
//		} else {
//			System.out.println("fail");
//		}
		//Assert.assertEquals(Exceldata, actualData);

	}

			
	}

		
	


