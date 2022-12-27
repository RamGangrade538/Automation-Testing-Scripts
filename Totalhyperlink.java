package Assignment_4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Totalhyperlink {
	private static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.shivatutorials.com");
		List<WebElement> b = driver.findElements(By.tagName("a"));
		int c = b.size();
		System.out.println("Total hyperlinks "+c);
	
	
	
	}
}
