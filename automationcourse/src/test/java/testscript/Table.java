package testscript;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table extends Base {
	public void verifyNameinTable() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> nameTable =driver.findElements(By.xpath("//tr[@class='odd' or @ class='even']//child::td[text ()='Tiger Nixon' or text ()='Garrett Winters' or text()='Ashton Cox' or text ()='Cedric Kelly'or text()='Airi Satou' or text()= 'Brielle Williamson' or text ()='Herrod Chandler'or text() ='Rhona Davidson' or text ()='Colleen Hurst' or text()='Sonya Frost']"));
		for(WebElement names:nameTable) {
			String name =names.getText();
			if(name.equals("Ashton Cox"))
			{
				System.out.println("Ashton Cox is in name table");
				break;
			}
		}
	}
	public void verifyNameinTable1() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> nameTable1 = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		for(WebElement names1:nameTable1) {
			String name1 =names1.getText();
			if(name1.equals("Cedric Kelly"))
			{
				System.out.println("Cedric Kelly is in name table");
				break;
			}
		}
	}
		public void verifyTableHeader( ) 
		{
			driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
			List<String> expectedcolumnheading = new ArrayList<>(List.of("Name", "Position", "Office", "Age", "Start date", "Salary"));
			List<String> actualColumnHeading = new ArrayList<String> ();
			List<WebElement> tablerow = driver.findElements(By.xpath("//tr[@role='row']//th"));
		
			for(WebElement columnnheading:tablerow) {
				//String s =columnnheading.getText();
				actualColumnHeading.add(columnnheading.getText());
				
				
			}
			if (expectedcolumnheading.equals(actualColumnHeading))
			{
				System.out.println("Table header verified");
			}
			else {
				System.out.println("Table header failed");
			}
		}
	

	public static void main(String[] args) {
		Table table = new Table();
		table.initialiseBrowser();
		//table.verifyNameinTable();
		table.verifyNameinTable1();
		//table.verifyTableHeader();
		table.browserQuit();
		

	}

	

}
