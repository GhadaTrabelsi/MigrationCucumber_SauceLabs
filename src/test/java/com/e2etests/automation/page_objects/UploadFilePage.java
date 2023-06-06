package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class UploadFilePage {
	
	public ConfigFileReader configFileReader;
	public UploadFilePage uploadFilePage;
	
	/* Retrieve Element */

	@FindBy(how = How.ID, using = "uploadfile_0")
	public  WebElement uploadFile;
	@FindBy(how = How.ID, using = "terms")
	public  WebElement checkBox;
	@FindBy(how = How.ID, using = "submitbutton")
	public  WebElement submitBtn;
	
	
	public  UploadFilePage() {
		
		PageFactory.initElements(Setup.getDriver(),this);
		
	}

}
