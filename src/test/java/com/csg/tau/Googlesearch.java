package com.csg.tau;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {

	
//public static void main(String[] args) {

	@Test
	public void Test(){
		
	
	System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	//String baseUrl = "http://www.google.com";
	//driver.get(baseUrl);
	driver.get("http://www.google.com");
	//driver.findElement(By.linkText("Google Search")).click();
	driver.findElement(By.name("q")).sendKeys("Selenium Tutorial");
	driver.findElement(By.name("q")).submit();
	//driver.findElement(By.name("q")).
	//driver.findElement(By.xpath("//span[text()='selenium']")).click();
	//driver.findElement(By.id("gsr")).click();
	//driver.findElement(By.linkText("Google Search")).click();
	//driver.findElement(By.id("gstyle")).sendKeys(Keys.RETURN);
	//WebElement mySelectElement = driver.findElement(By.id("mySelect"));
	//Select dropdown= new Select(mySelectElement);
	//dropdown.selectByIndex(1);
	//driver.findElement(By.id("gsr")).sendKeys(Keys.ENTER);
	//driver.findElement(By.name("btnK")).click();
	//WebElement wb = driver.findElement(By.name("q"));
	//wb.sendKeys("fruit");
	//driver.findElement(By.name("csi")).sendKeys("fruit");
	//driver.findElement(By.name("btnK")).click();
	//wb.submit();
	driver.close();
	}
//}
} 