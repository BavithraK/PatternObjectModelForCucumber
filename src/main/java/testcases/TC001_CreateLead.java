package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_CreateLead";
		testDescription="login and logout in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Gopi";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	//public void loginAndLogout(String uName,String pwd) {
		public void loginAndLogout(String uName,String pwd,String cName,String fName,String lName) {
		
		new LoginPage().enterUserName(uName).enterPassword(pwd).clickLogIn().ClickCrmsfa().ClickLeads().ClickCreateLead().enterCompanyName(cName).enterFirstName(fName).enterLastName(lName).clickCreateLeadSubmit();
	}

}
