package FramewORK;

import java.io.FileInputStream;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import POM.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Property_File {

public static void main(String[] args) throws Throwable {
	
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
		
		LoginPage login=new LoginPage(driver);
		login.loginToApp(USERNAME, PASSWORD);
		
//		driver.findElement(By.id("username")).sendKeys(USERNAME);
//		driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
//		driver.findElement(By.id("loginButton")).click();
		
	}

}
