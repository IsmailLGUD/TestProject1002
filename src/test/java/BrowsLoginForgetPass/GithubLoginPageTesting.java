package BrowsLoginForgetPass;
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
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Ism@ilLGUD0040");
		driver.findElement(By.className("btn")).click();		
		
	}

}
