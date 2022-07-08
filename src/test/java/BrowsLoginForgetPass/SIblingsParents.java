package BrowsLoginForgetPass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SIblingsParents {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/MD. ISMAIL HOSSAIN/utilities/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//parent-child
		driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
		
		
		//parent-child & child to parent
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/div/button[3]")).getText());
		
		

	}

}
