package Assignment_4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Headerfooter {
	private static ChromeDriver driver;
	private static WebElement WebElement;
	private static WebElement footer1;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.shivatutorials.com");
		WebElement head =driver.findElement(By.id("header-wrapper"));
		List<WebElement> link = head.findElements(By.tagName("a"));
		int c = link.size();
		System.out.println("Total Hyper links"+c);
		for (int i=0;i<c;i++)						// by using for loop
		{
			WebElement ele = link.get(i);
			String s = ele.getAttribute("href");
			System.out.println("Total hyper links in Header = " + s);	
		}
		
		footer1 = driver.findElement(By.tagName("footer"));
		List<WebElement> link1 = footer1.findElements(By.tagName("a"));
		int c1 = link1.size();
		System.out.println("Hyper links = "+ c1);
		for (int i=0;i<c1;i++)						// by using for loop
		{
			WebElement ele1 = link1.get(i);
			String s2 = ele1.getAttribute("href");
			System.out.println("hyper links in Footer  = " +s2);	
		}
		
		driver.close();
}
	
}
