package Assignment_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	private static ChromeDriver driver;
	

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		Iterator it = link.iterator();
		ArrayList arrlist = new ArrayList();
		int a=0,b=0;
		while(it.hasNext()) {
			WebElement e = (WebElement) it.next();
			String c = e.getAttribute("href");
			if(c.equals("")||c.equals("#")) 
				a++;
//			else
//				b++;
			arrlist.add(c);
			System.out.println(c);
			
			
		}
		System.out.println("Total Hyperlinks are "+link.size());
		System.out.println("Broken links in page "+ a);
//		System.out.println("Total working Hyperlinks are "+b);
		
		
		driver.close();
		
		
	}

}
