package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts extends Base{
	public void alertjavascript() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickMe1 = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));//alert
		WebElement clickMe2 = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));//confirm alert 
		WebElement click4promtBox = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));//prompt alert
		clickMe1.click();
		//driver.switchTo().alert().getText();//to get text from alert 
		String alertText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();// to click on OK
		//clickMe2.click();
		//driver.switchTo().alert().dismiss();//to click on cancel
		//click4promtBox.click();
		//driver.switchTo().alert().sendKeys("Manju");// to give a prompt or write something in the field
		//driver.switchTo().alert().accept();
		
	}

	public static void main(String[] args) {
		Alerts alerts = new Alerts();
		alerts.initialiseBrowser();
		alerts.alertjavascript();
		alerts.browserQuit();
	}

}
