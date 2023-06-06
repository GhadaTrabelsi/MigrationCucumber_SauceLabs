package com.e2etests.automation.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class FramePage {
	public ConfigFileReader configFileReader;
	public FramePage framePage;

	/* Retrieve Element */
    public By img = By.cssSelector("img[src='Jmeter720.png']");
    @FindBy(how = How.CSS, using = "img[src='Jmeter720.png']")
	public  WebElement linkImg;
	

	public FramePage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}
	
	
}
