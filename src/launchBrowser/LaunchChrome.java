package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	//methods
	//variables
	
	public static void main(String[] args) throws InterruptedException {
		
		//Scanner scn = new Scanner(System.in);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MJSJ1\\Apr2021_Selenium\\First_Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
