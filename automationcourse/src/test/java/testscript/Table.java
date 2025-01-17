package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table extends Base {
	public void verifyNameinTable() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//WebElement tableName = driver.findElement(By.xpath("//table[@id='dtBasicExample']//child::th[ @class='th-sm sorting_disabled' and @ style='width: 77.6px;']"));
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

	public static void main(String[] args) {
		Table table = new Table();
		table.initialiseBrowser();
		table.verifyNameinTable();
		table.browserQuit();
		

	}

}
