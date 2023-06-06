package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class DropdownListDemoPage {
	public ConfigFileReader configFileReader;
	public DropdownListDemoPage dropdownlistdemoPage;

	/* Retrieve Element */

	@FindBy(how = How.ID, using = "oldSelectMenu")
	public  WebElement selectmenu ;

	@FindBy(how = How.XPATH, using = "//Option[@value='4']")
	public  WebElement PURPLE ;
     @FindBy(how = How.XPATH, using = "//option[@value='5']")
	public  WebElement Black ;
     @FindBy(how = How.XPATH, using = "//option[@value='red']")
 	public  WebElement Red ; 
     
	public DropdownListDemoPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}
	

}
