package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxandRadioButton extends Base {
	public void checkBoxDemo() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkboxButton = driver.findElement(By.xpath("//input[@class='form-check-input']"));
		checkboxButton.click();
		boolean isCheckBoxSelected = checkboxButton.isSelected();
	}
	public void verifyMaleRadioButton() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		String expectedMessage = "Radio button 'Male' is checked";
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean isMaleRadioButtonSelected = maleRadioButton.isSelected();
		boolean isFemaleRadioButtonSelected = femaleRadioButton.isSelected();
		maleRadioButton.click();
		boolean isMaleRadioButtonSelected1 = maleRadioButton.isSelected();
		WebElement showSelectedValueButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValueButton.click();
		WebElement successMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualMessage = successMessage.getText();
		if(expectedMessage.equals(actualMessage)) {
			System.out.println("Radio button male is checked");
		}
		else {
			System.out.println("Test failed");
		}
	}
	public static void main(String[] args) {
		CheckboxandRadioButton checkboxandradiobuttom = new CheckboxandRadioButton();
		checkboxandradiobuttom.initialiseBrowser();
		checkboxandradiobuttom.checkBoxDemo();
		checkboxandradiobuttom.verifyMaleRadioButton();
		checkboxandradiobuttom.browserQuit();

	}

}
