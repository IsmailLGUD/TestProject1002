package BrowsLoginForgetPass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubLoginPageTesting {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:/Users/MD. ISMAIL HOSSAIN/utilities/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("login_field")).sendKeys("IsmailLGUD");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));//another way to stay in the website
		
		driver.findElement(By.id("password")).sendKeys("Hello12343");//wrong password
		Thread.sleep(1000);
		
		driver.findElement(By.className("btn")).click();	
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"js-flash-container\"]/div/div")).getText());
		
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("email_field")).sendKeys("mdismailhossain215@gmail.com");
		Thread.sleep(10000);
				
				
		driver.findElement(By.xpath("//*[@id=\"home_children_button\"]")).click();
		//*[@id="home_children_button"]
		
				
	}

}
