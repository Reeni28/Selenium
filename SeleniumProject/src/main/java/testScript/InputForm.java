package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputForm extends Base{
	
	public void showmessage()
	{
		WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		
		inputform.click();
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("Hello");
		
		WebElement buttonOne=driver.findElement(By.id("button-one"));
		buttonOne.click();
		
	  WebElement valueA=driver.findElement(By.id("value-a"));
	  valueA.sendKeys("2");
	  
	  WebElement valueB=driver.findElement(By.id("value-b"));
	  valueB.sendKeys("5");
	  
	  WebElement buttonTwo=driver.findElement(By.id("button-two"));
		buttonTwo.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputForm input=new InputForm();
		input.initializeBrowser();
		input.showmessage();
		

	}

}
