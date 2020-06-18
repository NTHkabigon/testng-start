package lab6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firsttestngfile {

	public String baseUrl="http://lms.poly.edu.vn//";
	String driverPath="F:\\SOF304_KTNC\\TaiNguyen\\chromedriver_win32\\chromedriver.exe";
	
	public WebDriver driver;
	
	@BeforeTest
		public void launchBrowser() {
		System.out.println("chay trinh duyet chrome");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
	
	}
	@Test
	public void verifyHomepageTitle() {
		String expectedTitle = "Learning Management System | Hệ thống quản trị học tập | FPT Polytechnic Việt Nam";
		
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
}
