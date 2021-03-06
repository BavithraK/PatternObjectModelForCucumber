package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	
	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.LINK_TEXT,using = "Create Lead")
	private WebElement eleClickCreateLead;
	
	public CreateLead ClickCreateLead() {
	click(eleClickCreateLead);
	return new CreateLead();
			
	}
	
	
	
	
	

}
