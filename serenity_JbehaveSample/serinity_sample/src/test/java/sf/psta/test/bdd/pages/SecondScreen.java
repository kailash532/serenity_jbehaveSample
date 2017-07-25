package sf.psta.test.bdd.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SecondScreen extends PageObject{
	
	WebDriver driver;
	
	@FindBy(id="class")
	private WebElementFacade classname2;
	

	
	
	
	public void setClass(String claname){
		element(classname2).type(claname).sendKeys(Keys.TAB);
		
	}

}
