package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox extends Base{
	
	public void newcheckbox()
	{
    WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));	
	inputform.click();
	WebElement checkbox=driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));	
	checkbox.click();
	WebElement checkboxtick=driver.findElement(By.id("gridCheck"));	
	checkboxtick.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkbox check=new Checkbox();
		check.initializeBrowser();
		check.newcheckbox();

	}

}
