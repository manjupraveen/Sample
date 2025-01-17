package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LinkTextEg extends Base{
	public void verifyTwoInputField()
	{
		int a = 20;
		int b =30;
		int expectedTotal = a+b;
		WebElement inputATextbox= driver.findElement(By.xpath("//input[@id='value-a']"));
		inputATextbox.sendKeys(""+a);
		WebElement inputBTextbox= driver.findElement(By.xpath("//input[@id='value-b']"));
		inputBTextbox.sendKeys(""+b);
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotalButton.click();
		WebElement totalText =driver.findElement(By.xpath("//div[@id='message-two']"));
		String total =totalText.getText();
		int actualTotal = Integer.parseInt(total.substring(14));
		if(expectedTotal==actualTotal)
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");	
		}


	}
	
	
	public static void main(String[] args) {
	LinkTextEg linktexteg = new LinkTextEg();
	linktexteg.initialiseBrowser();
	linktexteg.verifyTwoInputField();
	linktexteg.browserQuit();
	}
	}

