package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	
	public void idLocator()
	{
		
		//Syntax=> WebElement Elementname=driver.findElement(By.Locatorname("value"));
		WebElement message=driver.findElement(By.id("single-input-field"));
		WebElement button=driver.findElement(By.id("button-two"));
		WebElement text=driver.findElement(By.id("value-a"));
		WebElement date=driver.findElement(By.id("single-input-field"));
		WebElement buttonone=driver.findElement(By.id("button-one"));
	}
		
		
		public void classLocator()
		{
			
			WebElement section=driver.findElement(By.className("clearfix"));
			WebElement sectionsample=driver.findElement(By.className("card-header"));
			
			
	
	}
		public void nameLocator()
		{
			
			WebElement view=driver.findElement(By.name("viewport"));
			WebElement viewsample=driver.findElement(By.name("description"));
	
	}
		public void linktextLocator()
		{
			 //href
			
			WebElement linkinputform=driver.findElement(By.linkText("simple-form-demo.php"));
			WebElement linkinputsample=driver.findElement(By.linkText("table-sort-search.php"));
	
	}
		public void partiallinktextLocator()
		{
			
			WebElement partiallinkinputform=driver.findElement(By.partialLinkText("simple-form"));
			WebElement partiallinkinputformsample=driver.findElement(By.partialLinkText("table-sort"));
	
	}
		public void csstagid()
		{
			//tag#id
			WebElement css=driver.findElement(By.cssSelector("input#single-input-field"));
			WebElement csssample=driver.findElement(By.cssSelector("button#button-one"));
			
		}
		public void csstagattribute()
		
		{
			//tag[attributetype=value]
		
			WebElement csstag=driver.findElement(By.cssSelector("input[id=single-input-field]"));
			WebElement csstagsample=driver.findElement(By.cssSelector("button[id=button-one]"));
			
		}
        public void csstagclass()
		
		{
			//tag.class
		
			WebElement cssclass=driver.findElement(By.cssSelector("input.ul.navbar-nav"));
			

			WebElement cssclasssample=driver.findElement(By.cssSelector("div.card-header"));
		}
        
      public void csstagclassattribute()
		
		{
        //tag.classname[attribute=value]
    	  WebElement cssattribute=driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
		
    	  WebElement cssattributesample=driver.findElement(By.cssSelector("input.form-control[id=value-a]"));
		
		
		}
      
      
      public void xpath()
      {
    	  //absolute xpath
    	  WebElement xpath=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
    	 
    	  //relative xpath syntax://tagname[@attributetype='attributevalue']
    	  
    	  WebElement relativexpath=driver.findElement(By.xpath("//input[@id='single-input-field']"));
    	  WebElement relativexpathsampleone=driver.findElement(By.xpath("//input[@id='value-a']"));
    	  WebElement relativexpathsampletwo=driver.findElement(By.xpath("//input[@id='value-b']"));
    	  
    	  
    	  //dynamic xpath contains method syntax://tagname[contains(@attributetype,'value')]
    	  WebElement dynamicxpath=driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
    	  
    	  //dynamic xpath text method syntax://tagname[text()='value']
    	  WebElement textxpath=driver.findElement(By.xpath("//button[text()='Show Message']"));
    	  
    	//axes method xpath syntax://tagname[@attributetype='attributevalue']:://parent.div
    	    	  
    	
    	  WebElement FormGroup=driver.findElement(By.xpath("//input[@class='form-control']//parent::div"));
    	
    	  //axes method xpath syntax://tagname[@attributetype='attributevalue']://child.div
    	  
    	  WebElement Formchild=driver.findElement(By.xpath("a[@href='index.php']//child::img[@alt='logo'"));
    	  
    	
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		

	}

}
