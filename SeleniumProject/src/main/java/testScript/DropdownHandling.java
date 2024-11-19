package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling extends Base{
	
	public void dropdownlist()
	{
		
		//WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));	
		//inputform.click();
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		
		Select select=new Select(dropdown);
		//select.selectByVisibleText("Red");
		//select.selectByValue("Yellow");
		select.selectByIndex(3);
		
	}
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DropdownHandling drop=new DropdownHandling();
		drop.initializeBrowser();
		drop.dropdownlist();
		

	}

}
