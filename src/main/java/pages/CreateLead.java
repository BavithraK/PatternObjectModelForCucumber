package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.ID, using = "createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	public CreateLead enterCompanyName(String data) {
	type(eleCompanyName,data);
	return this;
			
	}
	
	@FindBy(how=How.ID, using = "createLeadForm_firstName")
	private WebElement eleFirstName;
	
	public CreateLead enterFirstName(String data) {
	type(eleFirstName,data);
	return this;
			
	}
	
	@FindBy(how=How.ID, using = "createLeadForm_lastName")
	private WebElement eleLastName;
	
	public CreateLead enterLastName(String data) {
	type(eleLastName,data);
	return this;
	}
	@FindBy(how=How.NAME, using = "submitButton")
	private WebElement eleClickCreateLead;
	
	public ViewLead clickCreateLeadSubmit() {
	click(eleClickCreateLead);
	return new ViewLead();
			
	}
	
	

}
