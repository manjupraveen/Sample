package testscript;

public class BrowserCommands extends Base{
	public void browserCommands() {
		// to get application title 
		String title = driver.getTitle();
		// to get URL of an application
		String url = driver.getCurrentUrl();
		// to get page source
				String pagesource = driver.getPageSource();
				
		
	}
	

	public static void main(String[] args) {
		BrowserCommands browsercommands = new BrowserCommands();
		browsercommands.initialiseBrowser();
		browsercommands.browserCommands();
		browsercommands.browserQuit();
	}

}

