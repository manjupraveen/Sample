package testscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Popup extends Base {
	public void windowPopUp() {
		driver.navigate().to("https://selenium.qabible.in/window-popup.php");
		WebElement likeFaceBook = driver.findElement(By.xpath("//a[@title='Follow @obsqurazone on Facebook']"));
		likeFaceBook.click();
		String mainWindow=driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!mainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);
                    WebElement navigatefacebook=driver.findElement(By.xpath("(//span[text()='See more from Obsqura Zone | Kazhakuttam '])[1]"));
                    
     
            }
        }
		   driver.close();
		   driver.switchTo().window(mainWindow);
                   

		
		
		
	}

	public static void main(String[] args) {
		Popup popup = new Popup();
		popup.initialiseBrowser();
		popup.windowPopUp();
		popup.browserQuit();

	}

}
