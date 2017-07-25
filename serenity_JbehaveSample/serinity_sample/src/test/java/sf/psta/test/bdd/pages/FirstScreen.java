package sf.psta.test.bdd.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBys;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com")
public class FirstScreen extends PageObject{
	
	WebDriver driver;
	
	@FindBy(id="class")
	private WebElementFacade classname;
	
	
	
	public FirstScreen(final WebDriver driver){
		super(driver);
		this.driver=driver;
	}
	
	public void openPage(){
		this.open();
	}
	public void setClass(String claname){
		element(classname).type(claname).sendKeys(Keys.TAB);
		
	}
	
	public String getTitle(){
		return driver.getTitle();
		
		
	}

}
