package park1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");		 
		WebDriver driver = new ChromeDriver(); //une instace de navigateur chrome
		//ChromeDriver driver2 = new ChromeDriver(); drive2 de type chrome uniquement
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); 		
		driver.manage().window().maximize();
		String titlePage = driver.getTitle();
		
		System.out.println("le itle est:"+titlePage);
	}

}
