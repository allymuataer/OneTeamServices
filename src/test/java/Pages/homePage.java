package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitiez.Driver;

public class homePage {

	public homePage() {

		PageFactory.initElements(Driver.getDriver(), this);

	}
	@FindBy(id = "comp-kpz2sysg2")
	public WebElement ourServicesLink;
	

	

}
