package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public void initialiseBrowser(){
		//open chrome driver
		 driver = new ChromeDriver();
		//url load 
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		// to maximize the window
		driver.manage().window().maximize();
		
		
	}
	public void browserQuit(){
		//close a driver/or browser
		driver.close();
		
	}

	public static void main(String[] args) {
		Base base = new Base();
base.initialiseBrowser();
base.browserQuit();
	}

}
