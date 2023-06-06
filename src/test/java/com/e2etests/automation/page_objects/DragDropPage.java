package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class DragDropPage {
	
	public ConfigFileReader configFileReader;
	public DragDropPage dragdropPage;

	/* Retrieve Element */

	@FindBy(how = How.ID, using = "draggable")
	public  WebElement from;
	@FindBy(how = How.ID, using = "droppable")
	public  WebElement to;
	
	
	
	public DragDropPage()
	{
		PageFactory.initElements(Setup.getDriver(), this);

	
	}

}
