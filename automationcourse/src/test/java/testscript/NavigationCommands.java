package testscript;

public class NavigationCommands extends Base {
	public void navigation() {
		driver.navigate().to("https://www.browserstack.com/guide/architecture-of-selenium-webdriver");// to navigate to a webpage
		driver.navigate().back();// to come back to practice site
		driver.navigate().forward();// to go back to google or 
		driver.navigate().refresh();
		
	}

	public static void main(String[] args) {
		NavigationCommands navigationcommands = new NavigationCommands();
		navigationcommands.initialiseBrowser();
		navigationcommands.navigation();
		navigationcommands.browserQuit();
		

	}

}
