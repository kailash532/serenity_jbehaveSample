package sf.psta.test.bdd.scenarios;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;

import net.thucydides.core.annotations.Steps;
import sf.psta.test.bdd.steps.FirstScreenPageSteps;

public class SampleTestStory{
	
	@Steps
	FirstScreenPageSteps firstscreenpagesteps;
	
	@Given("User Launch the App")
	public void givenIWantToLaunchTHenApp(){
		String state=System.getProperty("state").toString();
		System.out.println(state);
		firstscreenpagesteps.launchApp();
	}
	
	
	
	@Then("$title should display")
	@Alias("$title must display")
	public void titleShouldDisplay(String title,String username,String password){
		firstscreenpagesteps.VerifyTitle(title,username,password);
		
	}
}
