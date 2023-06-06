package com.e2etests.automation.step_definitions;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.page_objects.UploadFilePage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UploadFileStepDefinition {

	public UploadFilePage uploadFilePage;
	public ConfigFileReader configFileReader;
	public WebDriverWait wait;
    public SeleniumUtils utils;
    public Validations validation;
    
    public UploadFileStepDefinition() {
    	
    	uploadFilePage= new UploadFilePage();
    	utils= new SeleniumUtils();
		configFileReader= new ConfigFileReader();
		validation = new Validations();
    }

	@Given("I am on the upload page {string}")
	public void iAmOnTheUploadPage(String url) {
		utils.get(url);

	}

	@When("I upload the file {string}")
	public void iUploadTheFile(String link) {
	utils.writeTextE(uploadFilePage.uploadFile, link);
	

	}

	@When("I select the checkbox")
	public void iSelectTheCheckbox() {
		utils.click(uploadFilePage.checkBox);

	}

	@Then("I verify the checkbox is selected")
	public void iVerifyTheCheckboxIsSelected() {
		
validation.isElementSelected(uploadFilePage.checkBox);
	}

	@Then("I click the submit button")
	public void iClickTheSubmitButton() {
		utils.click(uploadFilePage.submitBtn);

	}

}
