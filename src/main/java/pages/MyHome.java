package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyHome extends ProjectMethods{
	
	public MyHome() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	
	@FindBy(how=How.LINK_TEXT,using = "Leads")
	private WebElement eleClickLeads;
	
	public void ClickLeads() {
	click(eleClickLeads);
		//return 		
	}
	
	
	
	
	

}
