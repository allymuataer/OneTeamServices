package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitiez.Driver;

public class bookStorePage {

	public bookStorePage() {

		PageFactory.initElements(Driver.getDriver(), this);

	}

	@FindBy(id = "searchBox")

	public WebElement searchBox;

	@FindBy(id = "basic-addon2")

	public WebElement searchButton;

	@FindBy(xpath = "//a[@href=\"/books?book=9781449325862\"]")

	public WebElement bookTitleText;

	@FindBy(id = "see-book-Git Pocket Guide")

	public WebElement bookButton;

	@FindBy(id = "userName-value")

	public WebElement bookDescrip;
	
	@FindBy(id = "login")

	public WebElement loginButton;

	@FindBy(id = "userName")

	public WebElement userNameField;

	@FindBy(id = "password")

	public WebElement passwordField;
	
	@FindBy(id = "addNewRecordButton")

	public WebElement addCollectionButton;
	

}
