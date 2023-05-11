package sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pro {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.edgedriver().create();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Approach to Fetch Data from Common File
		
		//FileInputStream fis=new FileInputStream("C:\\Users\\Shobha\\Documents\\FileData.properties");
		FileInputStream fis=new FileInputStream("./FileData.properties");
		
		Properties pro=new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		
		driver.get(URL);
		driver.findElement(By.id("username")).sendKeys(USERNAME);
		driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
		driver.findElement(By.id("loginButton")).click();
	}

}
