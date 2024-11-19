package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{
	
	public void simpleAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alertsimple=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		alertsimple.click();
		driver.switchTo().alert().accept();
		
	}

	public void confirmationAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alertsimple=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		alertsimple.click();
		driver.switchTo().alert().dismiss();
	}
	public void promptAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alertsimple=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		alertsimple.click();
		driver.switchTo().alert().sendKeys("Reeni");
		driver.switchTo().alert().accept();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlertHandling handling=new AlertHandling();
		handling.initializeBrowser();
		//handling.simpleAlert();
		//handling.confirmationAlert();
		handling.promptAlert();

	}

}
