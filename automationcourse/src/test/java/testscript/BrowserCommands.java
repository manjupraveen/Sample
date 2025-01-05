package testscript;

public class BrowserCommands extends Base{
	public void browserCommands() {
		// to get application title 
		String title = driver.getTitle();
		
	}
	

	public static void main(String[] args) {
		BrowserCommands browsercommands = new BrowserCommands();
		browsercommands.initialiseBrowser();
		browsercommands.browserCommands();
		browsercommands.browserQuit();
	}

}

