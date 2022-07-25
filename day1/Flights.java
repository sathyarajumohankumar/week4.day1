package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeOptions options=new ChromeOptions();
options.addArguments("--disable-notifications");
ChromeDriver driver=new ChromeDriver(options);
driver.get("https://www.irctc.co.in/nget/train-search/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
driver.findElement(By.linkText("FLIGHTS")).click();
Set<String> windowHandle=driver.getWindowHandle();}
List<String> newhandle=new ArrayList<String> windowHandle();
driver.switchTo.window(window.get(1));


}
