package testscript;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void locators() {
		WebElement showmessage = driver.findElement(By.id("button-one"));//id
		WebElement sampleClassName = driver.findElement(By.className("clearfix"));// classname 
		WebElement nameSample = driver.findElement(By.name("viewport"));
		WebElement linkTextSample = driver.findElement(By.linkText("Checkbox Demo"));
		WebElement partialLinkText = driver.findElement(By.partialLinkText("Checkbox"));
		//WebElement sampleClassName1 = driver.findElement(By.className("container page"));compound class name not permitted
		WebElement sampleClassName2 = driver.findElement(By.className("mb-sec"));
		WebElement sampleClassName3 = driver.findElement(By.className("top-logo"));
		//WebElement sampleClassName4 = driver.findElement(By.className("list-group list-group-flush"));compound class name not permitted
		WebElement nameSample1 = driver.findElement(By.name("description"));
		WebElement nameSample2 = driver.findElement(By.name("keywords"));
		WebElement namesample3 = driver.findElement(By.name("author"));
		//WebElement linkTextSample1 = driver.findElement(By.linkText("images/favicon.ico")); no such element
		//WebElement linkTextSample2 = driver.findElement(By.linkText("https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"));
		//WebElement linkTextSample3 = driver.findElement(By.linkText("css/main.css"));
		WebElement showMessage1 = driver.findElement(By.id("button-two"));
		//WebElement showMessage2 = driver.findElement(By.id(""));
		WebElement className =driver.findElement(By.cssSelector(".clearfix"));// css selector
		WebElement classNameTag = driver.findElement(By.cssSelector("section.clearfix"));// with tag name and classname
		WebElement showmessageTagName = driver.findElement(By.cssSelector("button#button-one"));//id with tagname
		WebElement atrributeValue = driver.findElement(By.cssSelector("Link[href='css/main.css']"));
		WebElement tagNamesample = driver.findElement(By.tagName("div"));
		WebElement samplXpath = driver.findElement(By.xpath("//[button@id='button-one']"));
		WebElement sampleXpath1 = driver.findElement(By.xpath("//button[@id='button-two']"));
		
		
		
		
	}

	public static void main(String[] args) {
		WebElementCommands webelementcommands = new WebElementCommands();
		webelementcommands.initialiseBrowser();
		webelementcommands.locators();
		webelementcommands.browserQuit();
		

	}

}
