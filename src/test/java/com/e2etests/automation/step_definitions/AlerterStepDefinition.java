package com.e2etests.automation.step_definitions;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.page_objects.AlerterPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlerterStepDefinition {
	
	
	
	
	public AlerterPage alertPage;
	public ConfigFileReader configFileReader;
    public  WebDriverWait wait;

public SeleniumUtils utils;
	public AlerterStepDefinition() {
		alertPage = new AlerterPage();
		configFileReader = new ConfigFileReader();
		utils = new SeleniumUtils();
	}

	@Given("Je me connecte sur l application")
	public void jeMeConnecteSurLApplication()   {
		
		utils.get(configFileReader.getProperties("home.url.alert"));
  
	}
	@When("Je clique sur le bouton Click me")
	public void jeCliqueSurLeBoutonClickMe() {
		
		utils.click(AlerterPage.btnAlert);

	   
	}
	@Then("Une alerte est affiche")
	public void uneAlerteEstAffiche() {
		utils.getAlertText();

	}
	@Then("Jaccepte lalerte")
	public void jaccepteLalerte() {
		utils.acceptAlert();

	  
	}



	
	
	
	

}
