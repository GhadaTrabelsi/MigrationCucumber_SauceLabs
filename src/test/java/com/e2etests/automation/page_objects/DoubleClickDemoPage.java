package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class DoubleClickDemoPage {
	public ConfigFileReader configFileReader;
	public DoubleClickDemoPage doubleclickdemoPage;

	/* Retrieve Element */

	@FindBy(how = How.ID, using = "doubleClickBtn")
	public static WebElement btnDC;
	@FindBy(how = How.XPATH, using = "//p[@id='doubleClickMessage']")
	public static WebElement msgDoubleClick;
	
	

	public DoubleClickDemoPage() {
		PageFactory.initElements(Setup.getDriver(), this);
}
}