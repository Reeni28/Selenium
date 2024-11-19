package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public void initializeBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
		
		
	}
	public void quitClose()
	{
		driver.close();//closing current page only
		driver.quit();//all pages closes
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b=new Base();
		b.initializeBrowser();
		b.quitClose();
    
	}

}
