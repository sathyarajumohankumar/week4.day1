package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
driver.switchTo().frame("frame1");
driver.findElement(By.xpath("//b[@id='topic']/following::input")).sendKeys("sathya");

driver.switchTo().frame("frame3");

driver.findElement(By.xpath("//input[@id='a']")).click();
driver.switchTo().defaultContent();
driver.switchTo().frame("frame2");
WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
Select select=new Select(animals);
select.selectByValue("cat");
}

}
