package step_Files;




import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;


import cucumber.api.java8.En;
import util.ShortCode;
import util.TestBase;
import util.TestBaseExtends;


public class Step extends ShortCode implements En,TestBase, TestBaseExtends{
	
public void step1()	 { 
	Given("^I Navigate to webpage\"([^\"]*)\"$" , (String webPage) -> {
		
	log.debug("Open Webpage "+webPage); 
	//get webpage
	Browser.driver.get(webPage);
	
	log.debug("Take screen shot before updating ");
	
		
});

}



public void step2()	{
	
	When("^I update current score to (\\d+) and score goal to (\\d+)$",(Integer arg1, Integer arg2) ->  {
	
/** i didn't use  currentScore,  Scoregoal input but roughly set the scores */
		
		
		//get current score slider 
		WebElement slider1 = getObject("slider1path");
		
		     log.debug(" update current score to 50 ");
			//loop for update current score to 50
		  	for (int i = 1; i <= 330; i++) 
		  	  	{
		  	      slider1.sendKeys(Keys.ARROW_LEFT);
		        }
		  	
		  	
	  	//get scoregoal slider   	
	  	WebElement slider2 = getObject("slider2path");
	  		    
	  	
	  	      log.debug("update Scoregoal score to 680 ");
		     //update Scoregoal score to 680
		      	for (int i = 1; i <= 230; i++)
		      	{
		          slider2.sendKeys(Keys.ARROW_RIGHT);
		        }
		      	
		log.debug("Take screen shot afetr updating ");
		//Take screen shot afetr updating
		//Takeshot.takeScreenShot(Browser.driver,"D://updatedScreenshot1.png");
			

	
});
	
}


public void step3()	{

Then("^I check potential saving is (\\d+)$",(Integer EPS) -> {
	
	log.debug("get ActualPotencialSaving value  ");
	//get ActualPotencialSaving value 
	String ActualPotencialSaving=getObject("ActualPotencialSavingpath").getText();
			
	log.debug("print ActualPotencialSaving value  ");
	//print ActualPotencialSaving value 
	println(ActualPotencialSaving);
	
	            log.debug("check potential saving Actual and Expected value");
	            // check potential saving Actual and Expected value
				if (ActualPotencialSaving.equals(EPS))
				{
					log.debug("print if ActualPotencialSaving and ExpectedP_saving are match"+ ActualPotencialSaving+"384");
					//print if ActualPotencialSaving and ExpectedP_saving are match
					println("ActualPotencialSaving and ExpectedP_savings are match"); 	
					
				}else
				    {
					log.debug("print if ActualPotencialSaving and ExpectedP_saving are not  match"+ ActualPotencialSaving+"384");
					//print if ActualPotencialSaving and ExpectedP_saving are not match
					println("ActualPotencialSaving and ExpectedP_savings are not match"); 	
				     }
	    
	
	
});




}}
