package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect extends Base{
	public void multiSelect() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement twoInputField = driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select select = new Select(twoInputField);
		boolean isDropDownIsMultiSelect =select.isMultiple();//to check whether it is multi select
		select.selectByIndex(1);
		select.selectByIndex(2);
	}

	public static void main(String[] args) {
		MultiSelect multiselect = new MultiSelect();
		multiselect.initialiseBrowser();
		multiselect.multiSelect();
		multiselect.browserQuit();
		
		
		
	}

}
