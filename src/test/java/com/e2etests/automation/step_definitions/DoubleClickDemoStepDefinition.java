package com.e2etests.automation.step_definitions;


import com.e2etests.automation.page_objects.DoubleClickDemoPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DoubleClickDemoStepDefinition {
	
	public DoubleClickDemoPage doubleclickdemoPage;
	public ConfigFileReader configFileReader;
public Validations validations;
public SeleniumUtils utils;

	public DoubleClickDemoStepDefinition() {
		doubleclickdemoPage = new DoubleClickDemoPage();
		configFileReader = new ConfigFileReader();
		utils = new SeleniumUtils();
		validations = new Validations();
	}

	@Given("Je me connecte sur l application DoubleClick Demo")
	public void jeMeConnecteSurLApplicationDoubleClickDemo() {
		utils.get(configFileReader.getProperties("home.url.doubleclickdemo"));
	}
	
	@When("je fais double click sur le bouton")
	public void jeFaisDoubleClickSurLeBouton() {
		utils.doubleclickOnElementUsingActionsWebElement(DoubleClickDemoPage.btnDC);
	  
	}
	@Then("un message saffiche  {string}")
	public void unMessageSaffiche(String msg) {
		
		validations.assertTrue(DoubleClickDemoPage.msgDoubleClick, msg);
	}




}
