package sf.psta.test.bdd.steps;


import org.junit.*;

import com.google.common.base.Verify;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import sf.psta.test.bdd.pages.FirstScreen;

public class FirstScreenPageSteps extends ScenarioSteps{
	
	FirstScreen firstscreen;
	
	@Step
	public void launchApp(){
		firstscreen.openPage();
	}
	
	@Step
	public void VerifyTitle(String title,String username,String Password){
		firstscreen.getTitle();
		Assert.assertEquals(title, firstscreen.getTitle());
				 
	}
	

}
