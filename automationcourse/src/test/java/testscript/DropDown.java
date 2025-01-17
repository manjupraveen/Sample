package testscript;

import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base {
	public void verifySelectInputDropDown() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selectDropDown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(selectDropDown);
		select.selectByValue("Red");
		select.selectByVisibleText("Yellow");
		select.selectByIndex(3);
	
	    List <WebElement> options = select.getOptions();
	    int numberofOptions = options.size();
	}
	public void verifyLanguageDropdown () {
		driver.navigate().to("https://www.selenium.dev/");
		WebElement languagedropDown = driver.findElement(By.xpath("//div[@class=\"dropdown\" ]//child::a[@role='button']"));
		languagedropDown.click();
		List<WebElement> dropdownOptions =driver.findElements(By.xpath("//div[@class='dropdown']//child::a[@class='dropdown-item']"));
		for(WebElement option:dropdownOptions) {
			String languageName =option.getText();
			if(languageName.equals("Português (Brasileiro)")) {
				option.click();
				break;
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		DropDown dropdown = new DropDown();
		dropdown.initialiseBrowser();
		//dropdown.verifySelectInputDropDown();
		dropdown.verifyLanguageDropdown();
		dropdown.browserQuit();

	}

}
