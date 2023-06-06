package com.e2etests.automation.step_definitions;

import java.time.Duration;


import com.e2etests.automation.page_objects.FramePage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Setup;
import com.e2etests.automation.utils.Validations;
import com.e2etests.automation.utils.Wait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FrameStepDefinition {
	public FramePage framePage;
	public ConfigFileReader configFileReader;
    public  Wait wait;
    public SeleniumUtils utils;
    public Validations validations;
    
	public FrameStepDefinition() {
		framePage = new FramePage();
		configFileReader = new ConfigFileReader();
		utils = new SeleniumUtils();
		wait= new Wait( Setup.getDriver());
		validations= new Validations();
	}



	
	@Given("I am on the homepage {string}")
	public void iAmOnTheHomepage(String url) {
		utils.get(configFileReader.getProperties("home.url.frame"));
	}
	@When("I switch to the frame")
	public void iSwitchToTheFrame() {
	  utils.switchToNewWindow(Setup.getDriver(),configFileReader.getProperties("home.iframeId"));
	  
	}
	@When("I click on the image")
	public void iClickOnTheImage() {
		wait.forPresenceOfElements(Duration.ofSeconds(30),framePage.img,configFileReader.getProperties("home.linkImg"));
		utils.clickOnElementUsingActions(framePage.linkImg);
	 
	}
	@Then("I switch to the new window")
	public void iSwitchToTheNewWindow() {
     utils.switchToNextWindow();
     
	  
	}
	@Then("I verify the title of the new window is {string}")
	public void iVerifyTheTitleOfTheNewWindowIs(String string) {
		validations.assertWindowTitle(Setup.getDriver().getTitle());
	 
	}




}
