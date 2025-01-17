package testscript;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void locators() {
		
				
		//using id
		WebElement showmessage = driver.findElement(By.id("button-one"));
		WebElement showMessage1 = driver.findElement(By.id("alert-modal"));
		WebElement showMessage2 = driver.findElement(By.id("progress-bars"));
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement showMessage3 = driver.findElement(By.id("list0box"));
		driver.navigate().back();
		
		// using class 
		WebElement sampleClassName = driver.findElement(By.className("clearfix"));
		WebElement sampleClassName2 = driver.findElement(By.className("mb-sec"));
		WebElement sampleClassName3 = driver.findElement(By.className("top-logo"));
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement sampleClassName4 = driver.findElement(By.className("mt-5"));
		driver.navigate().back();
		
		//using by name 
		WebElement nameSample = driver.findElement(By.name("viewport"));
		WebElement sampleName1 = driver.findElement(By.name("description"));
		WebElement sampleName2 = driver.findElement(By.name("keywords"));
		WebElement sampleName3 = driver.findElement(By.name("author"));
		
		// using linktext
		WebElement linkTextSample = driver.findElement(By.linkText("Checkbox Demo"));
		WebElement linkTextSample4 = driver.findElement(By.linkText("Select Input"));
		WebElement linkTextSample3 = driver.findElement(By.linkText("Simple Form Demo"));
		WebElement linkTextSample2 = driver.findElement(By.linkText("Radio Buttons Demo"));
		
		// using partial link text
		WebElement partialLinkText = driver.findElement(By.partialLinkText("Checkbox"));
		WebElement partialLinkTextSample4 = driver.findElement(By.partialLinkText("Ajax Form"));
		WebElement partialLinkTextSample3 = driver.findElement(By.partialLinkText("Form Demo"));
		WebElement partialLinkTextSample2 = driver.findElement(By.partialLinkText("Radio Buttons"));
		
		
		//using css selector	classname(.)	
		
		WebElement className =driver.findElement(By.cssSelector(".clearfix"));
		WebElement className1 =driver.findElement(By.cssSelector(".header-top"));
		WebElement className2 =driver.findElement(By.cssSelector(".mb-sec"));
		WebElement className3 =driver.findElement(By.cssSelector(".top-logo"));
		
		// css using id (#)
		WebElement idName1 =driver.findElement(By.cssSelector("#progress-bars"));
		WebElement idName2 =driver.findElement(By.cssSelector("#list0box"));
		WebElement idName3 =driver.findElement(By.cssSelector("#alert-modal"));
		
		
		
		//tag and class
		WebElement classNameTag = driver.findElement(By.cssSelector("section.clearfix"));
		WebElement classNameTag1 = driver.findElement(By.cssSelector("div.mb-sec"));
		WebElement classNameTag2= driver.findElement(By.cssSelector("div.top-logo"));
		WebElement classNameTag3 = driver.findElement(By.cssSelector("div.header-top"));
		
		
		
		//tag and id
		WebElement showmessageTagName = driver.findElement(By.cssSelector("button#button-one"));
		WebElement showmessageTagName1 = driver.findElement(By.cssSelector("a#progress-bars"));
		WebElement showmessageTagName2 = driver.findElement(By.cssSelector("a#alert-modal"));
		WebElement showmessageTagName3= driver.findElement(By.cssSelector("div#message-two"));
		
		//css using attribute tagname[attribute = 'value']
		WebElement atrributeValue = driver.findElement(By.cssSelector("Link[href='css/main.css']"));
		WebElement atrributeValue1 = driver.findElement(By.cssSelector("a[href='check-box-demo.php']"));
		WebElement atrributeValue2 = driver.findElement(By.cssSelector("a[href='form-submit.php']"));
		WebElement atrributeValue3 = driver.findElement(By.cssSelector("a[href='ajax-form-submit.php']"));
		
		WebElement tagNamesample = driver.findElement(By.tagName("div"));
		
		
		//using xpath
		WebElement samplXpath = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement sampleXpath1 = driver.findElement(By.xpath("//button[@id='button-two']"));
		driver.navigate().to("https://selenium.qabible.in/jquery-progress-bar.php");// to go to other web page
		WebElement sampleXpath2 = driver.findElement(By.xpath("//button[@id='downloadButton']"));
		driver.navigate().back();
		driver.navigate().to("https://selenium.qabible.in/bootstrap-dual-list.php");
		WebElement sampleXpath3 = driver.findElement(By.xpath("//button[@type='submit']"));
		driver.navigate().back();
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement sampleXpath4 = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement sampleXpath5 = driver.findElement(By.xpath("//button[@id='button-two']"));
		driver.navigate().back();
		
		//xpath contains
		WebElement sampleXpath6 = driver.findElement(By.xpath("//button[contains(@id,'button-o')]"));
		WebElement sampleXpath7 = driver.findElement(By.xpath("//button[contains(@id,'button-t')]"));
		WebElement sampleXpath8 = driver.findElement(By.xpath("//a[contains(@id,'progress-b')]"));
		WebElement sampleXpath9 = driver.findElement(By.xpath("//a[contains(@id,'alert-m')]"));
		
		//xpath startswith
		WebElement sampleXpathStart = driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
		WebElement sampleXpathStart1 = driver.findElement(By.xpath("//input[starts-with(@id,'value')]"));
		WebElement sampleXpathStart2 = driver.findElement(By.xpath("//div[starts-with(@id,'message')]"));
		
		//xpath text
		WebElement textXpath = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement textXpath1 = driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement textXpath2 = driver.findElement(By.xpath("//a[text()='Form Submit']"));
		
		//xpath and 
		WebElement andXpath = driver.findElement(By.xpath("//button[text()='Show Message' and @ id= 'button-one' ]"));
		WebElement andXpath1 = driver.findElement(By.xpath("//button[@type='button' and @id='button-two' ]"));
		WebElement andXpath2 = driver.findElement(By.xpath("//input[@type='text' and @id='value-a' ]"));
		
		//xpath or
		WebElement orXpath = driver.findElement(By.xpath("//button[text()='Show Message' or @ id= 'button-one']"));
		WebElement orXpath1 = driver.findElement(By.xpath("//button[@type='button' or @id='button-two']"));
		WebElement orXpath2 = driver.findElement(By.xpath("//input[@id='single-input-field' or @placeholder='Message']"));
		
		//xpath//parent::tagname of parent
		WebElement sampleXpathParent = driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
		WebElement sampleXpathParent1 = driver.findElement(By.xpath("//label[@for='inputEmail4']//parent::div"));
		WebElement sampleXpathParent2 = driver.findElement(By.xpath("//button[@id='button-two']//parent::form"));
		WebElement sampleXpathParent3 = driver.findElement(By.xpath("//input[@id='value-a']//parent::div"));
		
		//xpath child
		WebElement sampleXpathChild = driver.findElement(By.xpath("//section[@class='clearfix']//child::div[@class='container page']"));
		WebElement sampleXpathChild1 = driver.findElement(By.xpath("//li[@class='list-group-item']//child::a[@href='simple-form-demo.php']"));
		WebElement sampleXpathChild2 = driver.findElement(By.xpath("//div[@class='mb-sec']//child::div[@class='container']"));
		WebElement sampleXpathChild4 = driver.findElement(By.xpath("//div[@class='form-group']//child::input[@id='single-input-field']"));
		
		//xpath following
		WebElement sampleXpathFollowing = driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));
		WebElement sampleXpathFollowing1 = driver.findElement(By.xpath("//input[@class='form-control']//following::button[@id='button-one']"));
		WebElement sampleXpathFollowing2 = driver.findElement(By.xpath("//input[@class='form-control']//following::button[@id='button-two']"));
		WebElement sampleXpathFollowing3 = driver.findElement(By.xpath("//div[@class='card-header']//following::input[@id='single-input-field']"));
		
		//xpath preceding
		WebElement sampleXpathPreceding = driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='header-top']"));
		WebElement sampleXpathPreceding1 = driver.findElement(By.xpath("//div[@id='message-one']//preceding::input"));
		WebElement sampleXpathPreceding2 = driver.findElement(By.xpath("//div[@id='message-one']//preceding::button[@id='button-one']"));
		WebElement sampleXpathPreceding3 = driver.findElement(By.xpath("//button[@id='button-two']//preceding::input[@id='value-a']"));
		
		//xpath ancestor
		WebElement sampleXpathAncestor = driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='container page']"));
		WebElement sampleXpathAncestor1 = driver.findElement(By.xpath("//button[@id='button-two']//ancestor::div[@class='card']"));
		WebElement sampleXpathAncestor2= driver.findElement(By.xpath("//input[@class='form-control']//ancestor::div[@class='row']"));
		WebElement sampleXpathAncestor3= driver.findElement(By.xpath("//li[@class='list-group-item']//ancestor::ul"));
		
		//xpath descendant
		WebElement sampleXpathDescendant = driver.findElement(By.xpath("//section[@class='clearfix']//descendant::div[@class='container page']"));
		WebElement sampleXpathDescendant1 = driver.findElement(By.xpath("//div[@class='header-top']//descendant::div[@class='top-logo']"));
		WebElement sampleXpathDescendant2 = driver.findElement(By.xpath("//ul[@class='navbar-nav']//descendant::a[@href='index.php']"));
		WebElement sampleXpathDescendant3 = driver.findElement(By.xpath("//div[@class='mb-sec']//descendant::div[@class='row']"));
		
		//xpath //following::sibling
		WebElement sampleXpathFollowingSibling = driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div"));
		WebElement sampleXpathFollowingSibling1 = driver.findElement(By.xpath("//button[@id='button-two']//following-sibling::div"));
		WebElement sampleXpathFollowingSibling2= driver.findElement(By.xpath("//div[@class='form-group']//following-sibling::button[@id='button-two']"));
		WebElement sampleXpathFollowingSibling3= driver.findElement(By.xpath("//div[@class='header-top']//following-sibling::div[@class='mb-sec']"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		Locators webelementcommands = new Locators();
		webelementcommands.initialiseBrowser();
		webelementcommands.locators();
		webelementcommands.browserQuit();
		

	}

}
