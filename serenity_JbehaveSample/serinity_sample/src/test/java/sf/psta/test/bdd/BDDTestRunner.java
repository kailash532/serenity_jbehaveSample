package sf.psta.test.bdd;

import net.serenitybdd.jbehave.SerenityStories;


public class BDDTestRunner extends SerenityStories{
	
	public BDDTestRunner(){
		
		findStoriesCalled("**/stories/Sample.story");
	}
}
