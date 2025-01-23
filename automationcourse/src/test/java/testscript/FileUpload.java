package testscript;

import java.net.http.WebSocket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	public void fileUploadUsingSendKeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		chooseFile.click();
	}
	public void fileUploadUsingRobotClass() {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectpdffile = driver.findElement(By.xpath("//a[@id='pickfiles']"));
		selectpdffile.click();
	}

	public static void main(String[] args) {
		FileUpload fileupload = new FileUpload();
		fileupload.initialiseBrowser();
		//fileupload.fileUploadUsingSendKeys();
		fileupload.fileUploadUsingRobotClass();
		fileupload.browserQuit();
		

	}

}
