package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AlerterPage {
	
	public ConfigFileReader configFileReader;
	public AlerterPage alertPage;

	/* Retrieve Element */

	@FindBy(how = How.ID, using = "alertButton")
	public static WebElement btnAlert;

	public AlerterPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}
	
}

