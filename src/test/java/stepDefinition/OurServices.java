package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utilitiez.Driver;
import Utilitiez.commonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OurServices extends commonMethods {

	@When("I click on the Our Services button on the Top header")
	public void i_click_on_the_button_on_the_top_header() {
		hp.ourServicesLink.click();

	}

	@Then("I should see the following services being offered:")
	public void iShouldSeeTheFollowingServicesBeingOffered(List<String> expectedServices) {	
		    // Get the text content of the list of services
		    List<WebElement> serviceElements = Driver.getDriver().findElements(By.xpath(("//span[@style=\"font-size:20px;\"]")));

		    // Check if all expected services are present on the page
		    for (int i = 0; i < expectedServices.size(); i++) {
		        String expectedService = expectedServices.get(i);
		        WebElement actualServiceText = serviceElements.get(i);
		    	System.out.println(expectedService+"|"+actualServiceText.getText());
		        // Check if the text of the actual service element matches the expected service
		        Assert.assertTrue(actualServiceText.getText().contains(expectedService), 
		        		"Service '" + expectedService + "' is not found.");
		    }
		}
}
