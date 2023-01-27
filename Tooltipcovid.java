package seleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltipcovid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=covid+live+update&rlz=1C1VDKB_enIN1038IN1038&oq=covislive+&aqs=chrome.1.69i57j0i13i433i512j0i13i512l8.5459j0j7&sourceid=chrome&ie=UTF-8");
		driver.manage().deleteAllCookies();
		
		List<WebElement> glist=driver.findElements(By.xpath("//div[@class='uch-path']//*[name()='svg']//*[name()='g']//*[name()='rect']"));
			Actions action = new Actions(driver);
		for(WebElement o:glist) {
			action.moveToElement(o).perform();
			String a =driver.findElement(By.xpath("//div[@class='ExnoTd']")).getText();
		System.out.println(a);
		}
	}

}
