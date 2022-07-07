package BrowsLoginForgetPass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3SchoolTesting {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/MD. ISMAIL HOSSAIN/utilities/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com");
		//driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("mdismailhossain215@gmail.com");
		driver.findElement(By.name("current-password")).sendKeys("ismail");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[4]/div[1]/button")).click();
		Thread.sleep(2000);
		
		
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/*div/div/div[4]/div[1]/div/div[3]/div")).getText());
	
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(5000);
		
		//driver.findElement(By.name("email")).sendKeys("mdismailhossain215@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"modalusername\"]")).sendKeys("mdismailhossain21@gmail.com");
		driver.findElement(By.cssSelector("input#modalusername")).sendKeys("mokter@gmail.com");
		
		//driver.findElement(By.cssSelector("input[class=’EmailInput_input_field__6t4Ux undefined’]")).sendKeys("mokter@gmail.com");
		
		
	}

}
