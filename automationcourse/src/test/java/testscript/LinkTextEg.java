package testscript;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LinkTextEg extends Base{
	public void verifyDropDown() {
		String expectedSelect = "Red";
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdownSelect = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(dropdownSelect);
		select.selectByIndex(1);
		WebElement selectColourText = driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualMessage = selectColourText.getText();
		String actualSelect = actualMessage.substring(17);
		if (expectedSelect.equals(actualSelect))
		{
			System.out.println("single dropdown verified");
		}
		
	}
	public void dropdown1() {
		driver.navigate().to("https://www.amazon.in/FabAlley-Womens-Georgette-Overlap-DRS05201/dp/B0BL3TWY1J/ref=sr_1_2?dib=eyJ2IjoiMSJ9.SRkQHxHcuBWYXSg50H9Ew72MFMBoGX479D32s1g3EWiJhg0dWwMHDWCTYaYoxgm_wG2Pp7FRivnB5VjosZrHIODb8hmqF2bSm32MIIykhqxueBDcVHsxU1RK9y3i20L22a4l_aKFQck5gXtGeEr4c0QbS6AXC85GMs7T9_fKeEThxdZhm3wZbWnsr6pHfUY0xpsu1HIyEDirLCqFhYjX_OXLCthePetDf8XoGbxzTSQqst5ek2HVPIkVcUSFntfoiXaO1liAACZuFZwInlPcG8Umh0zbzNL3GumG8yv-4r2kr8Z-0AE8SGrWWiPLM9wIT2eHy1P8iTbE3A_CEocv88jC7SWMwMaMO7ks9iT4cbf3GQ3f89m25FkUGAABc48QB-HY4N8MoZLFSOm5gizq4IweH1Y7vNKwLmAVCLzSiB4C21XUSdFC0kXKlbMcDKPr.HLYRfqUWM7enOlhRHfVf09ny6-YXBBZJfP4GvMQmkec&dib_tag=se&keywords=faballey&nsdOptOutParam=true&pf_rd_i=1968445031&pf_rd_m=A1VBAL9TL5WCBF&pf_rd_p=96cfa346-2387-4899-ac77-06013a7646ef&pf_rd_r=YD1MAX4ZDV6SRR8W6VBE&pf_rd_s=merchandised-search-6&qid=1737423865&refinements=p_85%3A10440599031%2Cp_89%3AFabAlley%2Cp_n_pct-off-with-tax%3A27060456031&rnid=2665398031&rps=1&s=apparel&sr=1-2");
		WebElement sizeSelect = driver.findElement(By.xpath("//select[@name='dropdown_selected_size_name']"));
		Select select = new Select(sizeSelect);
		select.selectByVisibleText(" L ");
		WebElement addtoCartButton = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addtoCartButton.click();
		
		
	}
	
	
	

	
	
	
	public static void main(String[] args) {
	LinkTextEg linktexteg = new LinkTextEg();
	linktexteg.initialiseBrowser();
	linktexteg.dropdown1();
	linktexteg.browserQuit();
	}
	}

