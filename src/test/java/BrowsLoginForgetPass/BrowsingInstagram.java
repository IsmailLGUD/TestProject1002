package BrowsLoginForgetPass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class BrowsingInstagram {

	public static void main(String[] args) throws Throwable {
		
		// Invoking Chrome Browser
		
		//path of chromedriver
		System.setProperty("webdriver.chrome.driver","C:/Users/MD. ISMAIL HOSSAIN/utilities/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		//Firefox launch
		//geckodriver
		//webdriver.gecko.driver
		
//		System.setProperty("webdriver.edge.driver","C:/Users/MD. ISMAIL HOSSAIN/utilities/msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		//Thread.sleep(9000);
		//driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("<input aria-label=\"Phone number, username, or email\" aria-required=\"true\" autocapitalize=\"off\" autocorrect=\"off\" maxlength=\"75\" name=\"username\" type=\"text\" class=\"_2hvTZ pexuQ zyHYP\" value=\"\">")).sendKeys("i.s.m.a.i.l_1"); 
		//<input aria-label="Phone number, username, or email" aria-required="true" autocapitalize="off" autocorrect="off" maxlength="75" name="username" type="text" class="_2hvTZ pexuQ zyHYP" value="">
		////*[@id="loginForm"]/div/div[1]/div/label/input
		

	}

}