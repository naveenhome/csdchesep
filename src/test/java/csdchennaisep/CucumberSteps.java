package csdchennaisep;

import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps extends TestCase{
	Prescription pres = new Prescription();
	String button;
	@Given("^\"([^\"]*)\" want to upload new prescription$")
	public void input(String pName) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    pres.setpName(pName);
	}

	@When("^\"([^\"]*)\" selected \"([^\"]*)\"$")
	public void selected(String pName, String fileName) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		pres.setFileName(fileName);
	}

	@When("^Click on \"([^\"]*)\"$")
	public void Click_on(String button) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		this.button = button;
	}

	@Then("^\"([^\"]*)\" displayed$")
	public void displayed(String message) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		if(button.equals("Record"))
		{
			PrescriptionBLL obj = new PrescriptionBLL();
			assertEquals(message, obj.validate(pres));
			
		}
	}


}
