package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass extends Base {
	public void actionsClass() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement draggable1 = driver.findElement(By.xpath("//span[text() ='Draggable n°1']"));
		WebElement dottedBox = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(draggable1).build().perform();// mouse hovering
		actions.doubleClick(draggable1).perform();// double click
		actions.contextClick(draggable1).perform();// right click
		actions.dragAndDrop(draggable1, dottedBox).build().perform();// drag and drop option
		
		
		
	}

	public static void main(String[] args) {
		ActionClass actionClass = new ActionClass();
		actionClass.initialiseBrowser();
		actionClass.actionsClass();
		actionClass.browserQuit();
		
	}

}
