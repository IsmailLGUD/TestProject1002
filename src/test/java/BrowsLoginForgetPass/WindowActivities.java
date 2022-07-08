package BrowsLoginForgetPass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/MD. ISMAIL HOSSAIN/utilities/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		driver.navigate().to("https://rahulshettyacademy.com");
		Thread.sleep(2000);
		
		driver.navigate().back();
		driver.navigate().forward();
		
		
		

	}

}
