package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	public void verifySingleInputField() {
		String enterValue ="Hello";
		String textConcat ="Your Message :";
		String expectedValue = textConcat.concat(" ").concat( enterValue);
		WebElement singleInputTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputTextField.sendKeys(enterValue);
		String actualValue = singleInputTextField.getAttribute("value");
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		WebElement showMessageColon = driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourmessage = showMessageColon.getText();
	
		if (expectedValue.equals(yourmessage))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
			}
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
		
	public void verifybackgroundcolourofShowMesssageButton() {
		String expectedcolour= "rgba(0, 123, 255, 1)";
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String backgroundColor = showMessageButton.getCssValue("background-color");
		if (backgroundColor.equals(expectedcolour))
		{
			System.out.println("Test passed");
		}
		else
	    {
		System.out.println("Test Failed");
	}
	}
	public void verifyfontweightofShowMessageButton() {
		String expectedfontweight ="400";
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String fontweight =showMessageButton.getCssValue("font-weight");
		
		if (fontweight.equals(expectedfontweight))
		{
			System.out.println("Test passed");
		}
		else
	    {
		System.out.println("Test Failed");
	}
	}
	public void webElementCommands() {
		String expectedcolour= "rgba(0, 123, 255, 1)";
		String expectedBorderColor = "rgba(0, 123, 255, 1)";
		String expectedfontcolor = "rgba(255, 255, 255, 1)";
		String expectedfontweight ="400";
		WebElement singleInputTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputTextField.sendKeys("Hello");
		singleInputTextField.clear();// to clear value given in text field
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		boolean isShowMessageButtonEnabled = showMessageButton.isEnabled();//if this is true button is enabled else disabled
		boolean isShowMessageDisplayed = showMessageButton.isDisplayed();//check if button is displayed
		WebElement showMessageColon = driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourmessage = showMessageColon.getText();
		
		String attribute = showMessageButton.getAttribute("type");
		String attribute1 = showMessageButton.getAttribute("class");
		String attribute2 = showMessageButton.getAttribute("id");
		String attribute3 = showMessageButton.getAttribute("fdprocessedid");
		String tagname = showMessageButton.getTagName();//to get tag name of element
		
		String backgroundcolor = showMessageButton.getCssValue("background-color");
		String bordercolor =showMessageButton.getCssValue("border-color");
		String fontcolor = showMessageButton.getCssValue("color");
		String fontweight =showMessageButton.getCssValue("font-weight");
		String borderradius = showMessageButton.getCssValue("border-radius");
	}

	public static void main(String[] args) {
		WebElementCommands webelementcommands = new WebElementCommands();
		webelementcommands.initialiseBrowser();
		webelementcommands.verifySingleInputField();
		webelementcommands.verifyTwoInputField();
		webelementcommands.webElementCommands();
		webelementcommands.verifybackgroundcolourofShowMesssageButton();
		webelementcommands.verifyfontweightofShowMessageButton();
		webelementcommands.browserQuit();
	}

}
