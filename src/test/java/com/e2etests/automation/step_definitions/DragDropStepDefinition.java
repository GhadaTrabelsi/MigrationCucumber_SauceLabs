package com.e2etests.automation.step_definitions;


import com.e2etests.automation.page_objects.DragDropPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Setup;
import com.e2etests.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DragDropStepDefinition {
	
	public DragDropPage dragdropPage;
	public ConfigFileReader configFileReader;
    public SeleniumUtils utils;
    public Validations validation;
    
    
	public DragDropStepDefinition() {
		dragdropPage = new DragDropPage();
		configFileReader = new ConfigFileReader();
		utils = new SeleniumUtils();
		validation = new Validations();

	}
	

	@Given("Je me connecte sur l application Drag and Drop")
	public void jeMeConnecteSurLApplicationDragAndDrop() {
		utils.get(configFileReader.getProperties("home.url.dragdrop"));
	    
	}
	@When("je fais glisser et depose lelement")
	public void jeFaisGlisserEtDeposeLelement() {
	   utils.dragAndDrop(Setup.getDriver(), dragdropPage.from, dragdropPage.to);
	}
	
	
	@Then("le texte de lemplacement de  destination doit être {string}")
	public void leTexteDeLemplacementDeDestinationDoitÊtre(String txt) {
		dragdropPage.to.getText();
		validation.assertTrue(dragdropPage.to,txt);
		
		
		
	}




}
