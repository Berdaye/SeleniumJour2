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
		
		if(titlePage.equals("OrangeHRM")) {
			System.out.println("le test est reussi:");
		}else {
			System.out.println("le itle est a echoue");
		}
		
		String urlPage = driver.getCurrentUrl();
		System.out.println("L URL de la page est"+urlPage);
		if(urlPage.equals("https://opensource-demo.orangehrmlive.com/")) {
			System.out.println("le test est reussi:");
		}else {
			System.out.println("le title est a echoue");
		}
		
		
	}
		

}
