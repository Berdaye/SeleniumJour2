package park1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");		 
		WebDriver driver = new ChromeDriver(); //une instace de navigateur chrome
		//ChromeDriver driver2 = new ChromeDriver(); drive2 de type chrome uniquement
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); 		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("txtUsername")); // identificado un elemento web
			username.sendKeys("Admin"); 
			//driver.findElement(By.id("txtUsername")).sendKeys("Admin");btnLogin
		WebElement password= driver.findElement(By.id("txtPassword")); // identificado un elemento web
			password.sendKeys("admin123"); 
	
		WebElement login= driver.findElement(By.id("btnLogin")); // identificado un elemento web
			login.click();
	
	
		WebElement welcome= driver.findElement(By.id("welcome")); // identificado un elemento web 
			welcome.click();
			Thread.sleep(4000);
			
		WebElement logout= driver.findElement(By.linkText("Logout")); // identificado un link web 
			logout.click();
	
	
	
	}
	
		
		

}
