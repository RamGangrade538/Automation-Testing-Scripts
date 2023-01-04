package EroomrentOwnerg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LoginIntegrate {
public static void main (String []args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
//	driver.get("https://eroomrent.in");
	driver.get("https://eroomrent.in/ownerlogin.php");
	driver.getTitle();
	
	Thread.sleep(3000);
	WebElement owner = driver.findElement(By.linkText("Owner-G"));
	System.out.println(owner.getText());
	Actions action = new Actions(driver);
	Action event = action.moveToElement(owner).click().build();
	event.perform();
	
	Thread.sleep(4000);
	WebElement login = driver.findElement(By.cssSelector("input[type='submit']"));
	login.click();
	String s =driver.getCurrentUrl();
	System.out.println("Current URL is "+s );
	driver.findElement(By.name("txtEmail")).sendKeys("abcde@gmail.com");
	driver.findElement(By.name("txtPassword")).sendKeys("Honey74155");
	


	driver.findElement(By.name("btnsubmit")).click();
	String s1 =driver.getCurrentUrl();
	System.out.println("Current URL is "+s1 );
//	Calculate row and column
	driver.findElement(By.linkText("View Room")).click();
	String s3 =driver.getCurrentUrl();
	System.out.println("Current url of the page :- " +s3);
	List<WebElement> row = driver.findElements(By.xpath("//html/body/div[2]/div/div[2]/center/table/tbody/tr"));
	System.out.println("Current  row ="+ row.size());
	List<WebElement> clm =driver.findElements(By.xpath("//html/body/div[2]/div/div[2]/center/table/tbody/tr[2]/td"));
	System.out.println("Current  column ="+ clm.size());
	
	/*
	driver.findElement(By.linkText("Add Room")).click();
	
//	first dropdown list
	WebElement drop1 =driver.findElement(By.id("ddllocation"));
	Select select = new Select(drop1);
	select.getOptions().size();
	List<WebElement> option =select.getOptions();
	for (WebElement o:option) {
		System.out.println("The Values Are = "+o.getText());
	select.selectByIndex(4);
	}
	
	//	2nd drop down list
	Thread.sleep(2000);
	Select select1 = new Select(driver.findElement(By.id("ddlcat")));
	select1.getOptions().size();
	List<WebElement> option1 =select1.getOptions();
	for (WebElement e:option1) {
		System.out.println("The Values Are = "+e.getText());
	select1.selectByIndex(2);
	}
	
	//	3rd drop down list 
	Thread.sleep(2000);
	Select select2 = new Select(driver.findElement(By.id("subcat")));
	select2.getOptions().size();
	List<WebElement> option2 =select2.getOptions();
	for (WebElement f:option2) {
		System.out.println("The Values Are = "+f.getText());
	select2.selectByIndex(2);
	}
	
//	 te4xt area
	driver.findElement(By.name("txtdesc")).sendKeys("This is a 2 bhk fully furnished flat with balcony and only for the bachlores");
//	for picture uploading
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/center/form/table/tbody/tr[6]/td/input")).sendKeys("C:\\Users\\aaa\\Downloads\\bhk2.jpeg");
//	for price 
	driver.findElement(By.name("txtamount")).sendKeys("6500");
//	
	driver.findElement(By.name("txtfacility")).sendKeys("Extra space in balcony, standard modular kitchen and well furnished apartment ");
	
	driver.findElement(By.xpath("//html/body/div[2]/div/div[2]/center/form/table/tbody/tr[9]/td/input")).click();

	
	*/
	int i=0;
	driver.findElement(By.linkText("View Room")).click();
	
	List<WebElement> row1 = driver.findElements(By.xpath("//html/body/div[2]/div/div[2]/center/table/tbody/tr"));
	for(WebElement rows : row1)
	{
		List<WebElement> clos = rows.findElements(By.tagName("td"));
		for(WebElement celldata : clos) {
	System.out.println(celldata.getText());
		}
		i++;
	}
	Thread.sleep(2000);
	WebElement logout = driver.findElement(By.linkText("Logout"));
	logout.click();
	System.out.println(logout.getText());
	driver.navigate().to("https://www.eroomrent.in/ownerlogin.php");
	driver.findElement(By.name("txtEmail")).sendKeys("abcde@gmail.com");
	driver.findElement(By.name("txtPassword")).sendKeys("Honey74155");
	driver.findElement(By.name("btnsubmit")).click();
	Thread.sleep(3000);
	driver.navigate().refresh();
	logout.click();
	Thread.sleep(3000);
	
	driver.close();
}}
	
	

