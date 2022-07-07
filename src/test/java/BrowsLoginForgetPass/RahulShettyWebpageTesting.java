package BrowsLoginForgetPass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RahulShettyWebpageTesting {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/MD. ISMAIL HOSSAIN/utilities/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password?wizard_id=mFG9KSvfBSKivEgHz7fG--LyTaYdcYdHDC_u40MmFHAo4GtiSNEzlqQRPiCY9NXz59FMPaR9vNWMc4b9V7bafg");
		driver.manage().window().maximize();
		
		System.out.println("The title is: " + driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys("mdismailhossain215@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.name("password")).sendKeys("ismail");
		Thread.sleep(1000);
		
		driver.findElement(By.className("btn-primary")).click();
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.cssSelector("div.bodySmall.m-b-3-xs.text-center-xs.auth-flash-error")).getText());
		
		driver.findElement(By.linkText("Forgot Password")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("email")).sendKeys("mdismailhossain@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("mdismailhossain215@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println("Copyright: " + driver.findElement(By.cssSelector("footer[class='text-center-xs']")).getText());
		
		//below are the same thing with css and xpath
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		System.out.println(driver.findElement(By.cssSelector("div h3")).getText());
		
		driver.navigate().back();
		
		driver.findElement(By.name("password")).sendKeys("Ism@ilLGUD0040");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[name*='com']")).click();//short way instead using commit
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.linkText("Home")).getText());
		
		Assert.assertEquals(driver.findElement(By.linkText("Home")).getText(), "Home");
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.xpath("//a[@class='fedora-navbar-link navbar-link dropdown-toggle open-my-profile-dropdown']")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//a[@class='fedora-navbar-link navbar-link dropdown-toggle open-my-profile-dropdown']")).getText(), "Md. Ismail Hossain");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='fedora-navbar-link navbar-link dropdown-toggle open-my-profile-dropdown']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(3000);
		
		System.out.println("Thanks! The Rahul Shetty Academy is successfully tested!");
		
		driver.close();
	}

}