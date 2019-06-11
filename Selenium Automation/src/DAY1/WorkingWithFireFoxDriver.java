package DAY1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithFireFoxDriver {

	FirefoxDriver driver;
	public void invokeBrowser()
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\libs\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://qatechhub.com");
	}
	public void getTitleofthepage() {
		System.out.println("Title of the page   : :"+ driver.getTitle());
	}
	public void closeBrowser()
	{
		//driver.close(); //it closes the current window
		driver.quit(); //it closes all the window opened by selenium
	}
	public void navigateCommand()
	{
		driver.navigate().to("http://facebook.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	
}
